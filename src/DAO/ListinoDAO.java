package DAO;

import java.sql.Connection;

import Model.Borsa;
import Model.Listino;
import Model.Societa;

public interface ListinoDAO {

	public void addSocietaDB(Societa s, Borsa b);

	public Listino leggiListinoDB(Borsa b);

}