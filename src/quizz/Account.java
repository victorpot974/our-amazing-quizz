package quizz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Account {
	
	private String username;
	private String password;
	private ArrayList<Double> allScoresAchieved;


	public Account(String username, String password, ArrayList<Double> scoreData) {
		this.username = username;
		this.password = password;
		this.allScoresAchieved = scoreData;
	}
	
	public static Account guest() {
		return new Account("guest", "", new ArrayList<Double>(0));
	}
	
	public static Account fromFile(File accountFile) {

		
		try {
			Scanner fileReader = new Scanner(accountFile);
			String formattedUsername = FileManager.clearTxtExtension(accountFile.getName());
			String readPassword = fileReader.nextLine();
			String[] readScores = fileReader.nextLine().split(";");
			fileReader.close();
			return new Account(formattedUsername, readPassword, Utilities.getConvertedArrayList(readScores));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public ArrayList<Double> getScoreData() {
		return this.allScoresAchieved;
	}
	
	
	public double getHighestScore() {
		return Stats.findMax(allScoresAchieved);
	}
	
	public double getMeanScore() {
		return Stats.calculateMean(allScoresAchieved);
	}
	
	public double getStandardDeviationScore() {
		return Stats.calculateStandardDeviation(allScoresAchieved);
	}

}
