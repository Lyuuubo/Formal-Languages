# Title
An interpreter of integer expressions.

# Project Overview
In this project we implemented an interpreter of integer expressions. 
Initially we had a base project but we ampliated it by implementing the power function and the error control for the division by 0.
The steps that we followed basically are the following ones:
1. Install antlr4.
2. Modify IntExpr.g4 where there basically is all the sintax rules that the compiler follows.
3. Then we proceeded to update all the files of the interpreter by executing the command "antlr4 -no-listener -visitor IntExpr.g4".
4. We ampliated the classes that referenciate the visitors, so we could link them to IntExpr.java and specify it's behaviour.
5. Finally to corroborate it's correct operability we updated the tests, this are the scenarios that we checked:
    · Division by 0
    · A normal case of pow in which everything should go good.
    · A case in which we used some more complex expressions with pow.

# Member 's contribution
We basically did everything together in one day so it would have sense to assignate tasks to each member. Here we have the contributors:
- Lyubomyr Grygoriv
- Satxa Fortuny
- Raúl Garcia

# What we have learned
We learned the structure of an interpreter and how to modify it's behaviour, by adding some new features.
