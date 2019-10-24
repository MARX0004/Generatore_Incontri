package utility;

public class ScegliMostro {

	LeggiFile file = new LeggiFile();
	int lancio = Utility.lancio(1, 2);
	String mostro = "";
	String apeGigante = "data\\GS1\\ape_gigante.txt";
	String boletoStridente = "data\\GS1\\boleto_stridente.txt";
	
	public String scelta() {
		
		switch(lancio) {
		
			case 1:
				mostro = apeGigante;
			case 2:
				mostro = boletoStridente;
		}
		return mostro;
		 
	}
	
	
}
