package controllers;

import models.ConexionSQL;
import models.Clientes;

public class ControladorDB {
	private ConexionSQL modelo;
	private Clientes clientes;
	
	public static void iniciarDB() {
		modelo.connectar();
		modelo.crearDB();
		clientes.createTable();
		clientes.insertClientes();
	}
	
	
}
