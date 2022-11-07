package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class ClienteFrame extends JFrame {

	public JPanel contentPane;
	public JPanel panelOpciones;
	public JPanel panelFormularios;
	public JPanel panelContainer;


	public ClienteFrame(JPanel optionPanel, JPanel formPanel) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*-------PANEL OPCIONES --------------------*/
		panelOpciones = optionPanel;
		
		/*-----------PANEL CONTAINER FORMULARIOS Y RESULTADOS --------------*/
		panelContainer = new JPanel();
		panelContainer.setBounds(142, 11, 177, 269);
		
		panelContainer.setLayout(new CardLayout(0, 0));
		
		JPanel panelResultados = new JPanel();
		panelResultados.setLayout(null);
		
		JLabel resultadoLabel = new JLabel("");
		resultadoLabel.setBounds(10, 5, 157, 150);
		panelResultados.add(resultadoLabel);
		
		panelFormularios = formPanel;
		panelContainer.add(panelFormularios);
		panelContainer.add(panelResultados);
		
		contentPane.add(panelOpciones);
		contentPane.add(panelContainer);
	}
}
