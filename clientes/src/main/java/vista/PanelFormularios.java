package vista;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelFormularios extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField nombreTextfield;
	private JTextField apellidosTextfield;
	private JTextField direccionTextfield;
	private JTextField dniTextfield;
	private JTextField fechaTextfield;

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
		textField_4.setBounds(10, 197, 124, 20);
		formularioCrear.add(textField_4);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(10, 186, 63, 14);
		formularioCrear.add(lblFecha);
		
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
		
		/*------------FORMULARIO ACTUALIZAR ----------------------*/
		JPanel formularioActualizar = new JPanel();
		add(formularioActualizar, "actualizar");
		
		JLabel labelNombre = new JLabel("Nombre: ");
		labelNombre.setBounds(10, 11, 46, 14);
		formularioActualizar.add(labelNombre);
		
		nombreTextfield = new JTextField();
		nombreTextfield.setBounds(10, 24, 124, 20);
		formularioActualizar.add(nombreTextfield);
		nombreTextfield.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido: ");
		labelApellido.setBounds(10, 55, 46, 14);
		formularioActualizar.add(labelApellido);
		
		apellidosTextfield = new JTextField();
		apellidosTextfield.setBounds(10, 68, 124, 20);
		formularioActualizar.add(apellidosTextfield);
		apellidosTextfield.setColumns(10);
		
		JLabel direccionLabel = new JLabel("Dirección: ");
		direccionLabel.setBounds(10, 99, 63, 14);
		formularioActualizar.add(direccionLabel);
		
		direccionTextfield = new JTextField();
		direccionTextfield.setColumns(10);
		direccionTextfield.setBounds(10, 112, 124, 20);
		formularioActualizar.add(direccionTextfield);
		
		JLabel dniLabel = new JLabel("DNI: ");
		dniLabel.setBounds(10, 143, 63, 14);
		formularioActualizar.add(dniLabel);
		
		dniTextfield = new JTextField();
		dniTextfield.setColumns(10);
		dniTextfield.setBounds(10, 155, 124, 20);
		formularioActualizar.add(dniTextfield);
		
		JLabel fechaLabel = new JLabel("Fecha: ");
		fechaLabel.setBounds(10, 186, 63, 14);
		formularioActualizar.add(fechaLabel);
		
		fechaTextfield = new JTextField();
		fechaTextfield.setColumns(10);
		fechaTextfield.setBounds(10, 197, 124, 20);
		formularioCrear.add(fechaTextfield);
		
		
	}

}
