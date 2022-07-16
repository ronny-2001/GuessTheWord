package Game;

import java.util.Random;

public class Words {
	private String[] randomWords= {"animals","happiness","random","pictures","birthday","ready","extreme",
			                        "properties","ceremony","independent","beneath","information","animation",
			                        "students","resume","engineering","employment","government","motivation"};
	
	private String selectedWord;
	
	//we create Random class to choose random word from randomWords String type Array
	private Random random=new Random(); 
	private char[] letters;
	
	
	public Words() {
		selectedWord=randomWords[random.nextInt(randomWords.length)]; //putting the limit of the index that it can scan.
		letters=new char[selectedWord.length()];
	}
	
	
	
	public String toString() {
//		String word ="";
//		letters[2]='a';
		
		StringBuilder text=new StringBuilder();
		
		
		for(char letter:letters) {
			
			text.append(letter == '\u0000' ?  '_' : letter);
		
//			if(letter == '\u0000') {
////				word = word + '_';
//				text.append('_');
//			}
//			else {
////			word = word + letter;
//				text.append(letter);
//			}
			
//			word += ' ';
			text.append(' ');
		}
		
//		return word;
		return text.toString();
	}

	public boolean isGuessRight() {
		for(char letter:letters) {
			if(letter == '\u0000') {
				return false;
			}
		}
		return true;
	}

	public boolean guess(char letter) {
		boolean guessedRight=false; 
		
		for(int i=0; i<selectedWord.length(); i++){
			if(letter == selectedWord.charAt(i)) {
				letters[i]=letter;
				guessedRight=true;
			}
		}
		return guessedRight; 
	}
}
