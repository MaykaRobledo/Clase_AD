package ut2_ejercicio17.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Conexion instance;
	private Connection con;
	
	
	private Conexion () {
		try {
			
			Class.forName(ParámetrosConexion.driver);
			con = DriverManager.getConnection(ParámetrosConexion.cadenaConection, ParámetrosConexion.usuarios, ParámetrosConexion.contrasenia);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Conexion getInstance() {
		if (instance == null) {
			instance = new Conexion();
		}
		return instance;
	}


	public Connection getCon() {
		return con;
	}
	
	public void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
