package Listas;

public class busquedaSecuencial {
	
	public boolean buscar(String nc, Alumno[] a) {
		boolean respuesta=false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i].getNumeroControl().equals(nc)) {
				respuesta=true;
			}
		}
		
		return respuesta;
	}
 
}
