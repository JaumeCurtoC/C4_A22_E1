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

	private JPanel contentPane;


	public ClienteFrame() {
		setTitle("Clientes CRUD");
		//podemos meterle un nuevo método donde se hará el exit on close y se cerrará la base de datos
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*-------PANEL OPCIONES --------------------*/
		JPanel panelOpciones = new PanelOpciones();
		
		/*-----------PANEL CONTAINER FORMULARIOS Y RESULTADOS --------------*/
		JPanel panelContainer = new JPanel();
		panelContainer.setBounds(142, 11, 177, 239);
		
		panelContainer.setLayout(new CardLayout(0, 0));
		
		JPanel panelResultados = new JPanel();
		panelContainer.add(panelResultados);
		panelResultados.setLayout(null);
		
		JLabel resultadoLabel = new JLabel("");
		resultadoLabel.setBounds(10, 5, 157, 120);
		panelResultados.add(resultadoLabel);
		
		JPanel panelFormularios = new PanelFormularios();
		panelContainer.add(panelFormularios);
		
		contentPane.add(panelOpciones);
		contentPane.add(panelContainer);
		setVisible(true);
	}
}
