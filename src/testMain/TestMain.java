package testMain;

import calcoli.*;
import gui.Informazioni;
import utility.*;

public class TestMain {

	public static void main(String[] args) {
		
		LeggiFile ape = new LeggiFile();
		ScegliMostro scegli = new ScegliMostro();
//		Informazioni info = new Informazioni();
		Informazioni.setLI(5);
//		System.out.println("LI = " + Informazioni.getLI());
		Informazioni.setLivPG(1);
		Generatore gen = new Generatore();
		try {
			ape.leggi(scegli.scelta());
		} catch (Exception e) {
			e.printStackTrace();
		}
//		
//		System.out.println("LI GENERATORE " + gen.getLI());
//		System.out.println("grado sfida = " + gen.getGS());
		
//		PuntiFerita pf = new PuntiFerita();
//		System.out.println(pf.getPuntiFerita());
		
//		ape.method1(ape.getMappa());
		
		
	}
	
}
