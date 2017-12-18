package p19;

import java.sql.Connection;
import java.sql.SQLException;

import p18.Connector;

public class CommonDAO {
	private Connector c;
	private Connection con;
	CommonDAO() throws ClassNotFoundException{
		c = new Connector();
	}
	public void openCon() throws SQLException {
		con = c.getConnection();
	}
	public void closeCon() throws SQLException {
		c.close();
	}
	public void commit() throws SQLException {
		con.commit();
	}
	public void rollback() throws SQLException {
		con.rollback();
	}
}
