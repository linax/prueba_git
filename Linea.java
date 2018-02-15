/* Clase que corresponde a una lìnea ingresada por el usuario, en la nota de entrada
* 
*/

public class Linea{
	
	String linea;

	String tipo; //indica el tipo de lìnea que se està leyendo

	public Linea(String s){

		linea = s;

		UtilTipoLinea uTL = new UtilTipoLinea();

		tipo = uTL.getTipoLinea(s);


	}

	public String getLinea(){
		return linea;
	}

	public void setLinea(String lineaNueva){

		linea = lineaNueva;
	}


	public String getTipo(){
		return tipo;
	}
}