package Listas_dobles;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Listas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listas frame = new Listas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Listas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU DE OPCIONES");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblMenu.setForeground(Color.CYAN);
		lblMenu.setBounds(63, 28, 262, 14);
		contentPane.add(lblMenu);
		
		JButton btnEntrar = new JButton("Entrar");//boton con instancia 
		btnEntrar.addMouseListener(new MouseAdapter() {
			//llamando a clase
			Listadobleenlazada en=new Listadobleenlazada();
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Principal9 p=new  Principal9();
				
				
			}
		});
		
		btnEntrar.addActionListener(new ActionListener() {
			Principal9 p=new  Principal9();
			public void actionPerformed(ActionEvent arg0) {
				Listadobleenlazada en=new Listadobleenlazada();
				en.main(null);
				
			}
		});
		btnEntrar.setBounds(236, 51, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblNodoSimple = new JLabel("LISTA DOBLE ENLAZADA");
		lblNodoSimple.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNodoSimple.setForeground(Color.CYAN);
		lblNodoSimple.setBounds(10, 53, 187, 14);
		contentPane.add(lblNodoSimple);
		
		JLabel lblListaDoblementeEnlazadas = new JLabel("LISTA DOBLEMENTE ENLAZADAS");
		lblListaDoblementeEnlazadas.setBounds(40, 11, 209, 14);
		contentPane.add(lblListaDoblementeEnlazadas);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\silerio\\Pictures\\Razer.jpg"));
		label.setBounds(-13, 0, 502, 469);
		contentPane.add(label);
	}
}
