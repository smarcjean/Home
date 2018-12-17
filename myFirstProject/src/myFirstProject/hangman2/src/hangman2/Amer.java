package hangman2;

public class Amer {

	private String Question;
	private String Answer;
	private int points = 0;
	private int tries = 6;
	private String guess;
	public boolean wordIsSolved = false;
	
	
	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getTries() {
		return tries;
	}

	public void setTries(int tries) {
		this.tries = tries;
	}

	public String getGuess() {
		return guess;
	}

	public void setGuess(String guess) {
		this.guess = guess;
	}

	public boolean isWordIsSolved() {
		return wordIsSolved;
	}

	public void setWordIsSolved(boolean wordIsSolved) {
		this.wordIsSolved = wordIsSolved;
	}


	
	public boolean outOfTries() {
		return true;
			
		
		}
	public boolean end() {
		if (outOfTries() == true) {
			return true;
	}else {
		return false;
	}
		
	
	
}
	
}