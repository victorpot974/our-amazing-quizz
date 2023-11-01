# our-amazing-quizz
Work realised for the EPIC endeavour (Block 1 of ISE)

## Conventions for the project :

- use of camelCase for all variables, methods and class names
- class names always start with an upper case letter on top of that
- use of comments : briefly desribe each file (what it is for, version, team members contribution) at the beginning of the file
- use of comments : at the beginning of every method (describing what is the method for)
- compulsory use of getters and setters, whenever a new variable is declared, write the getter and the setter associated to it.
- use meaningful names for variables (names like a, b, t2 are prohibited)

## Files of the project : 

- Main : contains main method. Contains the code that will actually be run. **Mandatory**

- InputManager : manages user input

- OutputManager : manages login CLI

- CustomTimer : a timer used to calculate a points score when answering correctly a question. 

- FileManager : intermediary class that performs general operations of files (reading, writing etc...)

- Account : represents an user account (username, password, score data)

- Logon : system allowing the user to sign in / sign up and manages all the accounts

- Utilities : General purpose methods not necessarily directly related to the project

- Quiz : The core quizz (GUI and event management)

- Stats : mathematical functions used to calculate stats (mean / standard deviation)

## Format of the .acc account file :

File name must be in the format <username>.acc where <username> is the account's username. These files contain only 2 lines. The first line should be the account's password. The second should contain the account's points score data, where each score entry is separated by a semi-colon (";").


```
Example for an account with username "alpha", password "qW12345%", and scores obtained are 560, 1200, and 870 :

File name : alpha.acc

File content:

qW12345%
560;1200;870
```
