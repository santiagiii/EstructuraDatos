package Listas_dobles;

import javax.swing.JOptionPane;

public class ListaDoble {

	private NodoDoble inicio,fin;
	public ListaDoble() 
	{
		inicio=fin=null;
	}
//metodo para saber si la lista esta vacia
	public boolean estVacia() 
	{
		return inicio==null;
	}
	//metodo para agregar nodos al final
	public void agragarFinal(String el) 
	{
		if(!estVacia())
		{
			fin=new NodoDoble(el,null,fin);
			fin.anterior.siguiente=fin;
		}else {
			inicio=fin=new NodoDoble(el);
		}
		
	}
	///mtodo para agregar al inicio
	public void agragaralInicio(String el) 
	{
		if(!estVacia())
		{
			inicio=new NodoDoble(el,inicio,null);
			inicio.siguiente.anterior=fin;
		}else {
			inicio=fin=new NodoDoble(el);
		}
		
	}
	//metodo para mostrar toda la lista de inicio
	public void mostrarListaInicioFin() 
	{
		if(!estVacia()) 
		{
			String datos="<=>";
			NodoDoble auxiliar=inicio;
			while(auxiliar!=null) 
			{
				datos = datos + "["+auxiliar.dato+"]<=>";
				auxiliar = auxiliar.siguiente;
			}
				//imprecion de datos
				JOptionPane.showMessageDialog(null,datos,
						"Mostrando Lista de     incio a fin",
						JOptionPane.INFORMATION_MESSAGE);
				}
	}
			
		
		//METODO  PATRA MOSTRTA LA LISTA DE INICIO Y FIN
		public void mostrarListaFinInicio() 
		{
			if(!estVacia()) 
			{
				String datos="<=>";
				NodoDoble auxiliar=fin;
				while(auxiliar!=null) 
			 	{
					datos = datos + "["+auxiliar.dato+"]<=>";
					auxiliar = auxiliar.anterior;
					
					//imprecion de datos
					JOptionPane.showMessageDialog(null,datos,
							"Mostrando Lista de incio a fin",JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			}
			
			
	}
		//metodo para eliminar
		public String eliminarDelinicio() 
		{
			String elemento=inicio.dato;
			if(inicio==fin) 
			{
				inicio=fin=null;
			}else {
				inicio=inicio.siguiente;
				inicio.anterior=null;
			}
			return elemento;
		}
	//metodo eliminar fnl
		public String eliminarDelfinal()
		{
			String elemento=inicio.dato;
			if(inicio==fin) 
			{
				inicio=fin=null;
			}else { 
				fin=fin.anterior;
				fin.siguiente=null;
			}
			return elemento;
		}
}

