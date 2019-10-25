package testMain;

import java.util.ArrayList;

import utility.LeggiFile;
import utility.ScegliMostro;

public class TestMain {

	public static void main(String[] args) {
		
		LeggiFile ape = new LeggiFile();

		ArrayList <String> link = new ArrayList <String>();
		ArrayList <String> caricamento = new ArrayList <String>();
//		ScegliMostro scegli = new ScegliMostro();
//		Informazioni info = new Informazioni();
//		Informazioni.setLI(5);
//		System.out.println("LI = " + Informazioni.getLI());
//		Informazioni.setLivPG(1);
//		Generatore gen = new Generatore();
//		try {
//			ape.leggiMostro(scegli.scelta());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			ape.leggiLink("data\\LinkGS\\link.txt", link);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(link.get(2));
//		System.out.println("LI GENERATORE " + gen.getLI());
//		System.out.println("grado sfida = " + gen.getGS());
		
//		PuntiFerita pf = new PuntiFerita();
//		System.out.println(pf.getPuntiFerita());
		
//		ape.method1(ape.getMappa());
//		System.out.println(ape.getLink().get(1));
		
	}
	
}
