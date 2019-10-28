package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Prove {

	static HashMap <Integer, ArrayList> Mappa = new HashMap <Integer, ArrayList>();
	static String file1 = "data\\LinkGS\\link.txt";
	
	
	/* Questo metodo crea un HashMap, che come chiave ha il GS dei mostri e come valore ha un ArrayList
	 * che ha come valori i link ai file delle statistiche dei mostri.
	 * */
	public static HashMap <Integer, ArrayList> salvaHashMap () throws Exception {
		
		
		
		BufferedReader br = new BufferedReader(new FileReader(leggiLink(file1).toString()));
		String line; 
//		String valore = "";
		int c = 0;
		while((line = br.readLine()) != null) {
			ArrayList<String> arrayList = new ArrayList<String>();
			line = LeggiFile.eliminaSpazi(line);
//			valore = line.substring(0);
			
			for (String p : leggiLink(file1)){
				arrayList.addAll(leggiLink(p));
//				System.out.println(p.toString());
			}
//			leggiLink(line);
			
			Mappa.put(c,arrayList);
			c++;
		}
		br.close();
		
		return Mappa;
	
	}
	
//	 Questo metodo legge salva in un ArrayList tutti i link di riferimento ai GS dei mostri
	public static ArrayList <String> leggiLink (String file) throws Exception {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		String line = ""; 
//		String valore = "";
		
		while((line = br.readLine()) != null) {
			line = LeggiFile.eliminaSpazi(line);
//			valore = line.substring(0);
			
			arrayList.add(line);
		}
		br.close();
		return arrayList;
	}
	
	
}
