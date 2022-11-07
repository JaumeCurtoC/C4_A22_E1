package controllers;

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
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(panelOpciones.btnBuscarCliente == e.getSource()) {
			System.out.println("clickeaste buscar");
		} else if(panelOpciones.btnCrearCliente == e.getSource()) {
			System.out.println("clickeaste crear");
		}
	}
	

}
