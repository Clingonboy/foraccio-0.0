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
	private Tavolo tavolo;
	
	
	
	/**
	 * Costrutotre base
	 */
	public Giocatore(int posizione){
		carteInMano = new ArrayList<Carta>();
		carteGiocate = new ArrayList<Carta>();
		manoInCorso = 0;
		setPosizione(posizione);
		tavolo = new Tavolo();
		
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
	
	/**
	 * Motodo che assegna una posizione al giocatore
	 * @param posizione del giocatore sul tavolo
	 */
	private void setPosizione(int posizione)
	{
		this.posGiocatore = posizione;
	}
	
	/**
	 * Motodo per chiedere la posizione del giocatore
	 * @return int posizione del giocatore sul tavolo
	 */
	public int getPosizione()
	{
		return this.posGiocatore;
	}
	
	/////// metodo temporaneo per testare il giocatotre
	/////// questi metodi dovranno essere cancellati !!!!!
	public List<Carta> getCarte(){
		return this.carteInMano;
	}
}
