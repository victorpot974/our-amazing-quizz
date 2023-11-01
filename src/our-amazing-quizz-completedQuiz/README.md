# our-amazing-quizz
Work realised for the EPIC endeavour (Block 1 of ISE)

## Conventions for the project :

- use of camelCase for all variables, methods and class names
- class names always start with an upper case letter on top of that
- use of comments : briefly desribe each file (what it is for, version, team members contribution) at the beginning of the file
- use of comments : at the beginning of every method (describing what is the method for)
- compulsory use of getters and setters, whenever a new variable is declared, write the getter and the setter associated to it.
- use meaningful names for variables (names like a, b, t2 are prohibited)
- variable names for lists / collections of elements always end with an "s" (plural)

## Files of the project : 

- Main : contains main method. Contains the code that will actually be run. **Mandatory**

- QuestionMaster : class that handles questions and answers (reads quizz file, get player's answer, displays questions, checks answer) **Mandatory**

- GraphicUserInterface :  class that displayes a GUI for the users and listens to events

- FileManager : intermediary class that performs general operations of files (reading, writing etc...)

## Format of the quizz file :

There must be an empty line between each question. Each possible answer starts with a tabulation. If a question features only one possible answer then it is a text input question (player won't be shown multiple answers to choose from, instead he will have to give the correct answer in a textbox). Example of proper quizz file format:


```
Question 1
  Answer A
  Answer B
  Answer C
  Answer D

Question 2
  Answer A
  Answer B
  Answer C
  Answer D

Question 3
  Answer
```
