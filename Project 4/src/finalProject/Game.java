	package finalProject;
	
	public class Game {
		private int tries = 5;
		private String answer;
		private String question;
		private String userGuess;
		public boolean answerIsGuessed = false;
		
		public void setGame(String question, String answer) {
			this.question = question;
			this.answer = answer;
					
		}
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
		public int getTries() {
			return tries;
		}
		public void setTries(int tries) {
			this.tries = tries;
		}
		
		public boolean outOfTries() {
			return tries == 0;
		}
		public boolean end (){
			if (outOfTries() == true) {
			
				return true;
				
		}  else {
				return false;
		}
		
	   }
		
	 }	
