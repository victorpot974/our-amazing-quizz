package EPIC;


//Imports:
//GUI
import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

//Sorting arrays
import java.util.Arrays;

//Random number generator
import java.util.Random;
import java.util.HashSet;
import java.util.Set;


public class Quiz implements ActionListener{
	
	
	//Strings
	//Questions
	String[] totalQuestions = {
			//Easy
			"What does BNF stand for?",
			"What's the name of the no.1 supercomputer in the world?",
			"Combining two or more propositions using logical expressions is a:",
			"What is a BDD?",
			"Which of those is NOT a subset of {x ∈ N|x ∉ N}?",
			"What is the equivalent of the decimal number 357 in base 2?",
			
			//Medium
			"What does it mean if two algorithms are semantically the same?",
			"What is the Von Neuman Bottleneck",
			"What is tautology?",
			"What is the formal definition of a symmetric relation R ⊆ S x S?", 
			"What is the formal definition of an injective function",
			"What is the result of the binary subtraction 11001011011 - 101111101 in hexadecimal format?",
			
			//Hard
			"What equivalence relation is this? (x,y) and (y,z) imply (x,z)",
			"Which generation of computers were computers based on intergrated circuits?",
			"When is a matrix invertible?",
			"Which of these is a partial order relation?", 
			"On an island where knights always tell the truth and knaves always lie, an inhabitant declares: 'If I am lying, then I am a knight'. Is that inhabitant a knight or knave?",
			"What are the 9 first bits (i.e. sign and exponent) of decimal number -1212.573 written in IEEE 754 single precision format?"
			};
	//Potential Answers
	String[][] totalPotAnswers = {
			//Easy
			{"(A) Brand New Function" , "(B) Brendan Nor Form",  "(C) Backus Naur Format" , "(D) Bring Nine Forward"}, //(C)
			{"(A) Cray",  "(B) Frontier", "(C) Kay",  "(D) Summit"}, //(B)
			{"(A) Compound proposition",  "(B) Propositional variable",  "(C) Conjunction Variable",  "(D) Propositional Quantifier"}, //(A)
			{"(A) A specific part of an algorithm that allows us to prove its correctness",  "(B) A language used to define grammar rules",  "(C) An endless recursion problem inside the definition of a syntax",  "(D) A data structure that represents a boolean function "}, //(D)
			{"(A) S = {3,2,8}",  "(B) S = {32, 128}",  "(C) S = {4, 8, 64}",  "(D) S = {Ø}"}, //(C)
			{"(A) 110001011",  "(B) 101100101",  "(C) 110101111",  "(D) 101101011"}, //(B)
			
			//Medium
			{"(A) Code is identical",  "(B) Code is similar",  "(C) Stored in same location",  "(D) Output is the same"}, //(D)
			{"(A) CPU is idle",  "(B) CPU overheats",  "(C) Insufficient storage",  "(D) ALU doesn't cooperate with CU"}, //(A)
			{"(A) Compoud proposition that is always false",  "(B) Compoud propositon that is always true",  "(C) Undefined variable",  "(D) Error in a truth table"}, //(B)
			{"(A) ∀ a,b ∈ S aRb => bRa",  "(B) ∀ a,b ∈ S aRb ^a ≠ b => bRa" , "(C) ∀ a,b ∈ S aRb ^ bRa => a =b",  "(D) ∀ a,b ∈ S aRb ^bRa => a≠b"}, //(A)
			{"(A) ∀ b ∈ B ∃ a ∈ A.f(a) = b",  "(B) ∃ b ∈ B ∀ a ∈ A.f(a) ≤ b",  "(C) ∃ b ∈ B ∀ a ∈ A.f(a) ≥ b",  "(D) ∀ a, b ∈ A.f(a) = f(b) => a = b "},//(D)
			{"(A) 4DE",  "(B) 2AF",  "(C) 3CO",  "(D) 2B9"}, //(A)
			
			//Hard
			{"(A) Symmetry",  "(B) Transitivity",  "(C) Reflexivity",  "(D) Asymmetry"}, //(B)
			{"(A) 1",  "(B) 2",  "(C) 3",  "(D) 4"}, //(C)
			{"(A) When all the values are the same",  "(B) When the sum of the values is an even number",  "(C) When the sum of values is an odd number" , "(D) When the determinant is 0"},//(D)
			{"(A) R = {(a,b),(b,b),(a,c),(b,c)}",  "(B) R = {(b,a),(a,c),(a,a),(b,c),(b,b),(c,c)}",  "(C) R = {(a,b),(a,a),(a,c),(b,c),(b,b),(c,c)",  "(D) R = {(a,a),(b,b),(c,c),(a,c),(c,b),(b,a)"}, //(C)
			{"(A) A knight",  "(B) A knave",  "(C) Could be both",  "(D) None of them"}, //(A)
			{"(A) 110001001",  "(B) 011000101",  "(C) 111011001",  "(D) 111001101"} //(A)
	};
	
