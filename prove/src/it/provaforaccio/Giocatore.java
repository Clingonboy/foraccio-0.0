package it.provaforaccio;

import java.util.ArrayList;
import java.util.List;

public class Giocatore {
	
	private String nome; // Nome del giocatore		
	private int posGiocatore; // Posizione sul tavolo
	private List<Carta> carteInMano; // ArrayList con le carte in mano del giocaotre
	private List<Carta> carteGiocate; // ArreyList con le carte giocate
	private int manoInCorso;
	private String type;
	
	
	
	/**
	 * Costrutotre base
	 */
	public Giocatore(){
		carteInMano = new ArrayList<Carta>();
		carteGiocate = new ArrayList<Carta>();
		manoInCorso = 0;
	}
	
	/**
	 * Importa una lista di carte e le fa diventare <b>{@code carteInMano}<b>
	 * @param carteRicevute {@code ArrayList<Carta>}
	 */
	public void setCarteInMano(List<Carta> carteRicevute)
	{
		carteInMano = carteRicevute;
	}
	
	/**
	 * Metodo privato che aggiunge alla lista di carte giocate
	 * l'ultama carta giocata
	 * @param cartaGiocata
	 */
	private void addCartaGiocata(Carta cartaGiocata)
	{
		carteGiocate.add(cartaGiocata);
	}
	/**
	 * Metodo che restituisce il tipo di giocatore
	 * @return String Human oppure Robot
	 */
	public String getType()
	{
		return this.type;
	}
	
	/////// metodo temporaneo per testare il giocatotre
	/////// questi metodi dovranno essere cancellati !!!!!
	public List<Carta> getCarte(){
		return this.carteInMano;
	}
}
