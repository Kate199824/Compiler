import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayList<Token> tokenList = lexicalAnalyzer.getToken(input);


    }
}
