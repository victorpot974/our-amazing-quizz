package epicFile;


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


public class QUIZ implements ActionListener{
	
	
	//Quiz Bank 
	quizBank bank = new quizBank();
	
	
	//Initialisation of variables
	int answer;
	int index;
	int randIndex;
	int incDifIndex;
	int score = 0;
	int result;
	int mode;
	int numberOfQuestions = 6;
	String[] questions = bank.getQuestions(0);
	String[][] potAnswers = bank.getPotAnswers(0);
	int[] answers = bank.getAnswers(0);
	
	
	//Used for random number generator
	Random rand = new Random(); 
	Set<Integer> usedNumbers = new HashSet<>();
	
	
	//GUI
	//Frame
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextField textfield2 = new JTextField();
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
	
	
	
	public QUIZ() {
		
		
		//Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600,1000);
		frame.getContentPane().setBackground(new Color(34,34,34));
		frame.setLayout(null);
		frame.setResizable(false);
		
		//Title banner/Heading 1
		textfield.setBounds(0,0,1600,100);
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(37,49,220));
		textfield.setFont(new Font("Ink Free", Font.PLAIN,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		
		//Question banner/Heading 2
		textarea.setBounds(0,100,1600,100);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25));
		textarea.setForeground(new Color(37,49,220));
		textarea.setFont(new Font("MV Boli",Font.PLAIN,25));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		
		//Button A
		buttonA.setBounds(0,270,100,100); //Size and location
		buttonA.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//buttonA.setFocusable(false); //Not highlighted//////////////////////////////////////////
		buttonA.addActionListener(this); //Takes user input
		buttonA.setText("A"); //Text
		
		//Button B
		buttonB.setBounds(0,400,100,100);//Size and location
		buttonB.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//buttonB.setFocusable(false); //Not highlighted//////////////////////////////////////////
		buttonB.addActionListener(this); //Takes user input
		buttonB.setText("B"); //Text
		
		//Button C
		buttonC.setBounds(0,530,100,100); //Size and location
		buttonC.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and size
		//buttonC.setFocusable(false); //Not highlighted///////////////////////////////////////////
		buttonC.addActionListener(this); //Takes input
		buttonC.setText("C");//Text
		
		//Button D
		buttonD.setBounds(0,660,100,100); //Size and location
		buttonD.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		//buttonD.setFocusable(false); //Not highlighted////////////////////////////////////////////
		buttonD.addActionListener(this); //Takes input
		buttonD.setText("D"); //Text

		//Answer label A
		answer_labelA.setBounds(125, 270, 1600, 100); //Size and location
		answer_labelA.setBackground(new Color(50,50,50)); //Background colour
		answer_labelA.setForeground(new Color(25,255,0)); //Foreground colour
		answer_labelA.setFont(new Font("Times New Roman",Font.PLAIN,35)); //Font and text size
		
		//Answer label B
		answer_labelB.setBounds(125, 400, 1600, 100); //Size and location
		answer_labelB.setBackground(new Color(50,50,50)); //Background colour
		answer_labelB.setForeground(new Color(25,255,0)); //Background colour
		answer_labelB.setFont(new Font("Times New Roman",Font.PLAIN,35)); //Font and text size
		
		//Answer label C
		answer_labelC.setBounds(125, 530, 1600, 100); //Size and location
		answer_labelC.setBackground(new Color(50,50,50)); //Background colour
		answer_labelC.setForeground(new Color(25,255,0)); //Foreground colour
		answer_labelC.setFont(new Font("Times New Roman",Font.PLAIN,35)); //Font and text size
		
		//Answer label D
		answer_labelD.setBounds(125, 660, 1600, 100); //Size and location
		answer_labelD.setBackground(new Color(50,50,50)); //Background colour
		answer_labelD.setForeground(new Color(25,255,0)); //Foreground colour
		answer_labelD.setFont(new Font("Times New Roman",Font.PLAIN,35)); //Font and text size
		
		
		//End of quiz results
		//Score
		number_right.setBounds(625,300,400,200); //Location and size
		number_right.setBackground(new Color(194,215,211)); //Background colour
		number_right.setForeground(new Color(37,49,220)); //Foreground colour
		number_right.setFont(new Font("Garamond",Font.BOLD,75)); //Font and text size
		number_right.setBorder(BorderFactory.createBevelBorder(1)); //Border
		number_right.setHorizontalAlignment(JTextField.CENTER); //Centre of box
		number_right.setEditable(false); //Not editable
		

		//Percentage
		percentage.setBounds(625,500,400,200); //Location and size
		percentage.setBackground(new Color (194,215,211)); //Background colour
		percentage.setForeground(new Color(37,49,220)); //Foreground colour
		percentage.setFont(new Font("Garamond",Font.BOLD,75)); //Font and text size
		percentage.setBorder(BorderFactory.createBevelBorder(1)); //Border
		percentage.setHorizontalAlignment(JTextField.CENTER); //Centre of box
		percentage.setEditable(false); //Not editable
	
		
		
		
		
		
		
