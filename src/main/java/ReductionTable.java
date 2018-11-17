import java.util.ArrayList;

public class ReductionTable {

    private ArrayList<Reduction> reductionTable;

    public ReductionTable(){
        ArrayList<String> left0 = new ArrayList<String>();
        ArrayList<String> right0 = new ArrayList<String>();
        left0.add("E'");
        right0.add("E");
        Reduction reduction0 = new Reduction(left0, right0);

        ArrayList<String> left1 = new ArrayList<String>();
        ArrayList<String> right1 = new ArrayList<String>();
        left1.add("E");
        right1.add("E");
        right1.add("+");
        right1.add("E");
        Reduction reduction1 = new Reduction(left0, right0);

        ArrayList<String> left2 = new ArrayList<String>();
        ArrayList<String> right2 = new ArrayList<String>();
        left1.add("E");
        right1.add("E");
        right1.add("*");
        right1.add("E");
        Reduction reduction2 = new Reduction(left0, right0);

        ArrayList<String> left3 = new ArrayList<String>();
        ArrayList<String> right3 = new ArrayList<String>();
        left1.add("E");
        right1.add("(");
        right1.add("E");
        right1.add(")");
        Reduction reduction3 = new Reduction(left0, right0);

        ArrayList<String> left4 = new ArrayList<String>();
        ArrayList<String> right4 = new ArrayList<String>();
        left0.add("E");
        right0.add("id");
        Reduction reduction4 = new Reduction(left0, right0);

        reductionTable = new ArrayList<Reduction>();
        reductionTable.add(reduction0);
        reductionTable.add(reduction1);
        reductionTable.add(reduction2);
        reductionTable.add(reduction3);
        reductionTable.add(reduction4);

    }

    public ArrayList<Reduction> getReductionTable() {
        return reductionTable;
    }

    //获得推导式
    public Reduction getReduction(int number){
        return  reductionTable.get(number);
    }
}
