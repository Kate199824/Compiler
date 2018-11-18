import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.ArrayList;
import java.util.Stack;

public class SyntaxAnalyzer {

    PPT ppt = new PPT();
    ReductionTable reductionTable = new ReductionTable();

    public void analyze(ArrayList<Token> tokenList) {

        Stack<Token> tokenStack = new Stack<Token>();
        Stack<Integer> stateStack = new Stack<Integer>();
        tokenStack.push(new Token(Token.DOLLAR_R, "$"));
        stateStack.push(0);

        int state = 0;

        for (int i = 0; i < tokenList.size(); i++) {
            Token token = tokenList.get(i);
            Operation operation = ppt.getItem(state, token.getType());
            if (operation.getType() == -1) {
                //throw exception
                System.out.println("Syntax error!");
                break;
            } else {
                switch (operation.getType()) {
                    case Operation.MOVE_IN:
                        tokenStack.push(token);
                        state = operation.getValue();
                        stateStack.push(state);
                        break;
                    case Operation.REDUCE:
                        Reduction reduction = reductionTable.getReduction(operation.getValue());
                        System.out.println(reduction);
                        if (operation.getValue() == 0) {
                            break;
                        }

                        int len = reduction.getRight().size();
                        for (int j = 0; j < len; j++) {
                            tokenStack.pop();
                            stateStack.pop();
                        }
                        token = new Token(Token.E, "E");
                        tokenStack.push(token);
                        state = stateStack.peek();

                        //goto
                        operation = ppt.getItem(state, token.getType());
                        if (operation.getType() != Operation.GO_TO) {
                            //exception
                        }
                        state = operation.getValue();
                        stateStack.push(state);
                        i--; //状态不能改变
                        break;
                    default:
                        //exception
                        System.out.println("Syntax error!");
                        break;
                }
            }
        }
    }
}
