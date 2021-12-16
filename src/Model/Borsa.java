package Model;

import DAO.BorsaDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class Borsa.
 */
public class Borsa  {
	
	/** The citta. */
	private String citta = "New York";
	
	/** The listino. */
	private Listino listino;

	/**
	 * @param listino the listino to set
	 */
	public void setListino(Listino listino) {
		this.listino = listino;
	}

	/**
	 * Instantiates a new borsa.
	 *
	 * @param c the c
	 */
	public Borsa(String c) {
		citta = c;
		listino = new Listino();
	}

	/**
	 * Gets the citta.
	 *
	 * @return the citta
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * Sets the citta.
	 *
	 * @param citta the new citta
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * Gets the listino.
	 *
	 * @return the listino
	 */
	public Listino getListino() {
		return listino;
	}
}
