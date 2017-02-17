package it.provaforaccio;

import java.util.ArrayList;
import java.util.List;

public class Tavolo {
	
	
	private List<Carta> carteSulTavolo ;
	private List<Giocatore> giocatori ;
	
	
	
	/**
	 * Costruttore principale
	 * non fa niente
	 */
	public Tavolo()
	{
		this.carteSulTavolo = new ArrayList<Carta>();
		this.giocatori = new ArrayList<Giocatore>() ;
	}
	
	/**
	 * Metodo che restituisce la lista di carte sul tavolo
	 * @return
	 */
	public List<Carta> getCarteSulTavolo()
	{
		return this.carteSulTavolo;
	}
	
	/**
	 * Metodo per aggiungere una carta al tavolo
	 * @param carta
	 */
	public void addCartaGiocata (Carta carta)
	{
		this.carteSulTavolo.add(carta) ;
	}
	
	
	
	

}
