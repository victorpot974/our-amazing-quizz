package quizz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputManager {
	
	private static Scanner inputReader = new Scanner(System.in);
	
	public static int readInt() {
		return inputReader.nextInt();
	}
	
	public static double readDouble() {
		return inputReader.nextDouble();
	}
	
	public static String readString() {
		return inputReader.next();
	}
	
	public static void end() {
		inputReader.close();
	}
	
	
	public static String readFilteredString(String regex) {
		String userInput = readString();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(userInput);
		
		while(!matcher.find()) {
			OutputManager.invalidInputWarning(userInput, Utilities.readSimpleRegex(regex));
			OutputManager.loginInstructions();
			userInput = readString();
			matcher = pattern.matcher(userInput);
		}
		return userInput;
	}
	
}
