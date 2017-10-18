package Unidad3;

public class ListaSimple {//clase de inicio  de mtds
	private NodoSimple cabeza;
	
public ListaSimple() {//metodo con valor cabeza para poderlo llamar
	this.cabeza=null;//esta inicializando variable en null
}

public NodoSimple getCabeza() {//metodo de retorno de  varible
	return cabeza;
}

public void setCabeza(NodoSimple cabeza) {//metodo referenciado a la clase nodosimple
	this.cabeza = cabeza;// dando como valor cabeza
}

public boolean isVacio() {//metodo #1de el menu de las opciones boleano 
	boolean respuesta=true;//iniciando varibles 
	if(this.cabeza!=null) {//si la cabeza es falsa entonces la respuesta es falsa
		respuesta=false;
	}
	return respuesta;//retornando valor en el metodo
}

public void insertar(int valor) {//metodo de insetara datos 
	NodoSimple nuevo=new NodoSimple();//mandando a llamar la clase nudosimple
	nuevo.setDato(valor);//aciendo referencia al metodo set dato de la clase  nodosimple para tomar el valor de el metodo insertar
	nuevo.setSiguiente(null);//referenciando a la clase sigiente esto implica que cuando se inserrte un valor el sigiente sea nulo (null)
	this.cabeza=nuevo;//y que la cabeza tome el valor de nuevo
}

public void insertarPrincipio(int valor) {//metodo del menu #2
	if(this.isVacio()) {//condicion para insertar datos
		this.insertar(valor);//tomando valor de inicio  del metodo
	}else {//si no es vacio 
		NodoSimple nuevo=new NodoSimple();;//mandando a llamar la clase nudosimple
		nuevo.setDato(valor);//aciendo referencia al metodo set dato de la clase  nodosimple para tomar el valor de el metodo insertar
		nuevo.setSiguiente(this.cabeza);;//referenciando a la clase sigiente esto implica que cuando se inserrte un valor el sigiente sea nulo (null)
		this.cabeza=nuevo;//la cabeza tomara un valor nuevo
	}//fin de la llave del else
}//fin de la llave del metos

public void insertarFinal(int valor) {//inicio del metodo #3insertar final 
	if(this.isVacio()) {//si esta  vacio 
		this.insertar(valor);//este insertara un valor 
	}else {//si no
		NodoSimple nuevo=new NodoSimple();//mando a llamar a el metodo nodo simple con un obj nuevo
		nuevo.setDato(valor);//se estara tomando el valor a insertar o insertado
		nuevo.setSiguiente(null);//y el sigiente dato despues sera null
		
		NodoSimple temporal=this.cabeza;//teporal es igual que cabeza
		while(temporal.getSiguiente()!=null) {//ciclo para temporal tome el siguiente valor como nulo
			temporal=temporal.getSiguiente();//temporal va  tomar el siguiente valor 
		}//din de la llave del while
		temporal.setSiguiente(nuevo);//el valor de el temporal sera el de el suiguiente como nuevo para que uno lo pueda insertar 
	}
}//fin de la llave de el metood
public int contar() {
	int respuesta=0;//variable para el ciclo
	NodoSimple temporal=this.cabeza;//dandoel valor a nudosimple
	while(temporal!=null) {//ciclo para autoincrementar respuesta
		respuesta++;//autoicrementar la respuesta 
		temporal=temporal.getSiguiente();
	}
	return respuesta;
}//fin de  el metodo
public NodoSimple encontrar(int posicion) {//metodo #4 de el menu de testesimple
	NodoSimple temporal=this.cabeza;//dando valor que nudosimple es referenciado a temproral esta cabeza
	NodoSimple anterior=null;//para laposicion anterior sera nulo
	int i=0;//variable del  ciclo
	while(i<posicion) {//ciclo para poder dar valor a la cabeza 
		i++;//incrementado el valr de i 
		anterior=temporal;//dando el valor a anterior 
		temporal=temporal.getSiguiente();//referenciando el valor de temporal para tomar como siguiente 
	}//fin de la llave del ciclo
	return anterior;// retornando el valor de el anterior varible
}//fin de la llave de metodo 
public void insertarPosicion(int valor, int posicion) {//incio de el metodo #4 de test de lista simple
	if(posicion>0 && this.contar()>1 && posicion<=this.contar()) {//condicion para poder entrar a la inseratacion de posicion 
		if(posicion==1) {//si la posicion es igual a 0
			this.insertarPrincipio(valor);//se insertara el valor en el principio 
		}else if(posicion==this.contar()) {//si no se  estara insertando el valor ala final 
			this.insertarFinal(valor);//dando el valor como final
		}else {// o
			NodoSimple anterior=this.encontrar(posicion-1);//nodo simple  de eanterior sera igual a encontrar
			NodoSimple nuevo=new NodoSimple();//llamando a la clase nodo simple
			nuevo.setDato(valor);//dando valor a nuevo como valor
			nuevo.setSiguiente(anterior.getSiguiente());//
			anterior.setSiguiente(nuevo);
		}
		
	}
}
public boolean localizar(int valor) {
	boolean respuesta=false;
	
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		if(temporal.getDato()==valor) {
			respuesta=true;
		}
		temporal=temporal.getSiguiente();
	}
	
	return respuesta;
}

public void buscar(int valor) {
	boolean respuesta=false;
	
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		if(temporal.getDato()==valor) {
			respuesta=true;
			System.out.println("El valor encontrado es:"+temporal.getDato());
		}
		temporal=temporal.getSiguiente();
	}
	if(respuesta==false) {
		System.out.println("El valor no fue encontrado");
	}
	
}

public boolean eliminar(int posicion) {
	boolean respuesta=false;
	if(posicion==1) {
		this.setCabeza(this.cabeza.getSiguiente());
		respuesta=true;
	}else {
		NodoSimple temporal=this.encontrar(posicion-1);
		temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
		respuesta=true;
	}
	return respuesta;
}

public StringBuilder imprimir() {
	StringBuilder cadena=new StringBuilder();
	cadena.append("Cabeza-->");
	NodoSimple temporal=this.cabeza;
	while(temporal!=null) {
		cadena.append(temporal.getDato());
		cadena.append("-->");
		temporal=temporal.getSiguiente();
	}
	cadena.append("NULL");
	return cadena;
}


}
