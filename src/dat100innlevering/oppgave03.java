package dat100innlevering;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oppgave03 {

	public static void main(String[] args) {
		
		String tall = showInputDialog("Skriv inn verdien av n:");
		int n = parseInt(tall);
		
		if(n <= 0) {
			n=1;
			System.out.println("N verdien var feil, N verdien er nå 1.");
		}
		
		int svar = 1;
		
		for (int i = 1; i <= n; i++) {
			 
			svar = i * svar;
					
      System.out.println(svar);
	}

}
}