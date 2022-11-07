package controllers;

import models.*;

public class ControladorDB {
	private ConexionSQL modelo;
	private Clientes clientes;
	
	public ControladorDB(ConexionSQL modelo, Clientes clientes) {
		super();
		this.modelo = modelo;
		this.clientes = clientes;
	}

	public static void iniciarDB() {
		modelo.connectar();
		modelo.crearDB();
		clientes.createTable();
		clientes.insertClientes();
	}
	
	
}