	//Correct Answers
	int[] totalAnswers = {
			//Easy
			3, 2, 1, 4, 3, 2,
			
			//Medium
			4, 1, 2, 1, 4, 1,
			
			//Hard
			2, 3, 4, 3, 1, 1
			};
	
	
	//Questions, potential answers and correct answers divided into categories of difficulty
	//Questions
	String[] easyQuestions = Arrays.copyOfRange(totalQuestions, 0, 6);
	String[] mediumQuestions = Arrays.copyOfRange(totalQuestions, 6, 12);
	String[] hardQuestions = Arrays.copyOfRange(totalQuestions, 12, 18);
	
	//Potential Answers
	String[][] easyPotAnswers = Arrays.copyOfRange(totalPotAnswers, 0, 6);
	String[][] mediumPotAnswers = Arrays.copyOfRange(totalPotAnswers, 6, 12);
	String[][] hardPotAnswers = Arrays.copyOfRange(totalPotAnswers, 12, 18);
	
	//Correct Answers
	int[] easyAnswers = Arrays.copyOfRange(totalAnswers, 0, 6);
	int[] mediumAnswers = Arrays.copyOfRange(totalAnswers, 6, 12);
	int[] hardAnswers = Arrays.copyOfRange(totalAnswers, 12, 18);
	
	
	//Initialisation of variables
	int answer;
	int index;
	int randIndex;
	int incDifIndex;
	int score = 0;
	int result;
	int mode;
	String[] questions = totalQuestions;
	String[][] potAnswers = totalPotAnswers;
	int[] answers = totalAnswers;
	
	
	//Used for random number generator
	Random rand = new Random(); 
	Set<Integer> usedNumbers = new HashSet<>();
	
	
	//GUI
	//Frame
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	
	//Buttons
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	
	//ANswer labels
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel answer_label1 = new JLabel();
	JLabel answer_label2 = new JLabel();
	JLabel answer_label3 = new JLabel();
	JLabel answer_label4 = new JLabel();
	JLabel answer_label5 = new JLabel();
	
	//End result
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	
	
