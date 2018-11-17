import java.util.ArrayList;

public class Reduction {
    private String left;
    private ArrayList<String> right;

    public Reduction(String left, ArrayList<String> right) {
        this.left = left;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public ArrayList<String> getRight() {
        return right;
    }

    public void setRight(ArrayList<String> right) {
        this.right = right;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(left);
        stringBuilder.append(" -> ");
        for (String r : right) {
            stringBuilder.append(r + " ");
        }
        return stringBuilder.toString();
    }
}