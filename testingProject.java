package EPICProject;

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class testingProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create new scanner
		Random rand = new Random();
		Set<Integer> usedNumbers = new HashSet<>();
		usedNumbers.add(10);
		
		
		
		int score = 0; //initialize score
		
		//QUESTIONS
		//LEVEL: EASY
		String[] easyQuestions = {"What does BNF stand for?", //Q1
				"What's the name of the no.1 supercomputer in the world?", //Q2
				"Combining two or more propositions using logical expressions is a:",//Q3
				"What is a BDD?", //Q4
				"Which of those is NOT a subset of {x ∈ N|x ∉ N}?" //Q5
				
				};
		
		//LEVEL: MEDIUM
		String[] mediumQuestions = {"What does it mean if two algorithms are semantically the same?", //Q1
				"What is the Von Neuman Bottleneck", //Q2
				"What is tautology?", //Q3
				"What is the formal definition of a symmetric relation R ⊆ S x S?", //Q4
				"What is the formal definition of an injective function" //Q5
				
		  		};
		
		//LEVEL: DIFFICULT
		String[] hardQuestions = {"What equivalence relation is this? (x,y) and (y,z) imply (x,z)",//Q1
				"Which generation of computers were computers based on intergrated circuits?",//Q2
				"When is a matrix invertible?",//Q3
				"Which of these is a partial order relation?", //Q4
				"On an island where knights always tell the truth and knaves always lie, an inhabitant declares: 'If I am lying, then I am a knight'. Is that inhabitant a knight or knave?" //Q5 
				};
		
		//TOTAL
		String[] totalQuestions = {"What does BNF stand for?",
				"What's the name of the no.1 supercomputer in the world?",
				"Combining two or more propositions using logical expressions is a:",
				"What does it mean if two algorithms are semantically the same?",
				"What is the Von Neuman Bottleneck",
				"What is tautology?",
				"What equivalence relation is this? (x,y) and (y,z) imply (x,z)",
				"Which generation of computers were computers based on intergrated circuits?",
				"When is a matrix invertible?",
				"What is a BDD?",
				"Which of those is NOT a subset of {x ∈ N|x ∉ N}?",
				"What is the formal definition of a symmetric relation R ⊆ S x S?", 
				"What is the formal definition of an injective function",
				"Which of these is a partial order relation?", 
				"On an island where knights always tell the truth and knaves always lie, an inhabitant declares: 'If I am lying, then I am a knight'. Is that inhabitant a knight or knave?"
				};
		
		
		//POTENTIAL ANSWERS
		//LEVEL: EASY
		String[] easyPotAnswers = {"(A) Brand New Function  (B) Brendan Nor Form  (C) Backus Naur Format  (D) Bring Nine Forward", //(C)
				"(A) Cray  (B) Frontier (C) Kay  (D) Summit", //(B)
				"(A) Compound proposition  (B) Propositional variable  (C) Conjunction Variable  (D) Propositional Quantifier", //(A)
				"(A) A specific part of an algorithm that allows us to prove its correctness  (B) A language used to define grammar rules  (C) An endless recursion problem inside the definition of a syntax  (D) A data structure that represents a boolean function ", //(D)
				"(A) S = {3,2,8}  (B) S = {32, 128}  (C) S = {4, 8, 64}  (D) S = {Ø}" //(C)
				};
		
		//LEVEL: MEDIUM
		String[] mediumPotAnswers = {"(A) Code is identical  (B) Code is similar  (C) Stored in same location  (D) Output is the same", //(D)
				"(A) CPU is idle  (B) CPU overheats  (C) Insufficient storage  (D) ALU doesn't cooperate with CU", //(A)
				"(A) Compoud proposition that is always false  (B) Compoud propositon that is always true  (C) Undefined variable  (D) Error in a truth table", //(B)
				"(A) ∀ a,b ∈ S aRb => bRa  (B) ∀ a,b ∈ S aRb ^a ≠ b => bRa  (C) ∀ a,b ∈ S aRb ^ bRa => a =b  (D) ∀ a,b ∈ S aRb ^bRa => a≠b", //(A)
				"(A) ∀ b ∈ B ∃ a ∈ A.f(a) = b  (B) ∃ b ∈ B ∀ a ∈ A.f(a) ≤ b  (C) ∃ b ∈ B ∀ a ∈ A.f(a) ≥ b  (D) ∀ a, b ∈ A.f(a) = f(b) => a = b ",//(D)
				};
		
		//LEVEL: DIFFICULT
		String[] hardPotAnswers = {"(A) Symmetry  (B) Transitivity  (C) Reflexivity  (D) Asymmetry", //(B)
				"(A) 1  (B) 2  (C) 3  (D) 4", //(C)
				"(A) When all the values are the same  (B) When the sum of the values is an even number  (C) When the sum of values is an odd number  (D) When the determinant is 0", //(D)
				"(A) R = {(a,b),(b,b),(a,c),(b,c)}  (B) R = {(b,a),(a,c),(a,a),(b,c),(b,b),(c,c)}  (C) R = {(a,b),(a,a),(a,c),(b,c),(b,b),(c,c)  (D) R = {(a,a),(b,b),(c,c),(a,c),(c,b),(b,a)}", //(C)
				"(A) A knight  (B) A knave  (C) Could be both  (D) None of them" //(A)
				};
		
		//TOTAL
		String[] totalPotAnswers = {"(A) Brand New Function  (B) Brendan Nor Form  (C) Backus Naur Format  (D) Bring Nine Forward", //(C)
				"(A) Cray  (B) Frontier (C) Kay  (D) Summit", //(B)
				"(A) Compound proposition  (B) Propositional variable  (C) Conjunction Variable  (D) Propositional Quantifier", //(A)
				"(A) Code is identical  (B) Code is similar  (C) Stored in same location  (D) Output is the same", //(D)
				"(A) CPU is idle  (B) CPU overheats  (C) Insufficient storage  (D) ALU doesn't cooperate with CU", //(A)
				"(A) Compoud proposition that is always false  (B) Compoud propositon that is always true  (C) Undefined variable  (D) Error in a truth table", //(B)
				"(A) Symmetry  (B) Transitivity  (C) Reflexivity  (D) Asymmetry", //(B)
				"(A) 1  (B) 2  (C) 3  (D) 4", //(C)
				"(A) When all the values are the same  (B) When the sum of the values is an even number  (C) When the sum of values is an odd number  (D) When the determinant is 0",//(D)
				"(A) A specific part of an algorithm that allows us to prove its correctness  (B) A language used to define grammar rules  (C) An endless recursion problem inside the definition of a syntax  (D) A data structure that represents a boolean function ", //(D)
				"(A) S = {3,2,8}  (B) S = {32, 128}  (C) S = {4, 8, 64}  (D) S = {Ø}", //(C)
				"(A) ∀ a,b ∈ S aRb => bRa  (B) ∀ a,b ∈ S aRb ^a ≠ b => bRa  (C) ∀ a,b ∈ S aRb ^ bRa => a =b  (D) ∀ a,b ∈ S aRb ^bRa => a≠b", //(A)
				"(A) ∀ b ∈ B ∃ a ∈ A.f(a) = b  (B) ∃ b ∈ B ∀ a ∈ A.f(a) ≤ b  (C) ∃ b ∈ B ∀ a ∈ A.f(a) ≥ b  (D) ∀ a, b ∈ A.f(a) = f(b) => a = b ",//(D)
				"(A) R = {(a,b),(b,b),(a,c),(b,c)}  (B) R = {(b,a),(a,c),(a,a),(b,c),(b,b),(c,c)}  (C) R = {(a,b),(a,a),(a,c),(b,c),(b,b),(c,c)  (D) R = {(a,a),(b,b),(c,c),(a,c),(c,b),(b,a)}", //(C)
				"(A) A knight  (B) A knave  (C) Could be both  (D) None of them" //(A)
		};
		
		//CORRECT ANSWERS
		//A => 1
		//B => 2
		//C => 3
		//D => 4
		
		//LEVEL: EASY
		int[] easyCorAnswers = {3,2,1,4,3};
		
		//LEVEL: MEDIUM
		int[] mediumCorAnswers = {4,1,2,1,4};
		
		//LEVEL: DIFFICULT
		int[] hardCorAnswers = {2,3,4,3,1};
		
		//TOTAL
		int[] totalAnswers = {3, 2, 1, 4, 1, 2, 2, 3, 4, 4, 3, 1, 4, 3, 1};
		
		
		//initializing variables
		String[] level = {};
		String[] potAnswers = {};
		int[] correctAnswers = {};
		String userInput = null;
		
		
		
	