	public Quiz() {
		
		
		//Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		
		//Title banner/Heading 1
		textfield.setBounds(0,0,650,50);
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free", Font.PLAIN,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		//Question banner/Heading 2
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(25,255,0));
		textarea.setFont(new Font("MV Boli",Font.PLAIN,25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		//Button A
		buttonA.setBounds(0,100,100,100); //Size and location
		buttonA.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//buttonA.setFocusable(false); //Not highlighted//////////////////////////////////////////
		buttonA.addActionListener(this); //Takes user input
		buttonA.setText("A"); //Text
		
		//Button B
		buttonB.setBounds(0,200,100,100);//Size and location
		buttonB.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//buttonB.setFocusable(false); //Not highlighted//////////////////////////////////////////
		buttonB.addActionListener(this); //Takes user input
		buttonB.setText("B"); //Text
		
		//Button C
		buttonC.setBounds(0,300,100,100); //Size and location
		buttonC.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and size
		//buttonC.setFocusable(false); //Not highlighted///////////////////////////////////////////
		buttonC.addActionListener(this); //Takes input
		buttonC.setText("C");//Text
		
		//Button D
		buttonD.setBounds(0,400,100,100); //Size and location
		buttonD.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//buttonD.setFocusable(false); //Not highlighted////////////////////////////////////////////
		buttonD.addActionListener(this); //Takes input
		buttonD.setText("D"); //Text

		//Answer label A
		answer_labelA.setBounds(125, 100, 500, 100); //Size and location
		answer_labelA.setBackground(new Color(50,50,50)); //Background colour
		answer_labelA.setForeground(new Color(25,255,0)); //Foreground colour
		answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Answer label B
		answer_labelB.setBounds(125, 200, 500, 100); //Size and location
		answer_labelB.setBackground(new Color(50,50,50)); //Background colour
		answer_labelB.setForeground(new Color(25,255,0)); //Background colour
		answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Answer label C
		answer_labelC.setBounds(125, 300, 500, 100); //Size and location
		answer_labelC.setBackground(new Color(50,50,50)); //Background colour
		answer_labelC.setForeground(new Color(25,255,0)); //Foreground colour
		answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Answer label D
		answer_labelD.setBounds(125, 400, 500, 100); //Size and location
		answer_labelD.setBackground(new Color(50,50,50)); //Background colour
		answer_labelD.setForeground(new Color(25,255,0)); //Foreground colour
		answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		
		//End of quiz results
		//Score
		number_right.setBounds(225,225,200,100); //Location and size
		number_right.setBackground(new Color(25,25,25)); //Background colour
		number_right.setForeground(new Color(25,255,0)); //Foreground colour
		number_right.setFont(new Font("Ink Free",Font.BOLD,50)); //Font and text size
		number_right.setBorder(BorderFactory.createBevelBorder(1)); //Border
		number_right.setHorizontalAlignment(JTextField.CENTER); //Centre of box
		number_right.setEditable(false); //Not editable
		
		//Percentage
		percentage.setBounds(225,325,200,100); //Location and size
		percentage.setBackground(new Color (25,25,25)); //Background colour
		percentage.setForeground(new Color(25,255,0)); //Foreground colour
		percentage.setFont(new Font("Ink Free",Font.BOLD,50)); //Font and text size
		percentage.setBorder(BorderFactory.createBevelBorder(1)); //Border
		percentage.setHorizontalAlignment(JTextField.CENTER); //Centre of box
		percentage.setEditable(false); //Not editable

		
		
		
		
		
		
		
		//Buttons
		//Button 1/Easy
		button1.setBounds(0,100,100,100); //Location and size
		button1.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//button1.setFocusable(false);////////////////////////////////////////////////////
		button1.setText("1"); //Text
		button1.addActionListener(new ActionListener() { //Takes User input
			@Override
			public void actionPerformed(ActionEvent e) {
				mode = 1; //Assigns mode 1
				questions = easyQuestions; //Assigns easy questions
				potAnswers = easyPotAnswers; //Assigns easy Potential Answers
				answers = easyAnswers; //Assigns easy answers
				nextQuestion(); //Method is run, question appears
				
			}
		});
		
		//Button 2/Medium
		button2.setBounds(0,200,100,100); //Location and size
		button2.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//button2.setFocusable(false);////////////////////////////////////////////////////////
		button2.setText("2"); //Text
		button2.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				mode = 2; //Assigns mode 2
				questions = mediumQuestions; //Assigns medium questions
				potAnswers = mediumPotAnswers; //Assigns medium potential answers
				answers = mediumAnswers; //Assigns medium answers
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Button 3/Hard
		button3.setBounds(0,300,100,100); //Location and size
		button3.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//button3.setFocusable(false);//////////////////////////////////////////////////////////////
		button3.setText("3"); //Text
		button3.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				mode = 3; //Assigns mode 3
				questions = hardQuestions; //Assigns hard questions
				potAnswers = hardPotAnswers; //Assigns hard potential answers
				answers = hardAnswers; //Assigns hard answers
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Button 4/Random  
		button4.setBounds(0,400,100,100); //Location and size
		button4.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//button4.setFocusable(false);///////////////////////////////////////////////////////////////
		button4.setText("4"); //Text
		button4.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				mode = 4; //Assigns mode 4
				nextQuestion(); //Method is run, question appears
				
			}
		});

		//Button 5/Increasing Difficulty  !This method continues later in the code!
		button5.setBounds(0,500,100,100); //Location and size
		button5.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//button5.setFocusable(false);////////////////////////////////////////////////////////////////
		button5.setText("5"); //Text
		button5.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				mode = 5; //Assigns mode 5
				//This mode begins with easy mode
				questions = easyQuestions; //Assigns easy questions
				potAnswers = easyPotAnswers; //Assigns easy potential answers
				answers = easyAnswers; //Assigns easy answers
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Answer Labels for difficulty modes
		//Label 1
		answer_label1.setBounds(125, 100, 500, 100); //Location and size
		answer_label1.setBackground(new Color(50,50,50)); //Background colour
		answer_label1.setForeground(new Color(25,255,0)); //Foreground colour
		answer_label1.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Label 2
		answer_label2.setBounds(125, 200, 500, 100); //Location and size
		answer_label2.setBackground(new Color(50,50,50)); //Background colour
		answer_label2.setForeground(new Color(25,255,0)); //Foreground colour
		answer_label2.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Label 3
		answer_label3.setBounds(125, 300, 500, 100); //Location and size 
		answer_label3.setBackground(new Color(50,50,50)); //Background colour
		answer_label3.setForeground(new Color(25,255,0)); //Foreground colour
		answer_label3.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Label 4
		answer_label4.setBounds(125, 400, 500, 100); //Location and size
		answer_label4.setBackground(new Color(50,50,50)); //Background colour
		answer_label4.setForeground(new Color(25,255,0)); //Foreground colour
		answer_label4.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		//Label 5
		answer_label5.setBounds(125, 500, 500, 100); //Location and size
		answer_label5.setBackground(new Color(50,50,50)); //Background colour
		answer_label5.setForeground(new Color(25,255,0)); //Foreground colour
		answer_label5.setFont(new Font("MV Boli",Font.PLAIN,35)); //Font and text size
		
		
		//Everthing is added to the frame 
		//Headings
		frame.add(textarea); 
		frame.add(textfield); 
		
		
		//Buttons for modes
		frame.add(button1); 
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		
		//Labels for modes 
		frame.add(answer_label1);
		frame.add(answer_label2);
		frame.add(answer_label3);
		frame.add(answer_label4);
		frame.add(answer_label5);

		
		//Labels for questions
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		
		//Buttons for questions
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		
		//Visibility enabled
		frame.setVisible(true);
		
		//Buttons and labels for questions are disabled/hidden
		buttonA.setVisible(false);
		buttonB.setVisible(false);
		buttonC.setVisible(false);
		buttonD.setVisible(false);
		answer_labelA.setVisible(false);
		answer_labelB.setVisible(false);
		answer_labelC.setVisible(false);
		answer_labelD.setVisible(false);
	
		
		textfield.setText("Welcome to ISE Quiz :)"); //Heading 1
		textarea.setText("Select difficulty"); //Heading 2
		answer_label1.setText("Easy mode"); //Easy mode label
		answer_label2.setText("Medium mode"); //Medium mode label
		answer_label3.setText("Hard mode"); //Hard mode label
		answer_label4.setText("Random"); //Random mode label
		answer_label5.setText("Increasing Difficulty"); //Increasing difficulty mode label
		
		

	}
	//Random number generator
	public int randGenerate() {
		usedNumbers.add(20); //Used to begin while loop
		int localRand = 20; //Used to begin while loop
		
		while (usedNumbers.contains(localRand)) { //If chosen number was already used, another one is generated
			localRand = rand.nextInt(questions.length); //Random number is generated
		}
			usedNumbers.add(localRand);	//Generated number is added to list of used numbers
			return localRand; //Random number is generated
	}
	
	public void nextQuestion() {
		if(index >= 6) { //If end of quiz
			results();   //Display results
		}
		else {
			
			//Increasing difficulty mode 
			if (mode == 5 ) {
				if (incDifIndex == 2) { //Once 2 questions from easy category are asked, code moves to medium category of questions
					questions = mediumQuestions;
					potAnswers = mediumPotAnswers;
					answers = mediumAnswers;
				}
				if (incDifIndex == 4) { //Once 2 questions from medium category are asked, code moves to hard category of questions
					questions = hardQuestions;
					potAnswers = hardPotAnswers;
					answers = hardAnswers;
				}
				incDifIndex++; //Increment Increasing difficulty index 

			}
			
			
			randIndex = randGenerate(); //random number is generated and assigned 
			
			//Buttons and labels for modes are hidden
			button1.setVisible(false);
			button2.setVisible(false);
			button3.setVisible(false);
			button4.setVisible(false);
			button5.setVisible(false);
			answer_label1.setVisible(false);
			answer_label2.setVisible(false);
			answer_label3.setVisible(false);
			answer_label4.setVisible(false);
			answer_label5.setVisible(false);
			
			//Buttons for questions are shown
			buttonA.setVisible(true);
			buttonB.setVisible(true);
			buttonC.setVisible(true);
			buttonD.setVisible(true);
			answer_labelA.setVisible(true);
			answer_labelB.setVisible(true);
			answer_labelC.setVisible(true);
			answer_labelD.setVisible(true);
			
			
			textfield.setText("Questions " +(index + 1)); //Question number is displayed
			textarea.setText(questions[randIndex]); //question is displayed
			//Potential answers are displayed in labels
			answer_labelA.setText(potAnswers[randIndex][0]); 
			answer_labelB.setText(potAnswers[randIndex][1]);
			answer_labelC.setText(potAnswers[randIndex][2]);
			answer_labelD.setText(potAnswers[randIndex][3]);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//All buttons are disabled
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		
		//Converting user input (via buttons) into an integer, stored in the variable "answer"
		if(e.getSource()==buttonA) {
			answer = 1;
			if(answer == answers[randIndex]) { //If correct answer
				score++; //Increment score
			}
		}
		if(e.getSource()==buttonB) {
			answer = 2;
			if(answer == answers[randIndex]) { //If correct answer
				score++; //Increment score
			}
		}
		if(e.getSource()==buttonC) {
			answer = 3;
			if(answer == answers[randIndex]) { //If correct answer
				score++; //Increment score
			}
		}
		if(e.getSource()==buttonD) {
			answer = 4;
			if(answer == answers[randIndex]) { //If correct answer
				score++; //Increment score
			}
		}
		
		displayAnswer(); //Correct answer is indicated
	}
	
	public void displayAnswer() {
		//Buttons are disabled
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		//If potential answer is incorrect, label turns red while correct answer label remains green
		if(answers[randIndex] != 1) { 
			answer_labelA.setForeground(new Color(255,0,0));
		}
		if(answers[randIndex] != 2) {
			answer_labelB.setForeground(new Color(255,0,0));
		}
		if(answers[randIndex] != 3) {
			answer_labelC.setForeground(new Color(255,0,0));
		}
		if(answers[randIndex] != 4) {
			answer_labelD.setForeground(new Color(255,0,0));
		}
		
		//Timer, for 1 seconds break when answer is selected
		Timer pause = new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Labels change back to green
				answer_labelA.setForeground(new Color(25,255,0));
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				
				//answer= ' ';/////////////////////////////////////////////////////////////////////////////////
				//Buttons are enabled
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++; //Increment index
				nextQuestion(); //Move onto next question
			}
		});
		
		//1 second break
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results() {
		//Buttons are disabled
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		//Buttons are hidden
		buttonA.setVisible(false);
		buttonB.setVisible(false);
		buttonC.setVisible(false);
		buttonD.setVisible(false);
		
		//Answer labels are hidden
		answer_labelA.setVisible(false);;
		answer_labelB.setVisible(false);
		answer_labelC.setVisible(false);;
		answer_labelD.setVisible(false);
		
		result = (int)((score/(double)6)*100); //Result is calculated into a percentage
		
		textfield.setText("RESULTS"); //Heading 1 displays "RESULTS"
		textarea.setText("Thank you for playing :)"); //Heading 2 displays "Thank you for playing :)"
		//Answer labels are cleared
		//answer_labelA.setText("");/////////////////////////////////////////////////////////////////////////////
		//answer_labelB.setText("");/////////////////////////////////////////////////////////////////////////////////
		//answer_labelC.setText("");/////////////////////////////////////////////////////////////////////////////////////
		//answer_labelD.setText("");////////////////////////////////////////////////////////////////////////////////////
		
		number_right.setText(score+ "/" + 6 ); //Score out of 6 is displayed
		percentage.setText(result + "%"); //Percentage result is displayed
		
		frame.add(number_right); //Score is added to frame
		frame.add(percentage); //Percentage is added to frame 
	}
	
	
}
