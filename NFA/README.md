# Title
NFA Recognizer.

# Project Overview
In this project, we started from the basis of the DFA. The general behavior of this new recognizer goes like this:
1. The accept method calls an extra method that works in a recursive way.
2. The method checks if the string is empty.
3. What has to be checked next is if there is an epsilon, in which case we will basically call the same method without consuming a state, whereas if we have a character, we will consume it.

# Member 's contribution

- Lyubomyr Grygoriv
    - NFA Logic
    - NFA Member 1
- Satxa Fortuny
    - NFA Logic
    - NFA Member 2
- Raúl Garcia
    - NFA Logic
    - NFA Member 3