package quizz;

import java.io.File;
import java.util.ArrayList;

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
	
}
