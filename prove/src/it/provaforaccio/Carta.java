package it.provaforaccio;

public class Carta {
	/**
	 * classe che definisce l'oggetto carta
	 * 
	 */
	
	private String seme;
	private int valore;
	private String nome;
	
	public String getSeme() {
		return seme;
	}
	public void setSeme(String seme) {
		this.seme = seme;
	}
	public int getValore() {
		return valore;
	}
	public void setValore(int valore) {
		this.valore = valore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "carta [ " + nome + " de " + seme + " ]";
	}
	
	/**
	 * Costruttore standard
	 * @param valore integer che rappresenta il valore
	 * @param nome nome inteso come valore
	 * @param seme il seme della carta
	 */
	public Carta(int valore, String nome, String seme)
	{
		this.valore = valore;
		this.nome = nome;
		this.seme = seme;
	}
	
	/**
	 * Costruttore per creare una carta uguale ad una carta
	 * esistente passata come parametro
	 * @param unaCarta
	 */
	public Carta(Carta unaCarta)
	{
		this.valore = unaCarta.getValore();
		this.nome = unaCarta.getNome();
		this.seme = unaCarta.getSeme();
	}
	

}
