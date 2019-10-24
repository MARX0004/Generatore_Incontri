package calcoli;

import utility.LeggiFile;
import utility.Utility;

public class PuntiFerita {

	Utility util = new Utility();
	LeggiFile lettore = new LeggiFile();
//	String file = "data\\GS1\\ape_gigante.txt";
	
	
	private int dadoVita = Integer.parseInt(lettore.getMappa().get("dadoVita"));
	private int nrDV = Integer.parseInt(lettore.getMappa().get("nrDV"));
	private int cos = Integer.parseInt(lettore.getMappa().get("cos"));
	private int modCos = util.calcolaModificatore(cos);
	private int puntiFerita = (util.puntiFerita(dadoVita, nrDV, modCos));	

	public int getPuntiFerita() {
		return puntiFerita;
	}

}
