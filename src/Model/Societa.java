package Model;

import java.sql.SQLException;

import DAO.ListinoDAO;
import DAO.SocietaDAO;
import ImplementazioniPostgresDAO.ListinoImplementazionePostgresDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class Societa.
 */
public class Societa {

	/** The nome. */
	private String nome;
	
	/** The prezzo azione. */
	private float prezzoAzione;

	/**
	 * Instantiates a new societa.
	 *
	 * @param string the string
	 * @param f the f
	 */
	public Societa(String string, float f) {
		nome = string;
		prezzoAzione = f;
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
	 * Gets the prezzo azione.
	 *
	 * @return the prezzo azione
	 */
	public float getPrezzoAzione() {
		return prezzoAzione;
	}

	/**
	 * Sets the prezzo.
	 *
	 * @param f the new prezzo
	 */
	public void setPrezzo(float f) {
		prezzoAzione = f;

	}


}
