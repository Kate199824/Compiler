import java.util.ArrayList;

public class Reduction {
    private ArrayList<String> left;
    private ArrayList<String> right;

    public Reduction(ArrayList<String> left, ArrayList<String> right) {
        this.left = left;
        this.right = right;
    }

    public ArrayList<String> getLeft() {
        return left;
    }

    public void setLeft(ArrayList<String> left) {
        this.left = left;
    }

    public ArrayList<String> getRight() {
        return right;
    }

    public void setRight(ArrayList<String> right) {
        this.right = right;
    }
}