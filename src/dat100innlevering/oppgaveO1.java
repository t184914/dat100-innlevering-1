package dat100innlevering;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class oppgaveO1 {

public static void main(String[] args) {
	
		
		String bruttoinntekt = showInputDialog("Skriv inn bruttoinntekt:");
		double brutto = parseInt(bruttoinntekt);
		double skatt = 0;
		
		if (brutto >= 208051 && brutto <= 292850) {
			
			skatt = brutto * 0.017; 
			System.out.println("Du må betale 1,7% i skatt");
		} else if (brutto >= 292851 && brutto <= 670000) {
			skatt = brutto * 0.04;
			System.out.println("Du må betale 4,0% i skatt");
		} else if (brutto >= 670001 && brutto <= 937900) {
			skatt = brutto * 0.136;
			System.out.println("Du må betale 13,6% i skatt");
		} else if (brutto >= 937901 && brutto <= 1350000) {
			skatt = brutto * 0.166;
			System.out.println("Du må betale 16,6% i skatt");
		} else if (brutto >= 1350001) {
			skatt = brutto * 0.176;
			System.out.println("Du må betale 17,6% i skatt");
		} else { 
			System.out.println("Du må ikkje betale skatt");
		}
		
		double netto = brutto - skatt;
		
		System.out.println("Dette betaler du i skatt:" + skatt + "kr");
		System.out.println("Etter skatt har du:" + netto + "kr");
		
}
}