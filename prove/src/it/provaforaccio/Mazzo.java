package it.provaforaccio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mazzo {
	
	private List<Carta> carte;
	private List<String>semi = new ArrayList<String>(Arrays.asList("Coppe", "Denari", "Spade","Bastoni"));
	private List<String>nomi = new ArrayList<String>(Arrays.asList("Uno", "Do", "Tre", "Quattro",
			"Zinque", "Siè", "Sette", "Oto", "Nove", "Diese", "Fante", "Cavallo", "Rè"));
	
	
	/**
	 * Costruttore, crea un mazzo di carte
	 */
	public Mazzo()
	{
		carte = new ArrayList<Carta>();
		
		for (String seme : semi)
		{
			int v = 1;
			for (String nome : nomi)
			{
				carte.add(new Carta(v, nome, seme));
				v++;
			}
			
			// comando per mescolare le carte
			Collections.shuffle(carte);
		}
		
		
	}
	
	/**
	 * Restituisce la carta alla posizione n
	 * @param n
	 * @return
	 */
	public Carta getCarta(int n)
	{
		Carta carta = carte.get(n);
		return carta;
		
	}
	
	/**
	 * Restituisce le carte del mazzo
	 * @return un ArrayList di carte
	 */
	public List<Carta> getCarte(){
		return carte;
	}
	
}
