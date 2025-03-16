# Title
DFA Recognizer.

# Project Overview
In this project we implemented a Java program that recognizes DFAs through an archive and analizes if the string given by another archive is accepted.
The structure of the project is the following:
- DFA Class. We keep the whole DFA, represented in the form of a list of nodes and also the initial node.
    - Node Class. Where we keep the information about each state. That information being its state, if it's the initial o one of the final states and the list of transitions.
    - Transition Class. The operation of moving from one to another Node. 
    - setInitialState method. Having the initial State, this method searches the node corresponding that state to set its initial value to true.
    - addFinalState method. Same as setInitialState but for the final State.
    - addTransition method. A method that allows to add a transition from one state to another one, finding the node related to it and adding it to its list.
    - accept method. A method to check if the given String is accepted by the DFA. It's basically a while that follows the transitions list of the Nodes, if one of them is null it means that the String ends in a Trash state.
    - nextNodes method. Gets the pointer to another Node following the String.


# Member 's contribution

- Lyubomyr Grygoriv
    - DFA Logic
    - DFA Member 2
- Satxa Fortuny
    - DFA Logic
    - DFA Member 3
- Raúl Garcia
    - DFA Logic
    - DFA Member 1