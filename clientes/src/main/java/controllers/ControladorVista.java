package controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import vista.*;

public class ControladorVista implements ActionListener {
	private ClienteFrame cframe;
	private PanelOpciones panelOpciones;
	private PanelFormularios panelFormularios;
	
	public ControladorVista(ClienteFrame cframe, PanelOpciones panelOpciones, PanelFormularios panelFormularios) {
		super();
		this.cframe = cframe;
		this.panelOpciones = panelOpciones;
		this.panelFormularios = panelFormularios;
		agregarEventos();
	}

	public void iniciarVista() {
		cframe.setTitle("Clientes CRUD");
		cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cframe.setBounds(100, 100, 345, 300);
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
	

}
