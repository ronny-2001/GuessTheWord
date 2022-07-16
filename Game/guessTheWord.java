package Game;

import java.util.Scanner;

public class guessTheWord {
	
	private boolean play=true;
	private Words  randomWord=new Words();
	private Scanner scan=new Scanner(System.in);
	private int rounds=5;
	private char lastRound;
	
	public void start() {
		do {
			showWord();
			getInput();
			checkInput();
		}while(play);
		
	}
	
	void showWord() {
		System.out.println("\nYou have "+rounds+" tries left.");
		System.out.println(randomWord);
	}
	
	void getInput() {
		System.out.println("\nEnter a Letter to guess a word: ");
		String userGuess=scan.nextLine();
		lastRound=userGuess.charAt(0);
//		randomWord.guess(userGuess.charAt(0));
//		char letter;
//		randomWord.guess(letter);
		
	}
	
	void checkInput() {
		boolean isGuessRight=randomWord.guess(lastRound);
		
		if(isGuessRight) {
			if(randomWord.isGuessRight()) {
				System.out.println("\nCongratualtion, you Won!!!");
				System.out.println("The Word is: "+randomWord);
				play=false;
			}
		}
		else {
			rounds--;
			if(rounds == 0) {
				System.out.println("Sorry,Game is Over!!!");
				play=false;
			}
		}
	}
	
	public void end() {
		scan.close();
		
	}
}
