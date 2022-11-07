package controllers;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import vista.*;

public class ControladorVista implements ActionListener {
	private ClienteFrame cframe;
	private PanelOpciones panelOpciones;
	private PanelFormularios panelFormularios;
	
	public void iniciarVista() {
		panelOpciones = new PanelOpciones();
		panelFormularios = new PanelFormularios();
		cframe = new ClienteFrame(panelOpciones, panelFormularios);
		agregarEventos();
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
