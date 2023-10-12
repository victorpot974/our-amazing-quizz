package quizz;

import java.io.File;
import java.util.ArrayList;

public class Logon {
	
	private Account[] allAccounts;
	private String accountsPath;
	private Account loggedAccount;
	
	private static String CHOOSE_LOGIN_REGEX = Utilities.generateSimpleRegex("123");

	public Logon(String accountsPath) {
		// TODO Auto-generated constructor stub
		this.accountsPath = accountsPath;
		this.readAccounts();
		
	}
	
	public Logon() {
		// TODO Auto-generated constructor stub
		this.accountsPath = Utilities.ACCOUNTS_PATH;
		this.readAccounts();
		
	}
	
	public void chooseLoginMethod() {
		OutputManager.welcomeInstructions();
		String chosenOption = InputManager.readFilteredString(CHOOSE_LOGIN_REGEX);
		switch (chosenOption) {
		case "1":
			this.askLogin();
			break;
		case "2":
			this.signUp();
			break;
		default:
			this.guestSignIn();
		}
	}
	
	public void readAccounts() {
		File[] accountFiles = FileManager.lsDirectory(this.accountsPath);
		this.allAccounts = new Account[accountFiles.length];
		
		for (int i = 0; i < accountFiles.length; i++) {
			allAccounts[i] = Account.fromFile(accountFiles[i]);
		}
		
	}
	
	public Account createAccount(String username, String password) {
		String filePath = this.accountsPath + username + ".txt"; 
		FileManager.createFile(filePath);
		String fileContent = password + "\n0";
		FileManager.writeFile(filePath, fileContent);
		ArrayList<Double> initialScoreData = new ArrayList<Double>(0);
		return new Account(username, password, initialScoreData);
	}
	
	public void askLogin() {
		OutputManager.authentificationInstructions();
		String username = InputManager.readString();
		OutputManager.enterPassword();
		String password = InputManager.readString();
		OutputManager.jumpLine();
		Account foundAccount = this.matchAccount(username, password);
		if (foundAccount == null) {
			askLogin();
		}
		else {
			this.signIn(foundAccount);
		}
	}
	
	public void signIn(Account account) {
		this.loggedAccount = account;
		OutputManager.succesfulSignIn(account.getUsername());
	}
	
	public void guestSignIn() {
		this.signIn(Account.guest());
	}
	
	public void signUp() {
		OutputManager.signUpInstructions();
		OutputManager.enterUsername();
		String username = InputManager.readString();
		OutputManager.enterPassword();
		String password = InputManager.readString();
		OutputManager.jumpLine();
		Account newAccount = this.createAccount(username, password);
		OutputManager.successfulSignUp(username);
		this.signIn(newAccount);
	}
	
	public Account matchAccount(String username, String password) {
		for  (Account account: this.allAccounts) {
			if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
				return account;
			}
		}
		OutputManager.wrongLoginWarning();
		return null;
	}

}
