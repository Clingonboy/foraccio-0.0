package it.provaforaccio;

import java.util.ArrayList;
import java.util.List;

/**
 * Questa classe ha solo lo scopo di fare dei test sulla funzionalità delle
 * altre classi
 * 
 * @author eugenio
 *
 */
public class Test {
	
	private Mazzo mazzo;
	private List<Giocatore> giocatori;
	
	public static void main(String[] args)
	{
		// prova di controllo -----------------------
		
		Test test = new Test();
		
		
		// Stampa dei giocatori _____________--______
		for (int x=0; x<4; x++)
		{
			System.out.println(test.giocatori.get(x).toString());
		}
		
		// Stampa delle carte dei giocatori _________________________
		for (int x = 0; x < 4; x++)
		{
			System.out.println("Carte del giocatore: " + x);
			
			List<Carta> miaLista = test.giocatori.get(x).getCarte();
			for (int y=0; y<miaLista.size(); y++)
			{
				System.out.println(miaLista.get(y).toString());
			}
			
		}
		
		
	}
	
	/**
	 * Costruttore per il gioco,
	 * è una prova ---
	 * 
	 * In questa classe vengono creati 4 giocatori
	 * vengono assegnate le carte ad ogni giocatore
	 * 
	 */
	public Test()
	{
		// Creazione del mazzo
		mazzo = new Mazzo();
		// Creazione di giocatori
		// I giocatori con posGiocatore 1 e 3 sono compagni e 2 e 4 sono compagni
		giocatori = new ArrayList<Giocatore>();
		giocatori.add(new Giocatore(1));
		giocatori.add(new Giocatore(2));
		giocatori.add(new Giocatore(3));
		giocatori.add(new Giocatore(4));
		
		//Ciclo per assegnare le carte ai giocatori
		int partenza = 0;
		for (int x = 0; x < 4; x++)
		{
			this.giocatori.get(x).setCarteInMano(this.mazzo.getListCarte(partenza, partenza+13));
			partenza +=13;
		}
		/// Creare un sistema per provare a far giocare le carte ai giocatori
		
		
		
	}
	

}
