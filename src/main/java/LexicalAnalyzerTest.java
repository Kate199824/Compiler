import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LexicalAnalyzerTest {

    @org.junit.Test
    public void getToken() {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
        SyntaxAnalyzer syntaxAnalyzer = new SyntaxAnalyzer();

        ArrayList<Token> result = lexicalAnalyzer.getToken("(i+i)*hkj");
        syntaxAnalyzer.analyze(result);
        
    }
}