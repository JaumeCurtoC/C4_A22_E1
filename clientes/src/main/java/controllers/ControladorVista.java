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
		panelFormularios.crearButton.addActionListener(this);
		panelFormularios.buscarButton.addActionListener(this);
		panelFormularios.borrarButton.addActionListener(this);
		panelFormularios.actualizarButton.addActionListener(this);
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
			
		} else if(panelFormularios.crearButton == e.getSource()) {
			String nombre = panelFormularios.crearNombre.getText();
			String apellidos = panelFormularios.crearApellido.getText();
			String dni = panelFormularios.crearDni.getText();
			String direccion = panelFormularios.crearDireccion.getText();
			String fecha = panelFormularios.crearFecha.getText();
			
		} else if(panelFormularios.borrarButton == e.getSource()) {
			String dni = panelFormularios.borrarTexfield.getText();
			
		} else if(panelFormularios.buscarButton == e.getSource()) {
			buscar();
			
		} else if(panelFormularios.actualizarButton == e.getSource()) {
			String nombre = panelFormularios.actualizarNombre.getText();
			String apellidos = panelFormularios.actualizarApellidos.getText();
			String dni = panelFormularios.actualizarDNI.getText();
			String direccion = panelFormularios.actualizarDireccion.getText();
			String fecha = panelFormularios.actualizarFecha.getText();
		}
	}
	
	public void selectCard(JPanel container, String carta) {
		CardLayout cl = (CardLayout)container.getLayout();
		cl.show(container, carta);
	}
	
	public void nextImage(JPanel container) {
		CardLayout cl = (CardLayout) container.getLayout();
		cl.next(container);
	}
	
	public void buscar() {
		Connection c = ConexionSQL.connection;
		int dni = Integer.parseInt(panelFormularios.buscarTextfield.getText());
		String data = "";
		try {
			String query = "SELECT * FROM clientes WHERE dni=" + dni + ";";
			Statement st = c.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(query);
			while (resultSet.next()) {
				data += "nombre: " + resultSet.getString("nombre");
				data += "\nApellidos: " + resultSet.getString("apellido");
				data += "\nDireccion: " + resultSet.getString("direccion");
				data += "\nDni: " + resultSet.getString("dni");
				data += "\nFecha: " + resultSet.getString("fecha");
			}
			nextImage(cframe.panelContainer);
			cframe.labelResultados.setText(data);
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error al insertar datos.");
		}
	}
	
	public void crear() {
		// INSERT VALUES
		Connection c = ConexionSQL.connection;
		String nombre = panelFormularios.crearNombre.getText();
		String apellidos = panelFormularios.crearApellido.getText();
		String dni = panelFormularios.crearDni.getText();
		String direccion = panelFormularios.crearDireccion.getText();
		String fecha = panelFormularios.crearFecha.getText();
		
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
