package quizz;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //create new scanner
		
		int score = 0; //initialize score
		
		//QUESTIONS
		//LEVEL: EASY
		String[] easyQuestions = {"What does BNF stand for?", //Q1
				"What's the name of the no.1 supercomputer in the world?", //Q2
				"Combining two or more propositions using logical expressions is a:" //Q3
				};
		
		//LEVEL: MEDIUM
		String[] mediumQuestions = {"What does it mean if two algorithms are semantically the same?", //Q1
				"What is the Von Neuman Bottleneck", //Q2
				"What is tautology?"//Q3
		  		};
		
		//LEVEL: DIFFICULT
		String[] hardQuestions = {"What equivalence relation is this? (x,y) and (y,z) imply (x,z)",//Q1
				"Which generation of computers were computers based on intergrated circuits?",//Q2
				"When is a matrix invertible?" //Q3
				};
		
		
		//POTENTIAL ANSWERS
		//LEVEL: EASY
		String[] easyPotAnswers = {"(A) Brand New Function  (B) Brendan Nor Form  (C) Backus Naur Format  (D) Bring Nine Forward", //(C)
				"(A) Cray  (B) Frontier (C) Kay  (D) Summit", //(B)
				"(A) Compound proposition  (B) Propositional variable  (C) Conjunction Variable  (D) Propositional Quantifier" //(A)
				};
		
		//LEVEL: MEDIUM
		String[] mediumPotAnswers = {"(A) Code is identical  (B) Code is similar  (C) Stored in same location  (D) Output is the same", //(D)
				"(A) CPU is idle  (B) CPU overheats  (C) Insufficient storage  (D) ALU doesn't cooperate with CU", //(A)
				"(A) Compoud proposition that is always false  (B) Compoud propositon that is always true  (C) Undefined variable  (D) Error in a truth table", //(B)
				};
		
		//LEVEL: DIFFICULT
		String[] hardPotAnswers = {"(A) Symmetry  (B) Transitivity  (C) Reflexivity  (D) Asymmetry", //(B)
				"(A) 1  (B) 2  (C) 3  (D) 4", //(C)
				"(A) When all the values are the same  (B) When the sum of the values is an even number  (C) When the sum of values is an odd number  (D) When the determinant is 0" //(D)
				};
		
		
		//CORRECT ANSWERS
		//A => 1
		//B => 2
		//C => 3
		//D => 4
		
		//LEVEL: EASY
		int[] easyCorAnswers = {3,2,1};
		
		//LEVEL: MEDIUM
		int[] mediumCorAnswers = {4,1,2};
		
		//LEVEL: DIFFICULT
		int[] hardCorAnswers = {2,3,4};
		
		
	
		
		System.out.println("Welcome to ISE quiz. Please choose your level of difficulty. (1 = Easy/ 2 = Medium/ 3 = Difficult");
		int difficulty = input.nextInt();
		if (difficulty == 1) {
			String level[] = easyQuestions;
			String potAnswers[] = easyPotAnswers;
			int correctAnswers[] = easyCorAnswers;
		}
		else if (difficulty == 2) {
			String level[] = mediumQuestions;
			String potAnswers[] = mediumPotAnswers;
			int correctAnswers[] = mediumCorAnswers;
		}
		else if (difficulty == 3) {
			String level[] = hardQuestions;
			String potAnswers[] = hardPotAnswers;
			int correctAnswers[] = hardCorAnswers;
		}

		
		String userInput = null;
		for(int i = 0; i < 3; i++) {
			System.out.println(easyQuestions[i]);
			System.out.println(easyPotAnswers[i]);
			System.out.println("Please select an answers: (A/B/C/D)");
			userInput = input.next();
		
		
		int userChoice = 0;
		if (userInput.equals("A")) {
			userChoice = 1;
		}
		else if (userInput.equals("B")) {
			userChoice = 2;
		}
		else if (userInput.equals("C")) {
			userChoice = 3;
		}
		else if (userInput.equals("D")) {
			userChoice = 4;
		}
		
		if(userChoice == easyCorAnswers[i]) {
			score++;
		}
		}
		System.out.println("Your score is " + score + "/3");
		System.out.println("Thank you for playing :)");
	}
}		

	


