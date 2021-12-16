package Model;

import java.time.LocalDate;
import java.util.ArrayList;

import DAO.GiocatoreDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class Giocatore.
 */
public class Giocatore {
	
	/** The capitale. */
	private float capitale;
	
	/** The liquidita. */
	private float liquidita;
	
	/** The nome. */
	private String nome;

	/** The acquisto. */
	private ArrayList<Acquisto> acquisto = null;

	/**
	 * Instantiates a new giocatore.
	 *
	 * @param n the n
	 * @param c the c
	 */
	public Giocatore(String n, Float c) {
		nome = n;
		capitale = c;
		liquidita = capitale;
		acquisto = new ArrayList<Acquisto>();
	}

	/**
	 * Calcola capitale.
	 */
	public void calcolaCapitale() {
		capitale = liquidita;
		for (Acquisto a : acquisto) {
			capitale += (a.getQuantita() * a.getSocieta().getPrezzoAzione());
		}
	}

	/**
	 * Gets the capitale.
	 *
	 * @return the capitale
	 */
	public float getCapitale() {
		return capitale;
	}

	/**
	 * Gets the liquidita.
	 *
	 * @return the liquidita
	 */
	public float getLiquidita() {
		return liquidita;
	}

	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the liquidita.
	 *
	 * @param f the new liquidita
	 */
	public void setLiquidita(float f) {
		liquidita = f;

	}

	/**
	 * Gets the lista acquisti.
	 *
	 * @return the lista acquisti
	 */
	public ArrayList<Acquisto> getListaAcquisti() {
		return acquisto;
	}
	
	public void acquista(int i, LocalDate now, float prezzo, Societa societa) {
		// TODO : verifica che la liquidita sia sufficiente
		Acquisto a = new Acquisto(i, now, prezzo, societa, this);
		acquisto.add(a);
	}

	public void setListaAcquisti(ArrayList<Acquisto> listaAcquisti) {
		this.acquisto=listaAcquisti;
	}
}
