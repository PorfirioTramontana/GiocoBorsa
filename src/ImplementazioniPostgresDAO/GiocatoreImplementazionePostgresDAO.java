package ImplementazioniPostgresDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import DAO.GiocatoreDAO;
import DAO.ListinoDAO;
import Database.ConnessioneDatabase;
import Model.Acquisto;
import Model.Borsa;
import Model.Giocatore;
import Model.Societa;

public class GiocatoreImplementazionePostgresDAO implements GiocatoreDAO {

	private Connection connection;

	public GiocatoreImplementazionePostgresDAO() {
		try {
			connection = ConnessioneDatabase.getInstance().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void acquistaDB(Giocatore g, int quantita, LocalDate now, float prezzo, Societa societa) {
		try {
			PreparedStatement nuovoAcquistoPS = connection.prepareStatement(
					"INSERT INTO \"Borsa\".\"Acquisto\" " + 
					"(\"Societa\", \"Giocatore\", \"Quantita\", \"Prezzo\")" +
					"VALUES ('"+societa.getNome()+"','"+g.getNome()+"', "+quantita+", "+prezzo+");");
			nuovoAcquistoPS.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
