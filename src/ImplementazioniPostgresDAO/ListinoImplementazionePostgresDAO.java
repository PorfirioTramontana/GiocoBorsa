package ImplementazioniPostgresDAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import DAO.ListinoDAO;
import DAO.SocietaDAO;
import Database.ConnessioneDatabase;
import Model.Borsa;
import Model.Listino;
import Model.Societa;

public class ListinoImplementazionePostgresDAO implements ListinoDAO {

	private Connection connection;

	public ListinoImplementazionePostgresDAO(){
		try {
			connection = ConnessioneDatabase.getInstance().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Listino leggiListinoDB(Borsa b) {
		PreparedStatement leggiListinoPS;
		Listino l=new Listino();
		try {
			leggiListinoPS = connection.prepareStatement(
					"SELECT * FROM \"Borsa\".\"Societa\" WHERE \"CittaBorsa\"='"+b.getCitta()+"'");
		ResultSet rs = leggiListinoPS.executeQuery();
		while (rs.next()) {
			Societa s = new Societa(rs.getString("Nome"),rs.getFloat("PrezzoAzione"));
			l.addSocieta(s);
			connection.close();
		}
		rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;		
	}


	@Override
	public void addSocietaDB(Societa s, Borsa b) {		
		try {
			PreparedStatement leggiListinoPS = connection.prepareStatement(
					"INSERT INTO \"Borsa\".\"Societa\" " + 
					"(\"Nome\", \"PrezzoAzione\", \"CittaBorsa\")" +
					"VALUES ('"+s.getNome()+"',"+s.getPrezzoAzione()+", '"+b.getCitta()+"');");
			leggiListinoPS.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



}
