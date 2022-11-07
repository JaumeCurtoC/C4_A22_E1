package vista;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel{
	

	public PanelOpciones() {
		
		setBounds(10, 11, 122, 239);
		setLayout(new GridLayout(6, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Operación a realizar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblNewLabel);
		
		JButton btnCrearCliente = new JButton("Crear cliente");
		add(btnCrearCliente);
		
		JButton btnEliminarCliente = new JButton("Eliminar cliente");
		add(btnEliminarCliente);
		
		JButton btnModificarCliente = new JButton("Modificar cliente");
		add(btnModificarCliente);
		
		JButton btnListarClientes = new JButton("Listar clientes");
		add(btnListarClientes);
		
		JButton btnBuscarCliente = new JButton("Buscar cliente");
		add(btnBuscarCliente);
		
	}
	
}
