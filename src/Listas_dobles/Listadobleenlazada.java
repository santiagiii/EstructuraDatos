package Listas_dobles;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Listadobleenlazada extends JFrame {
	
	ListaDoble listita=new ListaDoble();
	int opcion=0;
	String elemento;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listadobleenlazada frame = new Listadobleenlazada();
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
	public Listadobleenlazada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertarNodoAdelante = new JLabel("Insertar genero");
		lblInsertarNodoAdelante.setForeground(Color.GREEN);
		lblInsertarNodoAdelante.setBounds(21, 44, 126, 14);
		contentPane.add(lblInsertarNodoAdelante);
		
		JLabel lblNewLabel = new JLabel("Insertar nombre");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(21, 69, 126, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{///evento accion por aser insertar 
				elemento=JOptionPane.showInputDialog("Ingresa el Genero");
				
				listita.agragaralInicio(elemento);		
			}
		});
		btnAplicar.setBounds(157, 40, 89, 23);
		contentPane.add(btnAplicar);
		
		JButton button = new JButton("Aplicar");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{//fnc para insertar
				elemento=JOptionPane.showInputDialog("ingresa el Autor de la cancion");
				
				listita.agragarFinal(elemento);
				
				
				//listita.agragarFinal(elemento);
			}
		});
		button.setBounds(157, 65, 89, 23);
		contentPane.add(button);
		
		JLabel lblEliminarPrimerNodo = new JLabel("mostrar lista de inicio a Fin");
		lblEliminarPrimerNodo.setForeground(Color.GREEN);
		lblEliminarPrimerNodo.setBounds(0, 94, 155, 14);
		contentPane.add(lblEliminarPrimerNodo);
		
		JButton button_1 = new JButton("Aplicar");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(!listita.estVacia()) 
				{
					listita.mostrarListaInicioFin();
				}else {
					JOptionPane.showInputDialog(
							null,"NO HAY NODOS AUN","LISTA VACIA!",
						JOptionPane.INFORMATION_MESSAGE);
			}
			}
		});
		button_1.setBounds(157, 90, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Mostrar de fin a inicio");
		lblNewJgoodiesLabel.setForeground(Color.GREEN);
		lblNewJgoodiesLabel.setBounds(0, 119, 113, 14);
		contentPane.add(lblNewJgoodiesLabel);
		
		JButton btnAplicar_1 = new JButton("Aplicar");
		btnAplicar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{////FUNC de click para mostrar
				if(!listita.estVacia()) 
				{
					listita.mostrarListaFinInicio();
				}else {
					JOptionPane.showInputDialog(
							null,"NO HAY NODOS AUN","LISTA VACIA!",
						JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			}
		});
		btnAplicar_1.setBounds(157, 115, 89, 23);
		contentPane.add(btnAplicar_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {//iinicio de la caccion
				JOptionPane.showMessageDialog(null,"Aplicacion Finalizada :v GRACIAS!"
						,null, JOptionPane.INFORMATION_MESSAGE);

				System.exit(0);
			
			}
		});
		btnSalir.setBounds(295, 190, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblEliminarNodoIni = new JLabel("Eliminar Genero");
		lblEliminarNodoIni.setForeground(Color.GREEN);
		lblEliminarNodoIni.setBounds(16, 144, 117, 14);
		contentPane.add(lblEliminarNodoIni);
		
		JButton button_2 = new JButton("Aplicar");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) //fnc de click para eliminar
			{
				if(!listita.estVacia()) 
				{
					elemento=listita.eliminarDelinicio();
					JOptionPane.showInputDialog(
							null,"El elemento eliminado es del ini:"+elemento,
						JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showInputDialog(
							null,"NO HAY NODOS AUN","LISTA VACIA!",
						JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		button_2.setBounds(157, 140, 89, 23);
		contentPane.add(button_2);
		
		JLabel lblEliminarNodoDel = new JLabel("Eliminar nombre");
		lblEliminarNodoDel.setForeground(Color.GREEN);
		lblEliminarNodoDel.setBounds(16, 169, 117, 14);
		contentPane.add(lblEliminarNodoDel);
		
		JButton button_3 = new JButton("Aplicar");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{///fnc para eliminar fnl
				if(!listita.estVacia()) 
				{
					elemento=listita.eliminarDelfinal();
					JOptionPane.showInputDialog(
							null,"El elemento eliminado es del fin :"+elemento,
						JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showInputDialog(
							null,"NO HAY NODOS AUN","LISTA VACIA!",
						JOptionPane.INFORMATION_MESSAGE);
				}
			
			}
		});
		button_3.setBounds(157, 165, 89, 23);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\silerio\\Desktop\\MEGA PACK DE 420 WALLPAPER 1080P FULL HD\\MEGA PACK DE 420 WALLPAPER 1080P FULL HD\\754643.jpg"));
		label.setBounds(0, -11, 434, 283);
		contentPane.add(label);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
