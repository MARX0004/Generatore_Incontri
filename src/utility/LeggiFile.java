package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeggiFile {

	private static HashMap <String, String> Mappa = new HashMap <String, String>();
	
	// Questo metodo elimina gli spazi nella Stringa
	private String eliminaSpazi(String str){ 
			String result = str.replace(" ", "");
			return result;
		}
	
	// 	Questo metodo calcola il numero di caratteri (senza spazi) tra il primo carattere ed il carattere impostato
	private int calcolaCar(String str, char car) {
		int n = str.indexOf(car);
		return n;
	}
	
	// Questo metodo calcola la lunghezza della Stringa
//	public static int calcolaLunghezzaString() {
//		
//		return 0;
//		}
//	
//	public HashMap <String, String> Map(String chiave, String valore){
//		HashMap <String, String> Mappa = new HashMap <String, String>();
//		Mappa.put(chiave, valore);
//		return Mappa;
//		
//	}
	
	/* Questo metodo legge riga per riga le stringhe in un file
	*  Immette nella HashMap come valore ciò che è dopo l' = e come chiave ciò che è prima dell' =  */
	public HashMap <String, String> leggiMostro (String file) throws Exception {
//		HashMap <String, String> Mappa = new HashMap <String, String>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		int lungPrima = 0;
		int lungDopo = 0; 
		String chiave = "";
		String valore = "";
		
		while((line = br.readLine()) != null) {
//			line = eliminaSpazi(line);
			lungPrima = calcolaCar(line, '=');
			chiave = line.substring(0, lungPrima -1);
			
			lungDopo = calcolaCar(line, '=') +2;
			valore = line.substring(lungDopo);
			
			Mappa.put(chiave, valore);
		}
		br.close();
//		method1(Mappa);
		System.out.println("Finito");
		return Mappa;
	}
	
	public ArrayList <String> leggiLink (String file, ArrayList<String> arrayList) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line; 
		String valore = "";
		
		while((line = br.readLine()) != null) {
			line = eliminaSpazi(line);
			valore = line.substring(0);
			
			arrayList.add(valore);
		}
		br.close();
		System.out.println("Finito");
		return arrayList;
	}
	
	
	/* L’interfaccia Entry rappresenta una coppia chiave-valore contenuta in una mappa ed il metodo entrySet() di java.util.Map 
	 * restituisce una collezione iterabile di tutti gli oggetti contenuti nella mappa. Questo significa che è possibile iterare 
	 * tutte le entry attraverso un semplice ciclo for-each:*/
	public void method1( Map<String, String> map ) {
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	    }
	}

//	public HashMap<String, String> getMappa() {
//		return Mappa;
//	}
//
//	public static ArrayList<String> getLink() {
//		return link;
//	}
	
}
