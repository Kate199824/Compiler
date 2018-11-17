import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

import java.util.ArrayList;
import java.util.Stack;

public class SyntaxAnalyzer {

    public void analyze(ArrayList<Token> tokenList) {
        PPT ppt = new PPT();
        ReductionTable reductionTable = new ReductionTable();

        Stack<Token> tokenStack = new Stack<Token>();
        Stack<Integer> stateStack = new Stack<Integer>();
        tokenStack.push(new Token(-1, "$"));
        stateStack.push(0);

        int pointer = 0;

        while(true){
            Token token = tokenList.get(pointer);
            Operation operation = ppt.getItem(stateStack.peek(), token.getType());

            if(operation.getType() == Operation.MOVE_IN){
                //move in
                stateStack.push(operation.getValue());
                tokenStack.push(token);
                pointer++;
            }
            else if(operation.getType() == Operation.REDUCE){
               //reduce
                Reduction reduction = reductionTable.getReduction(operation.getValue());
                if(operation.getValue() == 0){
                    //success
                    System.out.println("SUCCESS");
                    break;
                }
                for(int i=0;i<reduction.getRight().size();i++){
                    stateStack.pop();
                    tokenStack.pop();
                }
                Token vn = new Token(Token.E, "E");
                tokenStack.push(vn);
                state

            }

        }
    }
}
