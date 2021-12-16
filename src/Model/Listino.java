package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.ListinoDAO;
import Database.ConnessioneDatabase;
import ImplementazioniPostgresDAO.ListinoImplementazionePostgresDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class Listino.
 */
public class Listino {
	
	/** The societa. */
	private ArrayList<Societa> societa;

	/**
	 * Instantiates a new listino.
	 */
	public Listino() {
		societa = new ArrayList<Societa>();
	}
	
	/**
	 * Gets the societa.
	 *
	 * @return the societa
	 */
	public ArrayList<Societa> getSocieta() {
		return societa;
	}

	public void addSocieta(Societa s) {
		societa.add(s);		
	}

	public Societa cercaSocieta(Borsa b, String nomeSocieta) {
		//TODO Manca il caso in cui non la troviamo
		for (Societa s:b.getListino().getSocieta())
			if (s.getNome().contentEquals(nomeSocieta)) 
				return s;
		return null;
	}

}