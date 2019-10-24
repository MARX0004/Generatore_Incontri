package gui;

public class Informazioni {

	private static int livPG = 1;
	private static double GS = 0.125;
	private static int LI = 1; // equivale al livello medio dei pg dell'avventura
	private static int nrPG = 2;
	private static String ambiente = "";
	
	
	public static int getLivPG() {
		return livPG;
	}
	public static void setLivPG(int livPG) {
		Informazioni.livPG = livPG;
	}
	public static double getGS() {
		return GS;
	}
	public static void setGS(double gS) {
		GS = gS;
	}
	public static int getLI() {
		return LI;
	}
	public static void setLI(int lI) {
		LI = lI;
	}
	public static int getNrPG() {
		return nrPG;
	}
	public static void setNrPG(int nrPG) {
		Informazioni.nrPG = nrPG;
	}
	public static String getAmbiente() {
		return ambiente;
	}
	public static void setAmbiente(String ambiente) {
		Informazioni.ambiente = ambiente;
	}
	
	
	
}
