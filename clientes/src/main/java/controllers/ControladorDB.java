package controllers;

import models.*;

public class ControladorDB {
	
	public void iniciarDB() {
		ConexionSQL.connectar();
		ConexionSQL.crearDB();
		Clientes.createTable();
		Clientes.insertClientes();
		ConexionSQL.closeConnection();
	}
	
	
}
