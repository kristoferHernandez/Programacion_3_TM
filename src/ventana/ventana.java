package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class ventana {

	private JFrame frmPokemon;
	private JTextField txtNombre;
	private JTextField txtApalldoPaterno;
	private JTextField txtApellidoMaterno;
	private JTextField txtFechaDeNacimineto;
	private JRadioButton rdbtnFemenino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frmPokemon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPokemon = new JFrame();
		frmPokemon.getContentPane().setBackground(new Color(0, 255, 0));
		frmPokemon.setTitle("Ventana");
		frmPokemon.setBounds(100, 100, 799, 788);
		frmPokemon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokemon.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		frmPokemon.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 1, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 0));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_5.setBounds(10, 11, 371, 337);
		panel_2.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(0, 0, 0));
		panel_6.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(144, 11, 157, 20);
		panel_6.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApalldoPaterno = new JTextField();
		txtApalldoPaterno.setColumns(10);
		txtApalldoPaterno.setBounds(144, 42, 157, 20);
		panel_6.add(txtApalldoPaterno);
		
		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.setColumns(10);
		txtApellidoMaterno.setBounds(144, 73, 157, 20);
		panel_6.add(txtApellidoMaterno);
		
		txtFechaDeNacimineto = new JTextField();
		txtFechaDeNacimineto.setColumns(10);
		txtFechaDeNacimineto.setBounds(144, 107, 157, 20);
		panel_6.add(txtFechaDeNacimineto);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 255));
		rdbtnNewRadioButton.setBounds(132, 160, 109, 23);
		panel_6.add(rdbtnNewRadioButton);
		
		rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(new Color(0, 255, 255));
		rdbtnFemenino.setBounds(132, 186, 109, 23);
		panel_6.add(rdbtnFemenino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perú", "mexico", "canada"}));
		comboBox.setBounds(132, 249, 123, 22);
		panel_6.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(30, 13, 104, 17);
		panel_6.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1.setBounds(30, 44, 104, 17);
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido Materno:");
		lblNewLabel_2.setBounds(30, 75, 104, 17);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_3.setBounds(30, 109, 104, 17);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo:\r\n");
		lblNewLabel_4.setBounds(28, 151, 104, 17);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nacionalidad:");
		lblNewLabel_5.setBounds(45, 225, 104, 25);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" Datos generales");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_5.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 0));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 128));
		panel_7.setBounds(10, 11, 371, 340);
		panel_3.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6_1 = new JLabel(" Perfil del Usuario");
		lblNewLabel_6_1.setBackground(new Color(255, 128, 128));
		lblNewLabel_6_1.setForeground(Color.BLACK);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_7.add(lblNewLabel_6_1, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 128, 128));
		panel_7.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Icono");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setDisplayedMnemonic('2');
		lblNewLabel_8.setBackground(new Color(128, 0, 64));
		lblNewLabel_8.setToolTipText("");
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(117, 11, 139, 190);
		lblNewLabel_8.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));//pintar bordes
		panel_8.add(lblNewLabel_8);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setBounds(120, 226, 150, 23);
		panel_8.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechDe = new JCheckBox("Mostrar fech de Nacimiento");
		chckbxMostrarFechDe.setBackground(new Color(255, 128, 128));
		chckbxMostrarFechDe.setBounds(120, 259, 160, 23);
		panel_8.add(chckbxMostrarFechDe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(128, 64, 64));
		panel_9.setBounds(10, 11, 371, 337);
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel(" Datos Opcionales");
		lblNewLabel_9.setBackground(new Color(128, 64, 64));
		panel_9.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(128, 64, 64));
		panel_9.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Descripcion");
		lblNewLabel_10.setBounds(52, 52, 80, 14);
		panel_10.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Preferencias");
		lblNewLabel_10_1.setBounds(204, 52, 80, 14);
		panel_10.add(lblNewLabel_10_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 89, 120, 120);
		textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));//pintar bordes
		panel_10.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(193, 89, 120, 180);
		textArea_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));//pintar bordes
		panel_10.add(textArea_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 255, 0));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar\r\n");
		btnNewButton.setBounds(151, 130, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setBounds(151, 60, 89, 23);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir\r\n");
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(151, 200, 89, 23);
		panel_4.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("   Registro de Usuarios");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmPokemon.getContentPane().add(lblNewLabel_7, BorderLayout.NORTH);
	}
}
