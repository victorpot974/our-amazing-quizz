// Main Code

package quizz;


public class Main {

	public static void main(String[] args) {

		Logon login = new Logon();
		login.chooseLoginMethod();
		
		Quiz quiz = new Quiz();
		quiz.run(login);
		
		InputManager.end();

	}
}
