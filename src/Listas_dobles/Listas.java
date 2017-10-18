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
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAplicar.setBounds(160, 83, 89, 23);
		contentPane.add(btnAplicar);
		
		JLabel lblMenu = new JLabel("MENU DE OPCIONES");
		lblMenu.setForeground(Color.BLACK);
		lblMenu.setBounds(63, 28, 149, 14);
		contentPane.add(lblMenu);
		
		JButton btnEntrar = new JButton("Entrar");//boton con instancia 
		btnEntrar.addMouseListener(new MouseAdapter() {
			Principal9 p=new  Principal9();
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Principal9 p=new  Principal9();
			}
		});
		
		btnEntrar.addActionListener(new ActionListener() {
			Principal9 p=new  Principal9();
			public void actionPerformed(ActionEvent arg0) {
				Principal9 p=new  Principal9();
			}
		});
		btnEntrar.setBounds(160, 49, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblNodoSimple = new JLabel("Insertar Nodo Simple");
		lblNodoSimple.setBounds(10, 53, 121, 14);
		contentPane.add(lblNodoSimple);
		
		JLabel lblListaDoblementeEnlazadas = new JLabel("LISTA DOBLEMENTE ENLAZADAS");
		lblListaDoblementeEnlazadas.setBounds(40, 11, 209, 14);
		contentPane.add(lblListaDoblementeEnlazadas);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(20, 86, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(160, 117, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(160, 162, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(160, 203, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(160, 249, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
