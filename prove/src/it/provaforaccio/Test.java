package it.provaforaccio;

import java.util.ArrayList;
import java.util.List;

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
	 * è una prova
	 */
	public Test()
	{
		// Creazione del mazzo
		mazzo = new Mazzo();
		// Creazione di giocatori
		giocatori = new ArrayList<Giocatore>();
		giocatori.add(new Giocatore());
		giocatori.add(new Giocatore());
		giocatori.add(new Giocatore());
		giocatori.add(new Giocatore());
		
		//Ciclo per assegnare le carte ai giocatori
		int partenza = 0;
		for (int x = 0; x < 4; x++)
		{
			this.giocatori.get(x).setCarteInMano(this.mazzo.getListCarte(partenza, partenza+13));
			partenza +=13;
		}
	
		
	}

}
