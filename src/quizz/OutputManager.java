package quizz;

public class OutputManager {
	
	private static final String APP_TITLE = "The EPIC Quizz";
	private static final String DEFAULT_SEPARATOR_CHAR = "-";
	private static final int DEFAULT_SEPARATOR_LENGTH = 150;
	
	public static void jumpLine() {
		System.out.println();
	}
	
	public static void jumpLines(int lineAmount) {
		for (int i=0; i < lineAmount; i++) {
			jumpLine();
		}
	}
	
	public static void welcomeInstructions() {
		displaySeparator();
		System.out.println(String.format("Welcome to %s!", APP_TITLE));
		jumpLine();
		System.out.println("Proposed by KISS Solutions Inc");
		displaySeparator();
		jumpLines(2);

		loginInstructions();
	}
	
	
	public static void loginInstructions() {
		System.out.println("Enter 1 to log in to your account.");
		System.out.println("Enter 2 to sign up and create an account.");
		System.out.println("Or enter 3 to sign in as guest.");
		jumpLine();
	}
	
	public static void authentificationInstructions() {
		jumpLine();
		System.out.println("To sign in, please enter your username and password.");
		jumpLine();
		enterUsername();
	}
	
	public static void signUpInstructions() {
		jumpLine();
		displaySeparator();
		System.out.println("To create an account, please enter an username and a password.");
		jumpLine();
		System.out.println("Please note that your password must:");
		System.out.println("\t- Be at least 8 characters long");
		System.out.println("\t- Contain at least one digit");
		System.out.println("\t- Contain at least one upper case letter");
		System.out.println("\t- Contain at least one lower case letter");
		System.out.println("\t- Contain at least one special character");
		displaySeparator();
		jumpLine();
	}
	
	public static void successfulSignUp(String username) {
		System.out.println("Account creation successful!");
	}
	
	public static void wrongLoginWarning() {
		displaySeparator();
		System.out.println("Failed to log in: wrong username or password");
		System.out.println("Enter 1 to try again or 2 to create an account.");
		displaySeparator();
	}
	
	public static void enterUsername() {
		System.out.print("Enter your username: ");
	}
	
	public static void enterPassword() {
		System.out.print("Enter your password: ");
	}
	
	public static void confirmPassword() {
		System.out.print("Confirm password: ");
	}
	
	public static void invalidInputWarning(String invalidInput, String expectedInputs) {
		jumpLine();
		displaySeparator();
		System.out.println(String.format("Refused: '%s' is an invalid input in this context.", invalidInput));
		System.out.println("Please enter a valid input among: " + expectedInputs);
		displaySeparator();
		jumpLine();
	}
	
	public static void succesfulSignIn(String username) {
		System.out.println("Successfully signed in as: " + username);
	}
	
	public static void repeatPrint(String repeatedString, int loops) {
		for (int i = 0; i < loops; i++) {
			System.out.print(repeatedString);
		}
		jumpLine();
	}
	
	public static void displaySeparator() {
		repeatPrint(DEFAULT_SEPARATOR_CHAR, DEFAULT_SEPARATOR_LENGTH);
	}
	
}
