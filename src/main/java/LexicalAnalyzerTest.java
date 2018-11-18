import java.util.ArrayList;

public class LexicalAnalyzerTest {

    @org.junit.Test
    public void test0() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        ArrayList<Token> result = lexicalAnalyzer.getToken("(i+i)*hkj");
        if(result != null){
            syntaxAnalyzer.analyze(result);
        }
    }

    @org.junit.Test
    public void test1() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        ArrayList<Token> result = lexicalAnalyzer.getToken("abc+bcd*cde");
        if(result != null){
            syntaxAnalyzer.analyze(result);
        }
    }
    @org.junit.Test
    public void test2() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        ArrayList<Token> result = lexicalAnalyzer.getToken("ee*abcde+aaa");
        if(result != null){
            syntaxAnalyzer.analyze(result);
        }
    }
    @org.junit.Test
    public void test3_syntax_error() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        ArrayList<Token> result = lexicalAnalyzer.getToken("()");
        if(result != null){
            syntaxAnalyzer.analyze(result);
        }
    }
    @org.junit.Test
    public void test4_lexical_error() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        ArrayList<Token> result = lexicalAnalyzer.getToken("1a+2b");
        if(result != null){
            syntaxAnalyzer.analyze(result);
        }
    }

}