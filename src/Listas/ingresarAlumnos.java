package Listas;

import java.util.Scanner;

public class ingresarAlumnos {
	
	public boolean ingresar(int n, Alumno[] a) {
		
		Scanner leer=new Scanner(System.in);
		
		for(int i=0;i<n;i++) {
			a[i]=new Alumno();
			System.out.print("Ingrese número de control del alumno "+(i+1));
			a[i].setNumeroControl(leer.nextLine());
			System.out.print("Ingrese Nombre del alumno "+(i+1));
			a[i].setNombre(leer.nextLine());
			System.out.print("Ingrese la dirección del alumno "+(i+1));
			a[i].setDireccion(leer.nextLine());			
		}
		
		return false;
		
	}

}
