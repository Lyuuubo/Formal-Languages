/*A class that models NFAs. States are just strings while labels
 * are characters. 
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.parse.ANTLRParser.actionScopeName_return;

public class NFA {
    private class Node{
        public String state;
        public boolean isInitial;
        public boolean isLast;
        public List<Transition> listTransitions;

        public Node(String state, boolean init, boolean fin){
            this.state = state;
            this.isInitial = init;
            this.isLast = fin;
            listTransitions = new LinkedList<>();
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
    private boolean valid;
    
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
        valid = false;
        this.acceptAux(this.initial, string);

        return valid;
    }

    private void acceptAux(Node current, String string){
        Node currentNode = current;
        String left = "";
        for (int i = 0; i < string.length(); i++){
            Character transition = string.charAt(i);
            if (i < string.length()-1) left = string.substring(i+1);
            else left = null;
            currentNode = this.nextNodes(currentNode, transition, left);
            if (currentNode == null) break;
            if (valid) break;
        }
        if (currentNode.isLast) valid = true;
    }
    
    private Node nextNodes(Node current, Character input, String left){
        if (left != null){
            Node epsilonNode = null;
        } 
        for (Transition t:current.listTransitions){
            if (t.input.equals(input)) return t.toNode;
        }
        return null;
    }

}
