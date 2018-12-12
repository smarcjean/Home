package work;

import java.util.*;

public class Guessing {
	private String word;
	private String guesses = "";
	private int lives = 7;
	private String hint;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getGuesses() {
		return guesses += "";
	}
	public void setGuesses(String guesses) {
		this.guesses = guesses;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	
	public String mask() {
		String mask = "";
		for (int i = 0; i < word.length(); i++) {
			String theWordChar = String.valueOf(word.charAt(i));
				if (guesses.contains(theWordChar)) {
					mask = mask + theWordChar;
				} else {
					mask = mask + "*";
				}
		}
		return mask;
	}
	public boolean theWordIsGuessed() {
		return !mask().contains("*");
	}
	public boolean outOfLives() {
		return lives == 0;
	}
	
		
	}
	
	

