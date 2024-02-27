import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaComponentes extends JFrame{
	
	public VentanaComponentes () {
		
		this.setVisible(true);//hace que la venna sea visible
		this.setSize(1000,750);//tamaño de la ventana
		this.setTitle("Mi ventana");//pone un titulo 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esto cierra la ventana 
		this.setMinimumSize(new Dimension (250,250));//tamaño minimo
		this.setMaximumSize(new Dimension (1000,270));//tamaño maximo
		this.setLocation(200,200);//es la localidad de la ventana 
		this.setLayout(null);
		this.setLocationRelativeTo(null);//centrar pantalla
			
		iniciarComponentes();//ayuda a agregar el JPanel
	}
	
	public void iniciarComponentes() {
		
		this.login();
		//this.registro();
		//this.admin();
		//this.calculadora();
		
		this.repaint();
		this.validate();
		
	}
	
	public void calculadora(){
		
		JPanel calculadora = new JPanel();
		calculadora.setSize(this.getWidth(),this.getHeight());
		calculadora.setBackground(Color.green);
		calculadora.setLayout(null);
		
		
		
		JLabel pantalla = new JLabel("0",4);
		pantalla.setBounds(310, 75, 290, 40);
		pantalla.setOpaque(true);
		pantalla.setBackground(Color.white);
		calculadora.add(pantalla);
		
		JButton boton_MC= new JButton("MC");
		boton_MC.setBounds(319, 155, 60, 60);
		calculadora.add(boton_MC);
		
		JButton boton_M_mas= new JButton("M+");
		boton_M_mas.setBounds(389, 155, 60, 60);
		calculadora.add(boton_M_mas);
		
		JButton boton_entre= new JButton("/");
		boton_entre.setBounds(460, 155, 60, 60);
		calculadora.add(boton_entre);
		
		JButton boton_x= new JButton("x");
		boton_x.setBounds(530, 155, 60, 60);
		calculadora.add(boton_x);
		
		JButton boton_7= new JButton("7");
		boton_7.setBounds(319, 220, 60, 60);
		calculadora.add(boton_7);
		
		JButton boton_8= new JButton("8");
		boton_8.setBounds(389, 220, 60, 60);
		calculadora.add(boton_8);
		
		JButton boton_9= new JButton("9");
		boton_9.setBounds(460, 220, 60, 60);
		calculadora.add(boton_9);
		
		JButton boton_menos= new JButton("-");
		boton_menos.setBounds(530, 220, 60, 60);
		calculadora.add(boton_menos);
		
		JButton boton_4= new JButton("4");
		boton_4.setBounds(319, 285, 60, 60);
		calculadora.add(boton_4);
		
		JButton boton_5= new JButton("5");
		boton_5.setBounds(389, 285, 60, 60);
		calculadora.add(boton_5);
		
		JButton boton_6= new JButton("6");
		boton_6.setBounds(460, 285, 60, 60);
		calculadora.add(boton_6);
		
		JButton boton_mas= new JButton("-");
		boton_mas.setBounds(530, 285, 60, 60);
		calculadora.add(boton_mas);
		
		JButton boton_1= new JButton("1");
		boton_1.setBounds(319, 355, 60, 60);
		calculadora.add(boton_1);
		
		JButton boton_2= new JButton("2");
		boton_2.setBounds(389, 355, 60, 60);
		calculadora.add(boton_2);
		
		JButton boton_3= new JButton("3");
		boton_3.setBounds(460, 355, 60, 60);
		calculadora.add(boton_3);
		
		JButton boton_0= new JButton("0");
		boton_0.setBounds(319, 420, 130, 60);
		calculadora.add(boton_0);
		
		JButton boton_punto= new JButton(".");
		boton_punto.setBounds(460, 420, 60, 60);
		calculadora.add(boton_punto);
		
		JButton boton_igual= new JButton("=");
		boton_igual.setBounds(530, 355, 60, 125);
		calculadora.add(boton_igual);
		
		JLabel fondo2 = new JLabel();
		fondo2.setBounds(310, 150, 290, 340);
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.white);
		calculadora.add(fondo2);
		
		JLabel fondo = new JLabel();
		fondo.setBounds(300, 50, 310, 450);
		fondo.setOpaque(true);
		fondo.setBackground(Color.gray);
		calculadora.add(fondo);
		

	
		
		
		this.add(calculadora);
	}
	public void login() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.decode("#1A157D"));
		login.setLayout(null);		
		
		
		
		JLabel login_user_tag = new JLabel("User Login",0);
		login_user_tag.setSize(300,80);
		login_user_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 30));
		login_user_tag.setForeground(Color.white);
		login_user_tag.setLocation(100,10);
		login_user_tag.setOpaque(true);
		login_user_tag.setBackground(Color.decode("#1A157D"));
		login.add(login_user_tag);
	
		
		JLabel logo_user = new JLabel();
		logo_user.setIcon(new ImageIcon(getClass().getResource("user.png")));
		logo_user.setBounds(50,153,256,256);
		login.add(logo_user);
		
		JLabel logo_pass = new JLabel();
		logo_pass.setIcon(new ImageIcon(getClass().getResource("lock.png")));
		logo_pass.setBounds(50,230,256,256);
		login.add(logo_pass);
		
		JLabel login_tag = new JLabel("My Account",0);
		login_tag.setSize(300,80);
		login_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 30));
		login_tag.setForeground(Color.yellow);
		login_tag.setLocation(100,120);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.decode("#08034E"));
		login.add(login_tag);
		
				
		
		JLabel usr_tag=new JLabel("Enter Your Username ");
		
		usr_tag.setBounds(100, 220, 300, 40);
		usr_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 15));
		usr_tag.setForeground(Color.white);
		login.add(usr_tag);
		
		JTextField ust_field = new JTextField();
		ust_field.setBounds(100,260,300,40);
		login.add(ust_field);
		
		JLabel pwd_tag=new JLabel("Enter Your Password ");
		
		pwd_tag.setBounds(100, 300, 300, 40);
		pwd_tag.setFont(new Font ("bradLey Hand", Font.BOLD, 15));
		pwd_tag.setForeground(Color.white);
		login.add(pwd_tag);
		
		JPasswordField pwd_field = new JPasswordField();
		pwd_field.setBounds(100, 340, 300, 40);
		login.add(pwd_field);
		
		/*JCheckBox casilla = new JCheckBox("Recuerdame");
		casilla.setBounds(100, 440, 100, 20);
		casilla.setBackground(Color.GRAY);
		login.add(casilla);*/
		
		JLabel forgot_tag =new JLabel("Don´t have a account?");
		
		forgot_tag.setBounds(190, 500, 200, 20);
		forgot_tag.setForeground(Color.white);
		login.add(forgot_tag);
		
		JButton login_Boton_registro = new JButton("Sing Up");
		login_Boton_registro.setBounds(180, 550, 150, 50);
		login_Boton_registro.setForeground(Color.black);
		login_Boton_registro.setOpaque(true);
		login_Boton_registro.setBackground(Color.decode("#E0F40A"));
		login.add(login_Boton_registro);
		
		JButton login_Boton = new JButton("Login");
		login_Boton.setBounds(180, 400, 150, 50);
		login_Boton.setOpaque(true);
		login_Boton.setBackground(Color.decode("#E0F40A"));
		login_Boton.setForeground(Color.black);
		login.add(login_Boton);
		
		JLabel fondo2=new JLabel("");
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.decode("#08034E"));
		fondo2.setBounds(30, 100, 430, 370);
		
		login.add(fondo2);
		
	
		this.add(login);
		
	}
	public void registro() {
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.decode("#090459"));
		registro.setLayout(null);
		
		JLabel registro_tag = new JLabel("REGISTRO",0);
		registro_tag.setSize(250,80);
		registro_tag.setFont(new Font ("Marker Felt", Font.BOLD, 30));
		registro_tag.setForeground(Color.BLACK);
		registro_tag.setLocation(130,20);
		registro_tag.setOpaque(true);
		registro_tag.setBackground(Color.decode("#33F3FF"));
		registro.add(registro_tag);
	
		JLabel usr_tag=new JLabel("Nombre de Usuario",0);
		
		usr_tag.setBounds(50, 120, 400, 30);
		usr_tag.setFont(new Font ("Marker Felt",Font.ITALIC,20));
		usr_tag.setOpaque(true);
		usr_tag.setBackground(Color.yellow);
		registro.add(usr_tag);
		
		JTextField usr_field = new  JTextField ();
		usr_field.setBounds(50, 160, 400, 30);
		usr_field.setHorizontalAlignment(0);
		usr_field.setFont(new Font("Marker Felt",Font.ITALIC,17));
		registro.add(usr_field);
		
		JLabel bio_tag = new JLabel("BIO",0);
		bio_tag.setBounds(50, 190, 400, 40);
		usr_field.setFont(new Font("Marker Felt",Font.ITALIC,17));
		registro.add(bio_tag);
		
		JTextArea bio_tex = new JTextArea();
		bio_tex.setBounds(50, 230, 400, 80);
		bio_tex.setFont(new Font("Marker Felt",Font.ITALIC,15));
		registro.add(bio_tex);
		
		JLabel prefe_tag = new JLabel("PREFERENCIAS",0);
		prefe_tag.setBounds(50, 310, 400, 40);
		prefe_tag.setFont(new Font("Marker Felt",Font.ITALIC,20));
		registro.add(prefe_tag);
		
		JCheckBox item_box_1 = new JCheckBox("Dulces");
		item_box_1.setBounds(100, 350, 80, 30);
		item_box_1.setFont(new Font("Marker Felt",Font.ITALIC,15));
		item_box_1.setOpaque(true);
		item_box_1.setBackground(Color.decode("#33FF7D"));
		registro.add(item_box_1);
		
		JCheckBox item_box_2 = new JCheckBox("Salados");
		item_box_2.setBounds(200, 350, 80, 30);
		item_box_2.setFont(new Font("Marker Felt",Font.ITALIC,15));
		item_box_2.setOpaque(true);
		item_box_2.setBackground(Color.decode("#33FF7D"));
		registro.add(item_box_2);
		
		JCheckBox item_box_3 = new JCheckBox("Saludables");
		item_box_3.setBounds(310, 350, 100, 30);
		item_box_3.setFont(new Font("Marker Felt",Font.ITALIC,15));
		item_box_3.setOpaque(true);
		item_box_3.setBackground(Color.decode("#33FF7D"));
		//item_box_3.setBorderPainted(true);
		//item_box_3.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
		registro.add(item_box_3);
		
		
		JLabel term_tag = new JLabel("TÉRMINOS",0);
		term_tag.setBounds(50, 390, 400, 40);
		term_tag.setFont(new Font("Marker Felt",Font.ITALIC,20));
		term_tag.setOpaque(true);
		term_tag.setBackground(Color.yellow);
		registro.add(term_tag);
		
		JRadioButton accept_radio = new JRadioButton("Accepto los terminos");
		accept_radio.setBounds(50, 450, 170, 20);
		accept_radio.setFont(new Font("Market Felt",Font.ITALIC,15));
		accept_radio.setOpaque(true);
		accept_radio.setBackground(Color.decode("#33FF7D"));
		registro.add(accept_radio);
		
		JRadioButton den_radio = new JRadioButton("No accepto los terminos");
		den_radio.setBounds(250, 450, 190, 20);
		den_radio.setFont(new Font("Market Felt",Font.ITALIC,15));
		den_radio.setOpaque(true);
		den_radio.setBackground(Color.decode("#33FF7D"));
		registro.add(den_radio);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_radio);
		terms.add(den_radio);
		
		String zonas []= {"Centro","Camino Real","Pedregal","Conchalito","La 8"};
		JComboBox colonias = new JComboBox(zonas);
		colonias.setBounds(50, 490, 400, 40);
		colonias.setFont(new Font("Market Felt",Font.ITALIC,15));
		registro.add(colonias);
		
		JButton registro_Boton = new JButton("Crear Cuenta");
		registro_Boton.setBounds(150, 550, 200, 80);
		registro.add(registro_Boton);
		
		
		this.add(registro);
		
	}
	public void admin() {
		
		//añadir panel
		
		JPanel admin_panel = new JPanel();
		admin_panel.setSize(this.getWidth(),this.getHeight());
		admin_panel.setLocation(0,0);
		admin_panel.setBackground(Color.decode("#33FF7D"));
		admin_panel.setLayout(null);
		
		//añadir un menu
		
		JMenuBar barra = new JMenuBar();//crea la barra
		
		//objeto de la barra que crea un apartado
		JMenu menu_file= new JMenu("Archivo");
		
		barra.add(menu_file);
		
		//items de la barra del apartado de archivo
		JMenuItem open_Item = new JMenuItem("Abrir archivo...");
		JMenuItem crear_Item = new JMenuItem("Crear archivo...");
		
		menu_file.add(open_Item);
		menu_file.add(crear_Item);
		
		this.setJMenuBar(barra);
		
		//contenido de panel
		
		JLabel users_tag = new JLabel("Usuarios",0);
		users_tag.setSize(300,80);
		users_tag.setFont(new Font ("Marker Felt", Font.BOLD, 30));
		users_tag.setForeground(Color.BLACK);
		users_tag.setLocation(350,20);
		users_tag.setOpaque(true);
		users_tag.setBackground(Color.decode("#33F3FF"));
		admin_panel.add(users_tag);
		
		
		JLabel title_widget = new JLabel("Total de usuarios",0);
		title_widget.setBounds(40, 120, 300, 40);
		title_widget.setFont(new Font("Market Felt",Font.ITALIC,15));
		title_widget.setForeground(Color.WHITE);
		admin_panel.add(title_widget);
		
		JLabel content_widget = new JLabel("100",0);
		content_widget.setBounds(40, 150, 300, 40);
		content_widget.setFont(new Font("Market Felt",Font.ITALIC,20));
		content_widget.setForeground(Color.WHITE);
		admin_panel.add(content_widget);
		
		JLabel widget = new JLabel("");
		widget.setBounds(40, 120, 300, 80);
		widget.setOpaque(true);
		widget.setBackground(Color.black);
		admin_panel.add(widget);
		
		JButton donwload = new JButton("Exportar");
		//donwload.setOpaque(true);
		//donwload.setBackground(Color.black);
		donwload.setBounds(730, 230, 100, 40);
		admin_panel.add(donwload);
		
		JButton add_user = new JButton("añadir");
		add_user.setBounds(850, 230, 100, 40);
		admin_panel.add(add_user);
		
	
		//añafir una tabla
		
		String titles_tag []= {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"};
		
		String table_data [][]= {{"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"},
								 {"No. cotrol","Nombre","apellidos","Semestre","Promedio","Acciones"}};
		
		JTable table = new JTable(table_data,titles_tag);
		//table.setBounds(40, 280, 920, 300);
		JScrollPane table_croll = new JScrollPane(table);
		table_croll.setBounds(40, 280, 920, 300);
		admin_panel.add(table_croll);
		this.add(admin_panel);
		
	}
}
	
