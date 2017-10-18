package Listas_dobles;

import javax.swing.JOptionPane;

public class Principal9 {

	public Principal9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//inico d e variables
		ListaDoble listita=new ListaDoble();
		int opcion=0,elemento;
		do {
			try {//exxepcion
				
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Agregar un Nodo al inicio \n"
					   +"2. Agregar un Nodo al Final \n"
					   +"3. Mostrar la lista de  inicio a Fin \n"
					   +"4. Mostrar la lista de Fin a Inicio\n "
					   +"5. Salir\n "
					   +"Que deseas Hacer?","Menu de Opciones",JOptionPane.INFORMATION_MESSAGE));
				switch(opcion) 
				{
				case 1:
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el valor de el nodo"
					,"Agregar nodos al inicio",JOptionPane.INFORMATION_MESSAGE));
					listita.agragaralInicio(elemento);			
					break;
				case 2:
					elemento=Integer.parseInt(JOptionPane.showInputDialog(
							null,"ingresa el elemento  del nodo","agregando nodo al final",
						JOptionPane.INFORMATION_MESSAGE));	
					listita.agragarFinal(elemento);
					
					break;
				case 3:
					if(!listita.estVacia()) 
					{
						listita.mostrarListaInicioFin();
					}else {
						JOptionPane.showInputDialog(
								null,"NO HAY NODOS AUN","LISTA VACIA!",
							JOptionPane.INFORMATION_MESSAGE);
						
					}
					
					break;
				case 4:
					if(!listita.estVacia()) 
					{
						listita.mostrarListaFinInicio();
					}else {
						JOptionPane.showInputDialog(
								null,"NO HAY NODOS AUN","LISTA VACIA!",
							JOptionPane.INFORMATION_MESSAGE);
						
					}
					break;  
				case 5:
					JOptionPane.showMessageDialog(null,"Aplicacion Finalizada :v GRACIAS!"
					,null, JOptionPane.INFORMATION_MESSAGE);
					break;
				
					default:
						JOptionPane.showMessageDialog(null,"La opcion no esta en el menu berifica tu valor :C");
						

				}//fin de llave de el switch
				       
			}catch(NumberFormatException n) 
			{
				JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
			}
			
			
			
		}while(opcion!=5);
		
		

	}

}
