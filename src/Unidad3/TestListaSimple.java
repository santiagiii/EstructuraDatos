package Unidad3;

import java.util.Scanner;

public class TestListaSimple {//inicio de la clase teste de la lista
	private ListaSimple lista=new ListaSimple();//mandando llamar a la clase 

	public static void main(String[] args) {//inicio de la clase principal (main)
		TestListaSimple tls=new TestListaSimple();//creando un obj para poderlo llamar
		int opcion=0; //inicializacion de variablea
		Scanner leer=new Scanner(System.in);//scanner para poder leer datos engrsados
		do {//do while para porder repetir el menu de opciones asta que se elija la opocion 9 (salir)
			System.out.println("*****Menu de opciones*****");//menu de inicio de opciones
			System.out.println("1.-Vacio");
			System.out.println("2.- Insertar Principio");
			System.out.println("3.- Insertar Final");
			System.out.println("4.- Insertar Posición");
			System.out.println("5.- Localizar");
			System.out.println("6.- Buscar");
			System.out.println("7.- Eliminar");
			System.out.println("8.- Imprimir");
			System.out.println("9.- Salir");
			System.out.print("Seleccione opción:");
			opcion=leer.nextInt();//dando valor a la  opcion de elejir 
			
			switch(opcion) {//evaluacion de casos (case) segun la opcion de el menu principal se elijira el case1234
			case 1://caso #1vacio
				if(tls.lista.isVacio()) {//aciendo referencia ala clase lista simple en el metodo (isVacio)
					System.out.println("lista vacia");
				}else {
					System.out.println("lista no vacia");
				}
				break;
			case 2:
				System.out.print("Ingresa valor a insertar:");
				tls.lista.insertarPrincipio(leer.nextInt());
				System.out.println("valor insertado");
				break;
			case 3:
				System.out.print("Ingresa valor a insertar:");
				tls.lista.insertarFinal(leer.nextInt());
				System.out.println("valor insertado");
				break;
			case 4:
				System.out.print("Ingresa valor a insertar:");
				int valor=leer.nextInt();
				System.out.print("Ingresa la posición:");
				int posicion=leer.nextInt();				
				tls.lista.insertarPosicion(valor, posicion);
				System.out.println("valor insertado");
				break;
			case 5:
				System.out.print("Ingresa valor a localizar:");
				if(tls.lista.localizar(leer.nextInt())) {
					System.out.println("nodo localizado");
				}else {
					System.out.println("nodo no localizado");
				}				
				break;
			case 6:
				System.out.print("Ingresa valor a buscar:");
				tls.lista.buscar(leer.nextInt());				
				break;
			case 7:
				System.out.print("Ingresa la posición a eliminar:");
				tls.lista.eliminar(leer.nextInt());				
				break;
			case 8:
				System.out.println(tls.lista.imprimir());
			}
		}while(opcion!=9);
		

	}

}
