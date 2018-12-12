package finalProject;

public class Game {
	private int chances = 5;
	private String answer;
	private String question;
	private String userGuess;
	public boolean answerIsGuessed = false;
	
	
	public String getUserGuess() {
		return userGuess;
	}
	public void setUserGuess(String userGuess) {
		this.userGuess = userGuess;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getChances() {
		return chances;
	}
	public void setChances(int chances) {
		this.chances = chances;
	}
	
	public boolean outOfChances() {
		return chances == 0;
	}
	public boolean end (){
		if (outOfChances() == true) {
		
			return true;
		} else {
			return false;
		}
	
	}
}

