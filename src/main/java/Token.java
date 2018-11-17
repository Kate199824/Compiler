public class Token {

    private int type;
    private String content;

    public static final int PLUS = 1;
    public static final int MULTIPLY = 2;
    public static final int PARENTHESES_LEFT = 3;
    public static final int PARENTHESES_RIGHT = 4;
    public static final int IDENTIFIER = 0;
    public static final int DOLLAR_R = 5;
    public static final int E = 6;


    public Token(int type, String content) {
        this.type = type;
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "<"+type+":"+content+">";
    }
}
