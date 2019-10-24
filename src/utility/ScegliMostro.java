package utility;

public class ScegliMostro {

	LeggiFile file = new LeggiFile();
	int lancio = Utility.lancio(1, 2);
	String mostro = "";
	String apeGigante = "data\\GS1\\ape_gigante.txt";
	
	public String scelta() {
		
		switch(lancio) {
		
			case 1:
				mostro = apeGigante;
			case 2:
				mostro = apeGigante;
		}
		return mostro;
		 
	}
	
	
}
