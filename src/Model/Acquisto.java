package Model;

import java.time.LocalDate;
import java.util.Date;

import DAO.AcquistoDAO;
import DAO.GiocatoreDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class Acquisto.
 */
public class Acquisto{
	
	/** The quantita. */
	private int quantita;
	
	/** The istante. */
	private LocalDate istante;
	
	/** The prezzo acquisto. */
	private float prezzoAcquisto;

	/** The societa. */
	private Societa societa;
	
	/** The acquirente. */
	private Giocatore acquirente;

	/**
	 * Instantiates a new acquisto.
	 *
	 * @param q the q
	 * @param localDate the local date
	 * @param p the p
	 * @param a the a
	 * @param g the g
	 */
	public Acquisto(int q, LocalDate localDate, float p, Societa a, Giocatore g) {
		acquirente = g;
		societa = a;
		quantita = q;
		istante = localDate;
		prezzoAcquisto = p;
		// aggiorno la liquidita dopo l'acquisto
		g.setLiquidita(g.getLiquidita() - quantita * prezzoAcquisto);
	}

	/**
	 * Gets the quantita.
	 *
	 * @return the quantita
	 */
	public int getQuantita() {
		return quantita;
	}

	/**
	 * Gets the istante.
	 *
	 * @return the istante
	 */
	public LocalDate getIstante() {
		return istante;
	}

	/**
	 * Gets the prezzo acquisto.
	 *
	 * @return the prezzo acquisto
	 */
	public float getPrezzoAcquisto() {
		return prezzoAcquisto;
	}

	/**
	 * Gets the societa.
	 *
	 * @return the societa
	 */
	public Societa getSocieta() {
		return societa;
	}

	/**
	 * Gets the acquirente.
	 *
	 * @return the acquirente
	 */
	public Giocatore getAcquirente() {
		return acquirente;
	}

}
