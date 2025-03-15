
/*A class that models DFAs. States are just strings while labels
 * are characters. 
 */

import java.util.LinkedList;
import java.util.List;

public class DFA {
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
    /*A constructor that builds a DFA with the set of state names 
     * given as arguments. 
     */
    private List<Node> statesDFA;
    private Node initial;

    public DFA(String[] states) {
        //Your code goes here
        this.statesDFA = new LinkedList<>();
        for(String state:states){
            statesDFA.add(new Node(state, false, false));
        }
    }

    /*Establish the initial state  */
    public void setInitialState(String state) {
        // Your code goes here
        this.initial = this.statesDFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(state))
                    .findFirst().get();
        this.initial.isInitial = true;
    }

    /*Mark a state in the DFA as final*/
    public void addFinalState(String state) {
        // Your code goes here
        Node init = this.statesDFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(state))
                    .findFirst().get();
        init.isLast = true;
    }

    // Method that adds a transition. 
    public void addTransition(String state, Character input, String nextState) {
        Node init = this.statesDFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(state))
                    .findFirst().get();
        Node toNode = this.statesDFA.stream()
                    .filter(node -> node.getState().equalsIgnoreCase(nextState))
                    .findFirst().get();
        init.listTransitions.add(new Transition(input, toNode));
    }

    /*Given an input string, this method outputs tru if the DFA accepts it.
     * Otherwise it outputs false. 
     */
    public boolean accept(String input) {
        // Your code goes here
        Node currentNode = this.initial;
        for (int i = 0; i < input.length(); i++){
            Character transition = input.charAt(i);
            currentNode = this.nextNodes(currentNode, transition);
            if (currentNode == null) return false;
        }
        if (currentNode.isLast) return true;
        else return false;
    }
    
    private Node nextNodes(Node current, Character input){
        for (Transition t:current.listTransitions){
            if (t.input.equals(input)) return t.toNode;
        }
        return null;
    }

}
