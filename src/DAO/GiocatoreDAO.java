package DAO;

import java.time.LocalDate;
import java.util.ArrayList;

import Model.Acquisto;
import Model.Borsa;
import Model.Giocatore;
import Model.Societa;

public interface GiocatoreDAO {

	/**
	 * Acquista.
	 *
	 * @param i the i
	 * @param now the now
	 * @param prezzo the prezzo
	 * @param societa the societa
	 */
	void acquistaDB(Giocatore g, int quantita, LocalDate now, float prezzo, Societa societa);


}