package dat100innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgaveO2 {

	
public static void main(String[] args) {
		
		int antall = 10;
		
		for (int i=1; i <= antall; i++) {
			
			int tall = -1;
			
			while (true) {
			String poengsum = showInputDialog("Skriv inn poengsummenn:");
			tall = parseInt(poengsum);
			
			if (tall >= 0 && tall <= 100) {
				break;
			} else {
				System.out.println("Ugyldig poengsum, prøv igjen.");
			}
			}
			
		
		if(tall <= 100 && tall >= 90) {
			System.out.println("Du har karakteren A");
		} else if(tall <=89 && tall >= 80) {
			System.out.println("Du har karakteren B");
		} else if (tall <= 79 && tall >= 60) {
			System.out.println("Du har karakteren C");
		} else if (tall <= 59 && tall >= 50) {
            System.out.println("Du har karakteren D");
        } else if (tall <= 49 && tall >= 40) {
            System.out.println("Du har karakteren E");
        } else{
            System.out.println("Du har karakteren F");
        } 
        
		
		}	
			
		
	}

}

