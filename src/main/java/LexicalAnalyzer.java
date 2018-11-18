import java.util.ArrayList;
import java.util.Stack;

public class LexicalAnalyzer {

    PPT ppt = new PPT();

    public ArrayList<Token> getToken(String input){
        ArrayList<Token> result = new ArrayList<Token>();

        char[] cs = input.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            switch (cs[i]) {
                case '(':
                    result.add(new Token(Token.PARENTHESES_LEFT, "("));
                    break;
                case ')':
                    result.add(new Token(Token.PARENTHESES_RIGHT, ")"));
                    break;
                case '*':
                    result.add(new Token(Token.MULTIPLY, "*"));
                    break;
                case '+':
                    result.add(new Token(Token.PLUS, "+"));
                    break;
                default:
                    if (cs[i] <= 'z' && cs[i] >= 'a') {

                        for (int j = i; j < cs.length; j++) {
                            if (cs[j] >= '0' && cs[j] <= '9' || cs[j] >= 'a' && cs[j] <= 'z') {
                                if (j == cs.length - 1) {
                                    result.add(new Token(Token.IDENTIFIER, input.substring(i)));
                                    i = j;
                                    break;
                                }
                            }
                            else {
                                result.add(new Token(Token.IDENTIFIER, input.substring(i, j)));
                                i = j - 1;
                                break;
                            }
                        }
                    } else {
                        //exception
                        System.out.println("Lexical error");
                        return null;
                    }
                    break;
            }
        }


        result.add(new Token(Token.DOLLAR_R, "$R"));
        return result;
    }
}
