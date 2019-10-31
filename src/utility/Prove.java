package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Prove {

	
	public Prove() {
		try {
			salvaHashMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static HashMap <Integer, ArrayList> Mappa = new HashMap <Integer, ArrayList>();
	private static String link = "data\\LinkGS\\link.txt";
	
	/* Questo metodo crea un HashMap, che come chiave ha il GS dei mostri e come valore ha un ArrayList
	 * che ha come valori i link ai file delle statistiche dei mostri.
	 * */
	public static HashMap <Integer, ArrayList> salvaHashMap () throws Exception {
		
		String line;
		int c = 0;	
		
			for (String p : leggiLink(link)){
				
				ArrayList<String> arrayList = new ArrayList<String>();
				BufferedReader br = new BufferedReader(new FileReader(p));
				while((line = br.readLine()) != null) {
				arrayList.add(line);
				}
				br.close();
				
			Mappa.put(c, arrayList);
			c++;
				}
		


		return Mappa;
	}
	
//	public static String nomi () {
//		String nome = "GS";
//		
//		
//		
//		if(GS <= 0.125){
//	    	  nome += "1!8";
//	       } else if(GS > 0.125 && GS <= 0.16667){
//		    	  nome += "1!6";
//		       } else if(GS > 0.16667 && GS <= 0.25){
//			    	  nome += "1!4";
//			       } else if(GS > 0.25 && GS <= 0.33334){
//				    	  nome += "1!3";
//				       } else if(GS > 0.33334 && GS <= 0.5){
//					    	  nome += "1!2";
//					       } else {
//					    	   nome += (int)GS;
//					       }
//		return nome;
//	}
	
	/* Questo metodo seleziona 1 mostro tra quelli di quel GS*/
	public String nomeGS(double GS) {
		String nome = "GS";
		if(GS <= 0.125){
	    	  nome += "1!8";
	       } else if(GS > 0.125 && GS <= 0.16667){
		    	  nome += "1!6";
		       } else if(GS > 0.16667 && GS <= 0.25){
			    	  nome += "1!4";
			       } else if(GS > 0.25 && GS <= 0.33334){
				    	  nome += "1!3";
				       } else if(GS > 0.33334 && GS <= 0.5){
					    	  nome += "1!2";
					       } else {
					    	   nome += (int)GS;
					       }
		return nome;
		
	}
	
//	 Questo metodo legge e salva in un ArrayList tutti i link di riferimento ai GS dei mostri
	private static ArrayList <String> leggiLink (String file) throws Exception {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = ""; 
//		String valore = "";
		
		while((line = br.readLine()) != null) {
//			line = LeggiFile.eliminaSpazi(line);
//			valore = line.substring(0);
			
			arrayList.add(line);
		}
		br.close();
		return arrayList;
	}

	public static HashMap<Integer, ArrayList> getMappa() {
		return Mappa;
	}
	
	
}
