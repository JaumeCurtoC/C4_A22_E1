package vista;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelFormularios extends JPanel {
	
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField nombreTextfield;
	public JTextField apellidosTextfield;
	public JTextField direccionTextfield;
	public JTextField dniTextfield;
	public JTextField fechaTextfield;
	public JButton crearButton;
	public JButton buscarButton;
	public JButton borrarButton;
	public JButton actualizarButton;
	public JButton listarButton;

	public PanelFormularios() {
		setLayout(new CardLayout(0, 0));
		
		/*--------------FORMULARIO CREAR -------------------*/
		JPanel formularioCrear = new JPanel();
		add(formularioCrear, "crear");
		formularioCrear.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(10, 11, 46, 14);
		formularioCrear.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 124, 20);
		formularioCrear.add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(10, 55, 46, 14);
		formularioCrear.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 68, 124, 20);
		formularioCrear.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Dirección: ");
		lblDireccin.setBounds(10, 99, 63, 14);
		formularioCrear.add(lblDireccin);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 112, 124, 20);
		formularioCrear.add(textField_2);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setBounds(10, 143, 63, 14);
		formularioCrear.add(lblDni);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 155, 124, 20);
		formularioCrear.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 199, 124, 20);
		formularioCrear.add(textField_4);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(10, 186, 63, 14);
		formularioCrear.add(lblFecha);
		
		crearButton = new JButton("Crear");
		crearButton.setBounds(10, 235, 89, 23);
		formularioCrear.add(crearButton);
		
		/*--------------FORMULARIO BUSCAR --------------------*/
		JPanel formularioBuscar = new JPanel();
		add(formularioBuscar, "buscar");
		formularioBuscar.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DNI de la persona: ");
		lblNewLabel_1.setBounds(10, 11, 133, 14);
		formularioBuscar.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 24, 133, 20);
		formularioBuscar.add(textField_5);
		textField_5.setColumns(10);
		
		buscarButton = new JButton("Buscar");
		buscarButton.setBounds(10, 55, 89, 23);
		formularioBuscar.add(buscarButton);
		
		/*--------------FORMULARIO BORRAR -----------------*/
		JPanel formularioBorrar = new JPanel();
		add(formularioBorrar, "borrar");
		formularioBorrar.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DNI de la persona");
		lblNewLabel_2.setBounds(10, 11, 130, 14);
		formularioBorrar.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 25, 130, 20);
		formularioBorrar.add(textField_6);
		textField_6.setColumns(10);
		
		borrarButton = new JButton("Borrar");
		borrarButton.setBounds(10, 56, 89, 23);
		formularioBorrar.add(borrarButton);
		
		/*------------FORMULARIO ACTUALIZAR ----------------------*/
		JPanel formularioActualizar = new JPanel();
		add(formularioActualizar, "actualizar");
		formularioActualizar.setLayout(null);
		
		JLabel labelNombre = new JLabel("Nombre: ");
		labelNombre.setBounds(14, 8, 69, 14);
		formularioActualizar.add(labelNombre);
		
		nombreTextfield = new JTextField();
		nombreTextfield.setBounds(14, 21, 120, 20);
		formularioActualizar.add(nombreTextfield);
		nombreTextfield.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido: ");
		labelApellido.setBounds(14, 51, 69, 14);
		formularioActualizar.add(labelApellido);
		
		apellidosTextfield = new JTextField();
		apellidosTextfield.setBounds(14, 65, 120, 20);
		formularioActualizar.add(apellidosTextfield);
		apellidosTextfield.setColumns(10);
		
		JLabel direccionLabel = new JLabel("Dirección: ");
		direccionLabel.setBounds(14, 96, 69, 14);
		formularioActualizar.add(direccionLabel);
		
		direccionTextfield = new JTextField();
		direccionTextfield.setColumns(10);
		direccionTextfield.setBounds(14, 109, 120, 20);
		formularioActualizar.add(direccionTextfield);
		
		JLabel dniLabel = new JLabel("DNI: ");
		dniLabel.setBounds(14, 144, 49, 14);
		formularioActualizar.add(dniLabel);
		
		dniTextfield = new JTextField();
		dniTextfield.setColumns(10);
		dniTextfield.setBounds(14, 158, 120, 20);
		formularioActualizar.add(dniTextfield);
		
		fechaTextfield = new JTextField();
		fechaTextfield.setColumns(10);
		fechaTextfield.setBounds(14, 202, 120, 20);
		formularioActualizar.add(fechaTextfield);
		
		JLabel fechaLabel = new JLabel("Fecha: ");
		fechaLabel.setBounds(14, 189, 49, 14);
		formularioActualizar.add(fechaLabel);
		
		actualizarButton = new JButton("Actualizar");
		actualizarButton.setBounds(14, 233, 108, 23);
		formularioActualizar.add(actualizarButton);
		
		
		
		
	}

}
