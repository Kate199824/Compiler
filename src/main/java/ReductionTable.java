import java.util.ArrayList;

public class ReductionTable {

    private ArrayList<Reduction> reductionTable;

    public ReductionTable(){
        ArrayList<String> right0 = new ArrayList<String>();
        right0.add("E");
        Reduction reduction0 = new Reduction("E'", right0);

        ArrayList<String> right1 = new ArrayList<String>();
        right1.add("E");
        right1.add("+");
        right1.add("E");
        Reduction reduction1 = new Reduction("E", right1);
        
        ArrayList<String> right2 = new ArrayList<String>();
        right2.add("E");
        right2.add("*");
        right2.add("E");
        Reduction reduction2 = new Reduction("E", right2);

        ArrayList<String> right3 = new ArrayList<String>();
        right3.add("(");
        right3.add("E");
        right3.add(")");
        Reduction reduction3 = new Reduction("E", right3);

        ArrayList<String> right4 = new ArrayList<String>();
        right4.add("id");
        Reduction reduction4 = new Reduction("E", right4);

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
