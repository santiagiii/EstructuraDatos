package Listas_dobles;

public class NodoDoble {

	public NodoDoble(String el) 
	{
		this(el,null,null);
	}
	
	public  String dato;
	
	
		NodoDoble siguiente,anterior;
		//constructoe para cuando hay nodos
		public NodoDoble(String el,NodoDoble s,NodoDoble a) 
		{
			dato=el;
			siguiente=s;
			anterior=a;
		}
		
	}

