package quizz;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Utilities {
	
	public static final String ACCOUNTS_PATH = "./accounts/";
	
	public static void displayAllElements(File[] sourceArray) {
		for (File fileElement: sourceArray) {
			System.out.println(fileElement.toString());
		}
	}
	
	
	public static void displayAllElements(String[] sourceArray) {
		for (String stringElement: sourceArray) {
			System.out.println(stringElement);
		}
	}
	
	public static ArrayList<Double> getConvertedArrayList(String[] initialArray) {
		ArrayList<Double> convertedArray = new ArrayList<Double>();
		
		for (int index=0; index < initialArray.length; index++) {
			 convertedArray.add(Double.parseDouble(initialArray[index]));
		}
		return convertedArray;
	}
	
	public static String readSimpleRegex(String simpleRegex) {
		// Simple regex are in the format ^[<possibleChar1><possibleChar2>....<possibleCharN>]$
		// TODO check if the simpleRegex is properly formatted with another regex
		String userFriendlyFormat = "";
		
		for (int i = 2; i < simpleRegex.length() - 3; i++) {
			userFriendlyFormat += simpleRegex.charAt(i);
			userFriendlyFormat += ", ";
		}
		userFriendlyFormat += String.format("or %s", simpleRegex.charAt(simpleRegex.length() - 3));
		return userFriendlyFormat;
	}
	
	public static String generateSimpleRegex(String possibleChars) {
		return "^[" + possibleChars + "]$";
	}
	
	public static boolean containsRegexPattern(String testedString, String regex) {
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(testedString).find();
	}
	
	public static boolean securePasswordCheck(String password) {
		String digits = "^.*[0-9]{1,}.*$";
		String upperCase = "^.*[A-Z]{1,}.*$";
		String lowerCase = "^.*[a-z]{1,}.*$";
		String specialChars = "^.*[^a-zA-Z0-9]{1,}.*$";
		
		if (password.length() < 8) {
			return false;
		}
		if (!containsRegexPattern(password, digits)) {
			System.out.println("no digits found");
			return false;
		}
		
		if (!containsRegexPattern(password, upperCase)) {
			System.out.println("no upper case found");
			return false;
		}
		
		if (!containsRegexPattern(password, lowerCase)) {
			System.out.println("no lower case found");
			return false;
		}
		
		if (!containsRegexPattern(password, specialChars)) {
			System.out.println("no special char found");
			return false;
		}
		return true;
	}
	
}
