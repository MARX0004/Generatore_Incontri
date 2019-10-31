package testMain;

import calcoli.Generatore;
import gui.Informazioni;
import utility.LeggiFile;
import utility.Prove;
import utility.Utility;

public class TestMain {

	public static void main(String[] args) throws Exception {
		
		LeggiFile ape = new LeggiFile();
		Prove prove = new Prove();
		Generatore generatore = new Generatore();
		
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
		
//		System.out.println(info.getGS());
		
//		try {
//			System.out.println(prove.getMappa().toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		int c, l;
//		
//		c = prove.getMappa().get(5).size() -1;
//			l = Utility.lancio(0, c);
//			try {
//				ape.leggiMostro((String) prove.getMappa().get(5).get(l));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		
//		System.out.println(prove.getMappa().size());
//		generatore.genera(1);
//		
		System.out.println(Informazioni.getGS());
		System.out.println(prove.getMappa().get(4).size()-1);
			generatore.generaMostro(Informazioni.getGS());
		
//		 String cartella = "data\\";
//		 String cartellaGS = prove.nomeGS(info.getGS()) + "\\";
//		 String mostro = cartella + cartellaGS;
//		
//		 System.out.println(mostro);
		 
//		Iterator<String> myIteretor = link.iterator();
        
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
