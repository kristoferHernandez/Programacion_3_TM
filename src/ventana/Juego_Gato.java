package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import java.awt.Font;

public class Juego_Gato<JButtom> {

	private JFrame frame;
	public static boolean turno;
	
	public static JButton btnNewButton;
	public static JButton btnNewButton_1;
	public static JButton btnNewButton_2;
	public static JButton btnNewButton_3;
	public static JButton btnNewButton_4;
	public static JButton btnNewButton_5;
	public static JButton btnNewButton_6;
	public static JButton btnNewButton_7;
	public static JButton btnNewButton_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		turno=false;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Juego_Gato window = new Juego_Gato();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Juego_Gato() {
		initialize();
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "wenas");
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton= new JButton("");
		btnNewButton_1 = new JButton("");
		btnNewButton_2 = new JButton("");
		btnNewButton_3 = new JButton("");
		btnNewButton_4 = new JButton("");
		btnNewButton_5 = new JButton("");
		btnNewButton_6 = new JButton("");
		btnNewButton_7 = new JButton("");
		btnNewButton_8 = new JButton("");
		
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
		
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn = ((JButton) e.getSource());
				click(btn);
				
				
			}
		});
	
		
		panel.add(btnNewButton);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_3);
		panel.add(btnNewButton_4);
		panel.add(btnNewButton_5);
		panel.add(btnNewButton_6);
		panel.add(btnNewButton_7);
		panel.add(btnNewButton_8);
	}
	
	public void click(JButton btn) {
		
		if(btn.getText().equals("")) {
			
			//2.- el turno
			if(turno) {
				btn.setText("O");
				btn.setBackground(Color.decode("#3CF99A"));
				turno=false;
			}else {
				btn.setText("X");
				btn.setBackground(Color.decode("#8EDEF0"));
				turno=true;
			}
			
		}
		
		btn.setEnabled(false);
		
		//3.- si alguien gano
		
		//primera fila
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_2.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
			
				
		}
		
		//segunda fila
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_3.getText().equals(btnNewButton_5.getText()) 
				&& !btnNewButton_3.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) 
				&& btnNewButton_6.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton_6.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton.getText().equals(btnNewButton_3.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_6.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_1.getText().equals(btnNewButton_7.getText()) 
				&& !btnNewButton_1.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) 
				&& btnNewButton_2.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton_2.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		
		}
		
		if(btnNewButton.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_6.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_6.getText().equals(btnNewButton_2.getText()) 
				&& !btnNewButton_6.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganador", "Color", JOptionPane.WARNING_MESSAGE);
				
		}	
	}
}
