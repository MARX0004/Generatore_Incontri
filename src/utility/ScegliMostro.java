package utility;

public class ScegliMostro {

	LeggiFile file = new LeggiFile();
	int lancio = Utility.lancio(1, 3);
	String mostro = "";
	String apeGigante = "data\\GS1\\ape_gigante.txt";
	String boletoStridente = "data\\GS1\\boleto_stridente.txt";
	String arconteLanterna = "data\\GS2\\arconte_lanterna.txt";
	
	
	
	
	
	
	public String scelta() {
		
		switch(lancio) {
		
			case 1:
				mostro = apeGigante;
				break;
			case 2:
				mostro = boletoStridente;
				break;
			case 3:
				mostro = arconteLanterna;
				break;
		}
		return mostro;
		 
	}
	
	
}
