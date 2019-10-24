package utility;

import java.util.Random;

public class Utility {

//	Questo metodo simula il lancio di un dado tra due estremi
	public static int lancio(int i, int dadoVita) {
		Random rand = new Random();

		int c = ((dadoVita-i) + 1);
		int lancio = (rand.nextInt(c) + i);
		return lancio;
	}
	
	public int puntiFerita(int dv, int nrDV, int cos) {
		int pf = 0;
		
		for (int i = 0; i <= nrDV; i++) {
			pf += (( lancio(1, dv) + cos));
		}
		return pf;
	}
	

//	Questo metodo calcola il modificatore delle statistiche
	public int calcolaModificatore(int mod) {
		if(mod % 2 == 0) {
			mod =  ((mod - 10)/2);
		} else {
			mod =  ((mod - 11) /2);
		}
		return mod;
	}
	
}