/*A class that models NFAs. States are just strings while labels
 * are characters. 
 */
import java.util.LinkedList;
import java.util.List;

public class NFA {
    private class Node{
        public String state;
        public boolean isInitial;
        public boolean isLast;
        public List<Transition> listTransitions;
        public boolean hasEpsilon;

        public Node(String state, boolean init, boolean fin){
            this.state = state;
            this.isInitial = init;
            this.isLast = fin;
            listTransitions = new LinkedList<>();
            hasEpsilon = false;
        }

        public String getState(){
            return state;
        }
    }

    private class Transition{
        public Node toNode;
        public Character input;

        public Transition(Character input, Node toNode){
            this.input = input;
            this.toNode = toNode;
        }
    }

    private List<Node> statesNFA;
    private Node initial;
    
    /*
     * A constructor that builds a NFA with the set of state names
     * given as arguments.
     */
    public NFA(String[] stateList) {
        this.statesNFA = new LinkedList<>();
        for(String state:stateList){
            statesNFA.add(new Node(state, false, false));
        }
    }


    // Method that adds a non-epsilon transition.
    public void addTransition(String currentState, char label, String nextState) {
        Node init = this.statesNFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(currentState))
                    .findFirst().get();
        Node toNode = this.statesNFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(nextState))
                    .findFirst().get();
        init.listTransitions.add(new Transition(label, toNode));
    }

    // Method that adds an epsilon transition.
    public void addEpsilonTransition(String currentState, String nextState) {
        Node init = this.statesNFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(currentState))
                    .findFirst().get();
        Node toNode = this.statesNFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(nextState))
                    .findFirst().get();
        init.listTransitions.add(new Transition('$', toNode));
        init.hasEpsilon = true;
    }

    /* Mark a state in the DFA as final */
    public void addFinalState(String text) {
        Node init = this.statesNFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(text))
                    .findFirst().get();
        init.isLast = true;
    }

    /* Establish the initial state */
    public void setInitialState(String text) {
        this.initial = this.statesNFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(text))
                    .findFirst().get();
        this.initial.isInitial = true;
    }

    /*
     * Given an input string, this method outputs true if the NFA accepts it.
     * Otherwise it outputs false.
     */
    public boolean accept(String string) {
        return this.acceptAux(this.initial, string);
    }

    private boolean acceptAux(Node current, String string){
        if (string.isEmpty() && !current.hasEpsilon){
            return current.isLast;
        }
        else {
            Character transition;
            if (!string.isEmpty()) transition = string.charAt(0);
            else transition = '$';
            List<Transition> nextNode = this.nextNodes(current, transition);
            if (nextNode.isEmpty()) return false;
            for (Transition tran:nextNode){
                if (tran.input.equals('$') && this.acceptAux(tran.toNode, string)) return true;
                if (!tran.input.equals('$') && this.acceptAux(tran.toNode, string.substring(1))) return true;
            }
        }
        return false;
    }

    private List<Transition> nextNodes(Node current, Character input){
        List<Transition> next = new LinkedList<>();
        for (Transition t:current.listTransitions){
            if (t.input.equals(input) || t.input.equals('$')) next.add(t);
        }
        return next;
    }
}
