package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionSQL {

	static Connection connection;

	public static void connectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Password retirada por seguridad
			connection = DriverManager.getConnection(
					"jdbc:mysql://192.168.0.45:3306?useTimezone=true&serverTimezone=UTC", "remote", "Arcangel1999!");
			System.out.println("Server Connected");
			
			
			
			
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("No se ha podido conectar con la base de datos.");
			System.out.println(ex);
		}
	}
	
	public void crearDB() {
		try {
			// Eliminar la base de datos en caso que exista
			String query = "DROP DATABASE IF EXISTS clientesVideo";
			Statement st = connection.createStatement();
			st.executeUpdate(query);
			// Crear la base de datos desde cero
			query = "CREATE DATABASE clientesVideo";
			st.executeUpdate(query);
			// Indicar la base de datos
			String querydb = "USE clientesVideo;";
			Statement stdb = connection.createStatement();
			stdb.executeUpdate(querydb);
			
			System.out.println("Base de datos creada.");
		}catch(SQLException ex) {
			System.out.println("No se ha podido crear la base de datos.");
			Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	
	
	// M�todo para cerrar la conexi�n con la base de datos
		public static void closeConnection() {
			try {
				connection.close();
				System.out.println("Se ha finalizado la conexi�n con el servidor");
			}catch(SQLException ex) {
				Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

}