//////////////////////////////////////////////////////////////////////////////////////START of code
//////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
		
		
		
		System.out.println("Welcome to ISE quiz. Please choose your level of difficulty. (1 = Easy/ 2 = Medium/ 3 = Difficult/ 4 = Random/ 5 = Increasing Difficulty)");
		int difficulty = input.nextInt();
		
		
		
		//random
		if (difficulty == 4) {
			score = 0;
		
			for (int i = 0; i < 6; i++) {
				
				//random number generator
				int localRand = 10;
				while (usedNumbers.contains(localRand)) {
					localRand = rand.nextInt(9);
				}
					usedNumbers.add(localRand);	
					int k = localRand;
	
			System.out.println(totalQuestions[k]);
			System.out.println(totalPotAnswers[k]);
			System.out.println("Please select an answers: (A/B/C/D)");
			userInput = (input.next()).toUpperCase();
			
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
			
			if(userChoice == (totalAnswers[k])) {
				score++;
			}
			}
			System.out.println("Your score is " + score + "/6");
			System.out.println("Thank you for playing :)");
		}
		
		//difficulty modes
		
		if (difficulty == 1) {
			System.out.println("Easy mode activated");
			level = easyQuestions;
			potAnswers = easyPotAnswers;
			correctAnswers = easyCorAnswers;
		}
		else if (difficulty == 2) {
			System.out.println("Medium mode activated");
			level = mediumQuestions;
			potAnswers = mediumPotAnswers;
			correctAnswers = mediumCorAnswers;
		}
		else if (difficulty == 3) {
			System.out.println("Hard mode activated");
			level = hardQuestions;
			potAnswers = hardPotAnswers;
			correctAnswers = hardCorAnswers;
		}
		
		
		
		//Increasing difficulty
		else if (difficulty == 5) {
			score = score + increasingDifficulty(easyQuestions, easyPotAnswers, easyCorAnswers);
			score = score + increasingDifficulty(mediumQuestions, mediumPotAnswers, mediumCorAnswers);
			score = score + increasingDifficulty(hardQuestions, hardPotAnswers, hardCorAnswers);
			System.out.println("Your score is " + score + "/6");
			System.out.println("Thank you for playing :)");
		}
		
	
		
		
		//Easy/medium/difficult/
		if (difficulty == 1||difficulty == 2|| difficulty == 3) {
		for(int i = 0; i < level.length ; i++) {
			System.out.println(level[i]);
			System.out.println(potAnswers[i]);
			System.out.println("Please select an answers: (A/B/C/D)");
			userInput = (input.next()).toUpperCase();
		
		
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
		
		if(userChoice == correctAnswers[i]) {
			score++;
		}
		}
		System.out.println("Your score is " + score + "/" + level.length);
		System.out.println("Thank you for playing :)");
		}
		}
	public static int increasingDifficulty (String[] p, String[] o, int[] d) {
		Scanner input = new Scanner(System.in);
		String userInput;
		Random rand = new Random();
		Set<Integer> usedNumbers = new HashSet<>();
		usedNumbers.add(10);
		int localScore = 0;
		
		for(int i = 0; i < 2 ; i++) {
			//random number generator
			int localRand = 10;
			while (usedNumbers.contains(localRand)) {
				localRand = rand.nextInt(5);
			}
				usedNumbers.add(localRand);	
				int u = localRand;
			System.out.println(p[u]);
			System.out.println(o[u]);
			System.out.println("Please select an answers: (A/B/C/D)");
			userInput = input.next().toUpperCase();
		
		
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
		
		if(userChoice == (d[u])) {
			localScore++;
		}
		
		}
		return localScore;	
	}	
	}