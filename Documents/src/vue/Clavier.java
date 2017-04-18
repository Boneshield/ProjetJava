package vue;

import java.util.Scanner;

public class Clavier {
	
	private Scanner scanner= new Scanner(System.in);
	
	public int entreeClavierInt() {
		return this.scanner.nextInt();
	}
	
	public String entreeClavierString() {
		return this.scanner.next();
	}
}
