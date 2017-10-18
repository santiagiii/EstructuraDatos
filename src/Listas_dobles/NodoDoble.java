package Listas_dobles;

public class NodoDoble {

	
//inicializacion de varibles
	//constructor para cuando no hay  nodos
	
	public NodoDoble(int el) 
	{
		this(el,null,null);
	}
		public int dato;
		NodoDoble siguiente,anterior;
		//constructoe para cuando hay nodos
		public NodoDoble(int el,NodoDoble s,NodoDoble a) 
		{
			dato=el;
			siguiente=s;
			anterior=a;
		}
		
	}

