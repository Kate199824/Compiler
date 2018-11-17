public class Operation {
    public static final int MOVE_IN = 1;
    public static final int REDUCE = 2;
    public static final int GO_TO = 3;

    private int type;
    private int value;

    public Operation(int type, int value) {
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
