import java.util.ArrayList;
import java.util.Map;

public class PPT {

    private ArrayList<ArrayList<Operation>> ppt;

   public PPT(){
       ArrayList<Operation> state0 = new ArrayList<Operation>();
       state0.add(new Operation(Operation.MOVE_IN, 3));//id
       state0.add(new Operation(-1, -1));//+
       state0.add(new Operation(-1,-1));//*
       state0.add(new Operation(Operation.MOVE_IN,2));//(
       state0.add(new Operation(-1,-1));//)
       state0.add(new Operation(-1,-1));//$
       state0.add(new Operation(Operation.GO_TO,1));//E

       ArrayList<Operation> state1 = new ArrayList<Operation>();
       state0.add(new Operation(-1,-1));//id
       state0.add(new Operation(Operation.MOVE_IN,4));//+
       state0.add(new Operation(Operation.MOVE_IN,5));//*
       state0.add(new Operation(-1,-1));//(
       state0.add(new Operation(-1,-1));//)
       state0.add(new Operation(Operation.REDUCE, 0));//$
       state0.add(new Operation(-1,-1));//E

       ArrayList<Operation> state2 = new ArrayList<Operation>();
       state0.add(new Operation(Operation.MOVE_IN,3));//id
       state0.add(new Operation(-1,-1));//+
       state0.add(new Operation(-1,-1));//*
       state0.add(new Operation(Operation.MOVE_IN,2));//(
       state0.add(new Operation(-1,-1));//)
       state0.add(new Operation(-1,-1));//$
       state0.add(new Operation(Operation.GO_TO,6));//E

       ArrayList<Operation> state3 = new ArrayList<Operation>();
       state0.add(new Operation(-1,-1));//id
       state0.add(new Operation(Operation.REDUCE,4));//+
       state0.add(new Operation(Operation.REDUCE,4));//*
       state0.add(new Operation(-1,-1));//(
       state0.add(new Operation(Operation.REDUCE,4));//)
       state0.add(new Operation(Operation.REDUCE,4));//$
       state0.add(new Operation(-1,-1));//E

       ArrayList<Operation> state4 = new ArrayList<Operation>();
       state0.add(new Operation(Operation.MOVE_IN, 3));//id
       state0.add(new Operation(-1, -1));//+
       state0.add(new Operation(-1,-1));//*
       state0.add(new Operation(Operation.MOVE_IN,2));//(
       state0.add(new Operation(-1,-1));//)
       state0.add(new Operation(-1,-1));//$
       state0.add(new Operation(Operation.GO_TO,7));//E

       ArrayList<Operation> state5 = new ArrayList<Operation>();
       state0.add(new Operation(Operation.MOVE_IN, 3));//id
       state0.add(new Operation(-1, -1));//+
       state0.add(new Operation(-1,-1));//*
       state0.add(new Operation(Operation.MOVE_IN,2));//(
       state0.add(new Operation(-1,-1));//)
       state0.add(new Operation(-1,-1));//$
       state0.add(new Operation(Operation.GO_TO,8));//E

       ArrayList<Operation> state6 = new ArrayList<Operation>();
       state0.add(new Operation(-1,-1));//id
       state0.add(new Operation(Operation.MOVE_IN,4));//+
       state0.add(new Operation(Operation.MOVE_IN,5));//*
       state0.add(new Operation(-1,-1));//(
       state0.add(new Operation(Operation.MOVE_IN,9));//)
       state0.add(new Operation(-1,-1));//$
       state0.add(new Operation(-1,-1));//E

       ArrayList<Operation> state7 = new ArrayList<Operation>();
       state0.add(new Operation(-1,-1));//id
       state0.add(new Operation(Operation.REDUCE,1));//+
       state0.add(new Operation(Operation.MOVE_IN,5));//*
       state0.add(new Operation(-1,-1));//(
       state0.add(new Operation(Operation.REDUCE,1));//)
       state0.add(new Operation(Operation.REDUCE,1));//$
       state0.add(new Operation(-1,-1));//E

       ArrayList<Operation> state8 = new ArrayList<Operation>();
       state0.add(new Operation(-1,-1));//id
       state0.add(new Operation(Operation.REDUCE,2));//+
       state0.add(new Operation(Operation.REDUCE,2));//*
       state0.add(new Operation(-1,-1));//(
       state0.add(new Operation(Operation.REDUCE,2));//)
       state0.add(new Operation(Operation.REDUCE,2));//$
       state0.add(new Operation(-1,-1));//E

       ArrayList<Operation> state9 = new ArrayList<Operation>();
       state0.add(new Operation(-1,-1));//id
       state0.add(new Operation(Operation.REDUCE,3));//+
       state0.add(new Operation(Operation.REDUCE,3));//*
       state0.add(new Operation(-1,-1));//(
       state0.add(new Operation(Operation.REDUCE,3));//)
       state0.add(new Operation(Operation.REDUCE,3));//$
       state0.add(new Operation(-1,-1));//E

       ppt = new ArrayList<ArrayList<Operation>>();
       ppt.add(state0);
       ppt.add(state1);
       ppt.add(state2);
       ppt.add(state3);
       ppt.add(state4);
       ppt.add(state5);
       ppt.add(state6);
       ppt.add(state7);
       ppt.add(state8);
       ppt.add(state9);
   }

    public ArrayList<ArrayList<Operation>> getPpt() {
        return ppt;
    }


    public Operation getItem(int state, int token){
       return ppt.get(state).get(token);
    }
}
