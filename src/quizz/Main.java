package quizz;


public class Main {
	
	private static Logon loginManager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account.fromFile(Account.ACCOUNTS_PATH + "vics.txt");
		// OutputManager.welcomeInstructions();
		loginManager = new Logon();
		loginManager.chooseLoginMethod();;
		InputManager.end();
	}

}
