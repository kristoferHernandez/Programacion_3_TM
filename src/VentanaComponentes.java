import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
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
		//this.setMinimumSize(new Dimension (250,250));//tamaño minimo
		//this.setMaximumSize(new Dimension (1000,270));//tamaño maximo
		this.setLocation(200,200);//es la localidad de la ventana 
		this.setLayout(null);
		this.setLocationRelativeTo(null);//centrar pantalla
			
		iniciarComponentes();//ayuda a agregar el JPanel
		
	}
	
	public void iniciarComponentes() {
		
		this.login();
		this.registro();
		//this.admin();
		//this.calculadora();
		//this.calculadoraMatriz();
		//this.calcular_Interez();
		
		//this.paint(getGraphics());
		this.repaint();
		this.validate();
		
	}
	
	/*public void paint(Graphics g) {
		
		//super.paint(g);
		
		Graphics2D mario2 = (Graphics2D)g;
		
		
		
		mario2.setColor(Color.decode("#2A3ACC"));
		mario2.fillRect(0, 0, 1100, 650); // cielo
		
		
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(15, 115, 190, 150);
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(15, 200, 190, 400); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(430, 115, 190, 150);
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(430, 200, 190, 400); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(618, 62, 190, 150);
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(618, 140, 190, 400); // pisoVerde
		//FONFOD PILARES
		
		mario2.setColor(Color.decode("#B0CDDC"));
		mario2.fillOval(15, 115, 170, 150);
		
		mario2.setColor(Color.decode("#B0CDDC"));
		mario2.fillRect(15, 200, 170, 400); // pisoVerde
		
		mario2.setColor(Color.decode("#B0CDDC"));
		mario2.fillOval(430, 115, 170, 150);
		
		
		mario2.setColor(Color.decode("#B0CDDC"));
		mario2.fillRect(430, 200, 170, 400); // pisoVerde
		
		mario2.setColor(Color.decode("#B0CDDC"));
		mario2.fillOval(618, 62, 170, 150);
		
		mario2.setColor(Color.decode("#B0CDDC"));
		mario2.fillRect(618, 140, 170, 400); // pisoVerde
		
		//COLOR PILARES

		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(60, 220, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(0, 220, 100, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(60, 220, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(0, 220, 100, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(208, 270, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(411, 270, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(252, 270, 200, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(208, 270, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(411, 270, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(252, 270, 200, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(320, 471, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(370, 471, 60, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(320, 471, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(370, 471, 60, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(335, 421, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(205, 421, 180, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(335, 421, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(205, 421, 180, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(280, 371, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(331, 371, 100, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(280, 371, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(331, 371, 100, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(546, 325, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(585, 325, 100, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(546, 325, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(585, 325, 100, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(840, 182, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(808, 182, 80, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(840, 182, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(808, 182, 80, 45); // pisoSombra
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(811, 135, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillOval(927, 135, 90, 50); // pisoVerde
		
		mario2.setColor(Color.decode("#85A6B8"));
		mario2.fillRect(857, 135, 120, 50); // pisoSombra
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(811, 135, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillOval(927, 135, 90, 45); // pisoVerde
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(857, 135, 120, 45); // pisoSombra
		
		//nubes

		mario2.setColor(Color.decode("#262B61"));
		mario2.fillOval(0, 390, 170, 250);
	
		mario2.setColor(Color.decode("#262B61"));
		mario2.fillRect(0, 390, 75, 90); // pisoSombra
		
		mario2.setColor(Color.decode("#262B61"));
		mario2.fillOval(430, 376,250, 150);
		
		mario2.setColor(Color.decode("#262B61"));
		mario2.fillRect(430, 450, 250, 90); // pisoSombr
		
		mario2.setColor(Color.decode("#262B61"));
		mario2.fillOval(680, 223, 250, 185); // pisoSombr
		
		mario2.setColor(Color.decode("#262B61"));
		mario2.fillRect(680, 325, 250, 195); // pisoSombr
		
		
		//segundo fondo pilares 
		
		
		

		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillOval(0, 400, 150, 250);
		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillRect(0, 400, 75, 90); // pisoSombra
		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillOval(433, 379,230, 150);
		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillRect(433, 453, 230, 90); // pisoSombr
		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillOval(683, 228, 230, 185); // pisoSombr
		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillRect(683, 332, 230, 195); // pisoSombr
		
		mario2.setColor(Color.decode("#6990C4"));
		mario2.fillOval(1025, 330, 230, 185); // pisoSombr
		
		//seguudo color pilares
			
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(524, 376, 120, 50); // pisoSombr
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(530, 425, 107, 100); // pisoSombr
		
		
		//tubo 1 fodo negro 
		
		mario2.setColor(Color.decode("#7A2EE0"));
		mario2.fillRect(527, 379, 113, 43); // pisoSombr
		
		mario2.setColor(Color.decode("#7A2EE0"));
		mario2.fillRect(532, 428, 100, 93); // pisoSombr
		
		//tubo color 1
		
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(553, 379, 10, 43); // pisoSombr
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(561, 428, 10, 93); // pisoSombr
		//raya tubo 1 
		
		
				
		mario2.setColor(Color.white);
		mario2.fillOval(138, 179, 25, 45); // pisoVerde
		
		
		mario2.setColor(Color.white);
		mario2.fillOval(138, 270, 25, 45); // pisoVerde
		

		mario2.setColor(Color.white);
		mario2.fillOval(50, 340, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(478, 325, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(478, 216, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(547, 182, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(661, 182, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(740, 107, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(736, 288, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(837, 378, 25, 45); // pisoVerde
		
		mario2.setColor(Color.white);
		mario2.fillOval(813, 440, 200, 150); // pisoSombr
		
		//PUNTOS bLANCOS
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(886, 328, 60, 200); // piso
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(886, 328, 200, 50); // piso
		
		mario2.setColor(Color.gray);
		mario2.fillRect(890, 330, 52, 45); // piso
		
		mario2.setColor(Color.decode("#CECDC4"));
		mario2.fillRect(890, 330, 50, 40); // piso
		
		mario2.setColor(Color.gray);
		mario2.fillRect(890, 378, 52, 45); // piso
		
		mario2.setColor(Color.decode("#CECDC4"));
		mario2.fillRect(890, 378, 50, 40); // piso
		
		mario2.setColor(Color.gray);
		mario2.fillRect(890, 426, 52, 45); // piso
		
		mario2.setColor(Color.decode("#CECDC4"));
		mario2.fillRect(890, 426, 50, 40); // piso
		
		mario2.setColor(Color.gray);
		mario2.fillRect(890, 474, 52, 45); // piso
		
		mario2.setColor(Color.decode("#CECDC4"));
		mario2.fillRect(890, 474, 50, 40); // piso
		
		mario2.setColor(Color.decode("#9D8E0F"));
		mario2.fillRect(945, 330, 52, 45); // piso
		
		mario2.setColor(Color.decode("#F7DF05"));
		mario2.fillRect(945, 330, 50, 40); // piso
		
		mario2.setColor(Color.decode("#9D8E0F"));
		mario2.fillRect(1000, 330, 52, 45); // piso
		
		mario2.setColor(Color.decode("#F7DF05"));
		mario2.fillRect(1000, 330, 50, 40); // piso
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(956, 337, 5, 15); // piso
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(981, 337, 5, 15); // piso
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(1007, 337, 5, 15); // piso
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(1033, 337, 5, 15); // piso
		
		//cuadrados 
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(946, 424, 120, 50); // pisoSombr
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(951, 474, 107, 100); // pisoSombr
		
		//tubo dos fondo
		
		mario2.setColor(Color.decode("#7A2EE0"));
		mario2.fillRect(949, 427, 113, 43); // pisoSombr
		
		mario2.setColor(Color.decode("#7A2EE0"));
		mario2.fillRect(954, 477, 100, 93); // pisoSombr
		
		
		//tubo dos colores
		
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(970, 427, 10, 43); // pisoSombr
		
		mario2.setColor(Color.decode("#FFFFFF"));
		mario2.fillRect(977, 477, 10, 93); // pisoSombr
		
		//linas tubo dos
		
		
		mario2.setColor(Color.decode("#000000"));
		mario2.fillRect(0, 520, 1100, 20); // pisoSombra
		
		mario2.setColor(Color.decode("#078B20"));
		mario2.fillRect(0, 522, 1100, 16); // pisoVerde
		
		mario2.setColor(Color.decode("#DC7633"));
		mario2.fillRect(0, 540, 1100, 800); // piso
		
		mario2.setColor(Color.decode("#502802"));
		mario2.fillRect(0, 540, 1100, 10); // pisoSombra
		
		
		
		
		
		/*Graphics2D mario = (Graphics2D)g;
		
		mario.setColor(Color.decode("#60DCE0"));
		mario.fillRect(0, 0, 1100, 800); // cielo
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(60, 280, 80, 80); // cajita
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(840, 140, 80, 80); // cajita
		
		mario.setColor(Color.decode("#ff8f5f"));
		mario.fillRect(843, 142, 75, 75); // cajita color
		
		mario.setColor(Color.black);
		mario.drawRoundRect(850, 150,3,3,100,100); 
		mario.drawRoundRect(910, 150,3,3,100,100);
		mario.drawRoundRect(850, 210,3,3,100,100);
		mario.drawRoundRect(910, 210,3,3,100,100);
		
		mario.setColor(Color.decode("#ff8f5f"));
		mario.fillRect(63, 283, 75, 75); // cajita color 
		
		mario.setColor(Color.black);
		mario.drawRoundRect(68, 289,3,3,100,100); 
		mario.drawRoundRect(130, 289,3,3,100,100);
		mario.drawRoundRect(68, 351,3,3,100,100);
		mario.drawRoundRect(130, 351,3,3,100,100);
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(198, 150, 160, 80); // cajita
		
		mario.setColor(Color.decode("#ff8f5f"));
		mario.fillRect(200, 153, 75, 75); // cajita color 
		
		mario.setColor(Color.decode("#ff8f5f"));
		mario.fillRect(280 , 153, 75, 75); // cajita color 
		
		mario.setColor(Color.black);
		mario.drawRoundRect(205, 160,3,3,100,100);
		mario.drawRoundRect(265, 160,3,3,100,100);
		mario.drawRoundRect(205, 215,3,3,100,100);
		mario.drawRoundRect(265, 215,3,3,100,100);
		
		mario.setColor(Color.black);
		mario.drawRoundRect(285, 160,3,3,100,100); 
		mario.drawRoundRect(345, 160,3,3,100,100);
		mario.drawRoundRect(285, 215,3,3,100,100);
		mario.drawRoundRect(345, 215,3,3,100,100);
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(370, 250, 200, 500); // fondo caja azul
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(380, 300, 215, 500); // fondo caja azul
		
		mario.setColor(Color.decode("#3F95F0"));
		mario.fillRect(375, 255, 190, 290); // cielo
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(250, 350, 200, 500); //fondo caja rosa
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(250, 400, 215, 500); //fondo caja rosa
		
		mario.setColor(Color.decode("#FF9A90"));
		mario.fillRect(255, 355, 190, 190); // cielo
		
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(900, 350, 200, 500); //fondo caja verde
		
		mario.setColor(Color.decode("#72E24C"));
		mario.fillRect(905, 355, 200, 190); //fondo caja verde
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(680, 410, 120, 150); //fondo tubo
		
		mario.setColor(Color.decode("#197A10"));
		mario.fillRect(685, 415, 110, 130); //color tubo
		
		mario.setColor(Color.decode("#040404"));
		mario.fillRect(655, 350, 170, 80);
		
		mario.setColor(Color.decode("#197A10"));
		mario.fillRect(660, 355, 160, 70);
		
		mario.setColor(Color.decode("#FF9A90"));
		mario.fillRect(0, 550, 1100, 800); // cielo
		
		mario.setColor(Color.decode("#DC7633"));
		mario.fillRect(0, 576, 1100, 800); // cielo
		*/
		
	//}
	
	public void calculadoraMatriz() {
		
		this.setSize(480,650);
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.decode("#AF2655"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setFont(new Font ("Arial",Font.BOLD,40));
		text.setBackground(Color.white);
		panel.add(text,BorderLayout.BEFORE_FIRST_LINE);
		
		JPanel centro = new JPanel();
		centro.setSize(this.getWidth(),this.getHeight());
		centro.setBackground(Color.decode("#A3B763"));
		centro.setLayout(new GridLayout(4,3,10,10));
		
		panel.add(centro,BorderLayout.CENTER);
		
		String btn[]= {"7","8","9","6","5","4","3","2","1","0",".","/"};
		
		for(int i=0;i<12;i++) {
			JButton boton = new JButton(btn[i]);
			centro.add(boton);
		}
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#EC8F5E"));
		east.setLayout(new GridLayout(3,1,10,10));
		panel.add(east,BorderLayout.EAST);
		
		String btn2[] = {"+","-","="};
		
		for(int i = 0;i<3;i++){
			JButton boton = new JButton(btn2[i]);
			east.add(boton);
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.blue);
		west.setLayout(new GridLayout(3,1,10,10));
		panel.add(west,BorderLayout.WEST);
		
		String btn3[]= {"MC","M+","*"};
		
		for (int i=0;i<3;i++) {
			JButton boton = new JButton(btn3[i]);
			west.add(boton);
		}
		
		this.add(panel);
		
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
		//hace que ek boton tenga una accion 
		login_Boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String usr=ust_field.getText();
				String pwd=new String (pwd_field.getPassword());
				
				if (usr.length()<=0) {
					ust_field.setBorder(BorderFactory.createLineBorder(Color.red,4));
				}
				else {
					ust_field.setBorder(BorderFactory.createLineBorder(Color.GREEN,4));
				}
				
				if (pwd.length()<=0) {
					pwd_field.setBorder(BorderFactory.createLineBorder(Color.red,4));
				}
				else {
					pwd_field.setBorder(BorderFactory.createLineBorder(Color.GREEN,4));
				}
			
				if (usr.equals("SuperUser")) {
					
					if(pwd.equals("SuperPass")) {
						System.out.println("Bienvenido");
					}
					
				}else {
					System.out.println("Usuario no valido");
				}
				
				
			}});
		
		
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
		registro.setBackground(Color.decode("#33FF7D"));
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
		
		registro_Boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String usr= usr_field.getText();
				String bio= bio_tex.getText();
			
				
				//accept_radio
				
				if(usr.length()<=0) {
					usr_field.setBorder(BorderFactory.createLineBorder(Color.red,4));
				}
				else {
					usr_field.setBorder(BorderFactory.createLineBorder(Color.green,4));
				}
				if(bio.length()<=0) {
					bio_tex.setBorder(BorderFactory.createLineBorder(Color.red,4));
				}
				else {
					bio_tex.setBorder(BorderFactory.createLineBorder(Color.green,4));
				}
				
				if(!accept_radio.isSelected()){
					accept_radio.setBorderPainted(true);
					accept_radio.setBorder(BorderFactory.createLineBorder(Color.red,4));
					
					den_radio.setBorderPainted(true);
					den_radio.setBorder(BorderFactory.createLineBorder(Color.red,4));
				}
				else {
					accept_radio.setBorderPainted(true);
					accept_radio.setBorder(BorderFactory.createLineBorder(Color.green,4));
					
				}
			}
		});
		
		
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

	public void calcular_Interez() {
		
		this.setSize(800,720);
		
		//panel principal dividido en un borderLayout
		JPanel panel_principal = new JPanel();
		panel_principal.setSize(this.getWidth(),this.getHeight());
		panel_principal.setBackground(Color.white);
		panel_principal.setLayout(new BorderLayout());
		
		//text en la pantel 
		JLabel text = new JLabel(" Interés",2);
		text.setOpaque(true);
		text.setFont(new Font ("Arial",Font.BOLD,40));
		text.setForeground(Color.red);
		text.setBackground(Color.white);
		panel_principal.add(text,BorderLayout.NORTH);
		
		
		//panel central con un GridLayout
		JPanel panel_central = new JPanel();
		panel_central.setOpaque(true);
		panel_central.setBackground(Color.white);
		panel_central.setLayout(new GridLayout(2,1,10,20));
		panel_principal.add(panel_central,BorderLayout.CENTER);
		
		JLabel text_west = new JLabel("   ");
		text_west.setOpaque(true);
		text_west.setFont(new Font ("Arial",Font.BOLD,20));
		text_west.setBackground(Color.white);
		panel_principal.add(text_west,BorderLayout.WEST);
		
		
		JLabel text_EAST = new JLabel("    ");
		text_EAST.setOpaque(true);
		text_EAST.setFont(new Font ("Arial",Font.BOLD,30));
		text_EAST.setBackground(Color.white);
		panel_principal.add(text_EAST,BorderLayout.EAST);
		
		
		JLabel text_SOUTH = new JLabel("    ");
		text_SOUTH.setOpaque(true);
		text_SOUTH.setFont(new Font ("Arial",Font.BOLD,80));
		text_SOUTH.setBackground(Color.white);
		panel_principal.add(text_SOUTH,BorderLayout.SOUTH);
		
		
		//panel dentro del central que consta de dos paneles 
		
		  
		JPanel panel_central_1 = new JPanel();
		panel_central_1.setOpaque(true);
		panel_central_1.setBackground(Color.decode("#99ff99"));
		panel_central_1.setLayout(null);
		panel_central.add(panel_central_1);
		
		//texto de central uno en lugar norte
		
		JLabel text_central_1 = new JLabel("Calcular interés",2);
		text_central_1.setOpaque(true);
		text_central_1.setFont(new Font ("Arial",Font.BOLD,25));   
		text_central_1.setBounds(0,0, 200, 40);
		text_central_1.setForeground(Color.black);
		text_central_1.setBackground(Color.decode("#99ff99"));
		panel_central_1.add(text_central_1);
		
		JLabel text_capital = new JLabel("1500");
		text_capital.setOpaque(true);
		text_capital.setFont(new Font ("Arial",Font.BOLD,25));   
		text_capital.setBounds(350,110, 200, 40);
		text_capital.setForeground(Color.black);
		text_capital.setBackground(Color.white);
		panel_central_1.add(text_capital);
		

		JLabel capial = new JLabel("Capital :");
		capial.setOpaque(true);
		capial.setFont(new Font ("Arial",Font.BOLD,25));   
		capial.setBounds(200,60, 100, 40);
		capial.setForeground(Color.black);
		capial.setBackground(Color.decode("#99ff99"));
		panel_central_1.add(capial);
		
	
		
		JLabel text_tiempo = new JLabel("2");
		text_tiempo.setOpaque(true);
		text_tiempo.setFont(new Font ("Arial",Font.BOLD,25));   
		text_tiempo.setBounds(350,60, 200, 40);
		text_tiempo.setForeground(Color.black);
		text_tiempo.setBackground(Color.white);
		panel_central_1.add(text_tiempo);
		
		JLabel tiempo = new JLabel("tiempo :");
		tiempo.setOpaque(true);
		tiempo.setFont(new Font ("Arial",Font.BOLD,25));   
		tiempo.setBounds(200,110, 100, 40);
		tiempo.setForeground(Color.black);
		tiempo.setBackground(Color.decode("#99ff99"));
		panel_central_1.add(tiempo);
		
		JLabel text_Tasa = new JLabel("0.1");
		text_Tasa.setOpaque(true);
		text_Tasa.setFont(new Font ("Arial",Font.BOLD,25));   
		text_Tasa.setBounds(350,160, 200, 40);
		text_Tasa.setForeground(Color.black);
		text_Tasa.setBackground(Color.white);
		panel_central_1.add(text_Tasa);
		
		JLabel tasa_interes = new JLabel("Taza interés :");
		tasa_interes.setOpaque(true);
		tasa_interes.setFont(new Font ("Arial",Font.BOLD,25));   
		tasa_interes.setBounds(135,160, 200, 40);
		tasa_interes.setForeground(Color.black);
		tasa_interes.setBackground(Color.decode("#99ff99"));
		panel_central_1.add(tasa_interes);
		
		JButton calcular = new JButton("Calcular");
		calcular.setOpaque(true);
		calcular.setFont(new Font ("Arial",Font.BOLD,15));   
		calcular.setBounds(230,220, 100, 40);
		calcular.setForeground(Color.WHITE);
		calcular.setBackground(Color.BLACK);
		panel_central_1.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setOpaque(true);
		cancelar.setFont(new Font ("Arial",Font.BOLD,15));   
		cancelar.setBounds(360,220, 100, 40);
		cancelar.setForeground(Color.WHITE);
		cancelar.setBackground(Color.BLACK);
		panel_central_1.add(cancelar);
		
		JLabel marco = new JLabel("");
		marco.setOpaque(true);  
		marco.setBounds(40,40, 670, 230);
		marco.setBackground(Color.decode("#99ff99"));
		marco.setBorder(BorderFactory.createLineBorder(Color.gray,3));//pintar bordes
		panel_central_1.add(marco);
		
		JPanel panel_central_2 = new JPanel();
		panel_central_2.setSize(50, 50);
		panel_central_2.setOpaque(true);
		panel_central_2.setBackground(Color.decode("#ff9999"));
		panel_central_2.setLayout(null);
		panel_central.add(panel_central_2);
		
		JLabel interez = new JLabel("Interes :");
		interez.setOpaque(true);
		interez.setFont(new Font ("Arial",Font.BOLD,25));   
		interez.setBounds(150,80, 100, 40);
		interez.setForeground(Color.black);
		interez.setBackground(Color.decode("#ff9999"));
		panel_central_2.add(interez);
		
		JLabel text_interez = new JLabel("315.0000000000002");
		text_interez.setOpaque(true);
		text_interez.setFont(new Font ("Arial",Font.BOLD,25));   
		text_interez.setBounds(280,80, 300, 40);
		text_interez.setForeground(Color.black);
		text_interez.setBackground(Color.white);
		panel_central_2.add(text_interez);
		
		JLabel monto = new JLabel("Monto :");
		monto.setOpaque(true);
		monto.setFont(new Font ("Arial",Font.BOLD,25));   
		monto.setBounds(150,130, 100, 40);
		monto.setForeground(Color.black);
		monto.setBackground(Color.decode("#ff9999"));
		panel_central_2.add(monto);
		
		JLabel text_monto = new JLabel("1815.00000000000002");
		text_monto.setOpaque(true);
		text_monto.setFont(new Font ("Arial",Font.BOLD,25));   
		text_monto.setBounds(280,130, 300, 40);
		text_monto.setForeground(Color.black);
		text_monto.setBackground(Color.white);
		panel_central_2.add(text_monto);
		
		
		this.add(panel_principal);
		
	}

}
	
