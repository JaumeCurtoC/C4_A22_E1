package controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import models.ConexionSQL;
import vista.*;

public class ControladorVista implements ActionListener {
	private ClienteFrame cframe;
	private PanelOpciones panelOpciones;
	private PanelFormularios panelFormularios;
	private ControladorDB controlDB;
	
	public ControladorVista(ClienteFrame cframe, PanelOpciones panelOpciones, PanelFormularios panelFormularios, ControladorDB conDb) {
		super();
		this.cframe = cframe;
		this.panelOpciones = panelOpciones;
		this.panelFormularios = panelFormularios;
		this.controlDB = conDb;
		agregarEventos();
	}

	public void iniciarVista() {
		cframe.setTitle("Clientes CRUD");
		cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cframe.setBounds(100, 100, 345, 350);
		cframe.setVisible(true);
	}
	
	public void agregarEventos() {
		panelOpciones.btnCrearCliente.addActionListener(this);
		panelOpciones.btnBuscarCliente.addActionListener(this);
		panelOpciones.btnEliminarCliente.addActionListener(this);
		panelOpciones.btnListarClientes.addActionListener(this);
		panelOpciones.btnModificarCliente.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(panelOpciones.btnBuscarCliente == e.getSource()) {
			selectCard(cframe.panelFormularios, "buscar");
			
		} else if(panelOpciones.btnCrearCliente == e.getSource()) {
			selectCard(cframe.panelFormularios, "crear");
			
		} else if(panelOpciones.btnEliminarCliente  == e.getSource()) {
			selectCard(cframe.panelFormularios, "borrar");
			
		} else if(panelOpciones.btnModificarCliente == e.getSource()) {
			selectCard(cframe.panelFormularios, "actualizar");
			
		} else if(panelOpciones.btnListarClientes == e.getSource()) {
			//función que lista los usuarios
		}
	}
	
	public void selectCard(JPanel container, String carta) {
		CardLayout cl = (CardLayout)container.getLayout();
		cl.show(container, carta);
	}
	
	public void buscar() {
		// SELECT
	}
	
	public void crear() {
		// INSERT VALUES
		Connection c = ConexionSQL.connection;
		String nombre = panelFormularios.textField.getText().toString();
		String apellido = panelFormularios.textField_1.getText().toString();
		String direccion = panelFormularios.textField_2.getText().toString();
		int dni;
		
		try {
			String query = "INSERT INTO clientes (nombre, apellido, direccion, dni, fecha) values"+
					"('"+ nombre +"','"+ apellido +"','Margarita 1',87654321,'2022-03-12');";
		
			Statement st = c.createStatement();
			st.executeUpdate(query);
			System.out.println("Datos insertados con exito!");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error al insertar datos.");
		}
	}

	public void borrar() {
		// DELETE
	}
	
	public void modificar() {
		// ALTER TABLE
	}
	
	public void listar() {
		// SELECT *
	}
}