		//Buttons
		//Button 1/Easy
		button1.setBounds(625,210,100,100); //Location and size
		button1.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		button1.setText("1"); //Text
		button1.addActionListener(new ActionListener() { //Takes User input
			@Override
			public void actionPerformed(ActionEvent e) {
				questions = bank.getQuestions(1); //Assigns easy questions
				potAnswers = bank.getPotAnswers(1); //Assigns easy Potential Answers
				answers = bank.getAnswers(1); //Assigns easy answers
				answer_labelA.setForeground(new Color(25,255,0)); //Foreground colour
				answer_labelB.setForeground(new Color(25,255,0));
				answer_labelC.setForeground(new Color(25,255,0));
				answer_labelD.setForeground(new Color(25,255,0));
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Button 2/Medium
		button2.setBounds(625,330,100,100); //Location and size
		button2.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		button2.setText("2"); //Text
		button2.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				questions = bank.getQuestions(2); 
				potAnswers = bank.getPotAnswers(2); 
				answers = bank.getAnswers(2);
				answer_labelA.setForeground(new Color(255,240,20)); //Foreground colour
				answer_labelB.setForeground(new Color(255,240,20));
				answer_labelC.setForeground(new Color(255,240,20));
				answer_labelD.setForeground(new Color(255,240,20));
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Button 3/Hard
		button3.setBounds(625,450,100,100); //Location and size
		button3.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		button3.setText("3"); //Text
		button3.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				questions = bank.getQuestions(3); 
				potAnswers = bank.getPotAnswers(3); 
				answers = bank.getAnswers(3);
				answer_labelA.setForeground(new Color(255,44,20)); //Foreground colour
				answer_labelB.setForeground(new Color(255,44,20));
				answer_labelC.setForeground(new Color(255,44,20));
				answer_labelD.setForeground(new Color(255,44,20));
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Button 4/Random  
		button4.setBounds(625,570,100,100); //Location and size
		button4.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		button4.setText("4"); //Text
		button4.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				answer_labelA.setForeground(new Color(20,255,240)); //Foreground colour
				answer_labelB.setForeground(new Color(20,255,240));
				answer_labelC.setForeground(new Color(20,255,240));
				answer_labelD.setForeground(new Color(20,255,240));
				nextQuestion(); //Method is run, question appears
				
			}
		});

		//Button 5/Increasing Difficulty  !This method continues later in the code!
		button5.setBounds(625,690,100,100); //Location and size
		button5.setFont(new Font("MV Boli",Font.BOLD,35)); //Font and text size
		button5.setText("5"); //Text
		button5.addActionListener(new ActionListener() { //Takes user input
			@Override
			public void actionPerformed(ActionEvent e) {
				mode = 5; //Assigns mode 5
				//This mode begins with easy mode
				questions = bank.getQuestions(mode); 
				potAnswers = bank.getPotAnswers(mode); 
				answers = bank.getAnswers(mode);
				answer_labelA.setForeground(new Color(255,169,20)); //Foreground colour
				answer_labelB.setForeground(new Color(255,169,20));
				answer_labelC.setForeground(new Color(255,169,20));
				answer_labelD.setForeground(new Color(255,169,20));
				nextQuestion(); //Method is run, question appears
			}
		});
		
		//Answer Labels for difficulty modes
		//Label 1
		answer_label1.setBounds(750, 210, 500, 100); //Location and size
		answer_label1.setBackground(new Color(50,50,50)); //Background colour
		answer_label1.setForeground(new Color(25,255,0)); //Foreground colour
		answer_label1.setFont(new Font("Papyrus",Font.PLAIN,35)); //Font and text size
		
		//Label 2
		answer_label2.setBounds(750, 330, 500, 100); //Location and size
		answer_label2.setBackground(new Color(50,50,50)); //Background colour
		answer_label2.setForeground(new Color(255,240,20)); //Foreground colour
		answer_label2.setFont(new Font("Papyrus",Font.PLAIN,35)); //Font and text size
		
		//Label 3
		answer_label3.setBounds(750, 450, 500, 100); //Location and size 
		answer_label3.setBackground(new Color(50,50,50)); //Background colour
		answer_label3.setForeground(new Color(255,44,20)); //Foreground colour
		answer_label3.setFont(new Font("Papyrus",Font.PLAIN,35)); //Font and text size
		
		//Label 4
		answer_label4.setBounds(750, 570, 500, 100); //Location and size
		answer_label4.setBackground(new Color(50,50,50)); //Background colour
		answer_label4.setForeground(new Color(20,255,240)); //Foreground colour
		answer_label4.setFont(new Font("Papyrus",Font.PLAIN,35)); //Font and text size
		
		//Label 5
		answer_label5.setBounds(750, 690, 500, 100); //Location and size
		answer_label5.setBackground(new Color(50,50,50)); //Background colour
		answer_label5.setForeground(new Color(255,169,20)); //Foreground colour
		answer_label5.setFont(new Font("Papyrus",Font.PLAIN,35)); //Font and text size
		
		
		//Everything is added to the frame 
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
	
		
		//Text
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
		if(index >= numberOfQuestions) { //If end of quiz
			results();   //Display results
		}
		else {
			
			//Increasing difficulty mode 
			if (mode == 5 ) {
				if (incDifIndex == 2) { //Once 2 questions from easy category are asked, code moves to medium category of questions
					questions = bank.getQuestions(2);
					potAnswers = bank.getPotAnswers(2);
					answers = bank.getAnswers(2);
				}
				if (incDifIndex == 4) { //Once 2 questions from medium category are asked, code moves to hard category of questions
					questions = bank.getQuestions(3);
					potAnswers = bank.getPotAnswers(3);
					answers = bank.getAnswers(3);
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
		

		
		//Timer, for 50 milliseconds break when answer is selected
		Timer pause = new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
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
		textarea.setFont(new Font("Lucida Handwriting",Font.PLAIN,50));
		
		number_right.setText(score+ "/" + 6 ); //Score out of 6 is displayed
		percentage.setText(result + "%"); //Percentage result is displayed
		
		frame.add(number_right); //Score is added to frame
		frame.add(percentage); //Percentage is added to frame 
	}
}