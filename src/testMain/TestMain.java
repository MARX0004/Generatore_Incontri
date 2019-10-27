package testMain;

import java.util.ArrayList;

import utility.LeggiFile;
import utility.Prove;

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
			System.out.println(Prove.salvaHashMap().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		Iterator<String> myIteretor = link.iterator();
//        
//		while (myIteretor.hasNext()){
//		    // visto che abbiamo imposto che l'iterator è di tipo Person
//		    // è sufficiente assegnare il valore al nostro oggetto di tipo Person
//			int i = 0;
//			String p;
//			p = myIteretor.next();
//			for(int i = 0; i < link.size(); i++) {
//				try {
//					ape.leggiLink(link.get(i), caricamento);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		    System.out.println(p.toString());
//		}
//		
//		for (String p : caricamento){
//			System.out.println(p.toString());
////			int i = 0;
////			caricamento.add(link.get(i));
////			i++;
//		}
		
//		HashMap <String, String> GS = new HashMap <String, String>();
//		
//		GS.put("1!8", " ");
		
		
		
		
//		System.out.println(caricamento.get());
		
//		
//		for (String p : caricamento){
//			System.out.println(p.toString());
//		}
		
//		System.out.println(link.get(1));
//		System.out.println("LI GENERATORE " + gen.getLI());
//		System.out.println("grado sfida = " + gen.getGS());
		
//		PuntiFerita pf = new PuntiFerita();
//		System.out.println(pf.getPuntiFerita());
		
//		ape.method1(ape.getMappa());
//		System.out.println(ape.getLink().get(1));
		
	}
	
}
