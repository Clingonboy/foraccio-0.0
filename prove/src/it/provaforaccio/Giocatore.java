package it.provaforaccio;

import java.util.List;

public class Giocatore {

	private String nome;
	private int posGiocatore;
	private List<Carta> carteInMano;
	private List<Carta> carteGiocate;
	
	
	/**
	 * Costrutotre base
	 */
	public Giocatore(){
		
	}
	
	public void setCarteInMano(List<Carta> carteRicevute)
	{
		carteInMano = carteRicevute;
	}
	
	
}
