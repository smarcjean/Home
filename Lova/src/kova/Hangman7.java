package kova;

public class Hangman7 {
	private String word;
	private String hint;
	private int chances = 7;
	private String guesses = "";
	
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getHint() {
		return hint;
		
	}
	
	public void setHint(String hint) {
		this.hint = hint;
		
	}
	public int getChances() {
		return chances;	
	}
	public void setChances(int chances) {
		this.chances = chances;
		
	}
	public String getGuesses() {
		return guesses;
	}
	public void setGuesses(String guesses) {
		this.guesses = guesses;
	}
	
	public String mask() {
	    String mask = "";
		
		for (int m = 0; m < word.length(); m++) {
									
			String wordToGuessChar = String.valueOf(word.charAt(m));
			if (guesses.contains(wordToGuessChar)) {
				mask += wordToGuessChar;
			} 
			else { // the word does not contain the guess
				mask += "*";
			}
			
		}
		return mask;
	}
   
	
	public boolean wordIsGuessed() {
		
		
		return !mask().contains("*");
		
	}
	
	public boolean noMoreChances() {
		return chances == 0;
	}
	

}
