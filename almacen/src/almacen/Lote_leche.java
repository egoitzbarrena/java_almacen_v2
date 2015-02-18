package almacen;

import java.util.ArrayList;
import java.util.Scanner;

import almacen.Leche;

public class Lote_leche {
	
	private static Scanner sc;
	private int numLeches;
	private ArrayList<Leche> leches = new ArrayList<Leche>();
	
	public void añadirLeches() {
	    
		System.out.println(" Â¿ Cuantas leches quieres ?");
		sc = new Scanner(System.in);
		numLeches = sc.nextInt();
		
		for (int i = 0; i < numLeches;i++) {
			Leche le = new Leche();
			le.añadirLeche();
			leches.add(le);
		}
			
	}
	
	public void pintarLeches() {
	
		for (int i = 0; i < leches.size();i++) {
		      
			Leche le = leches.get(i);
			le.añadirLeche();
		}
	}	
		
	public ArrayList<Leche> obtenerLeches() {
		
		return leches;
	}

}