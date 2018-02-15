/* Clase que almacena la entrada ingresada por el usuario, en una lista de lìneas.
*/

import java.util.ArrayList;
public class Nota{

	ArrayList<Linea> lineas;

	public Nota(){
		this.lineas = new ArrayList<Linea>();
	}

	
	/*Agrega una lìnea a las notas y devuelve un mensaje de error si ésta no fue ingresada*/
	public String addLinea(String str){

		Linea linea = new Linea(str);

		String errorMsg = "Error, the line isn't correct.";

		if (!linea.getTipo().equals("error")) {
			this.lineas.add(linea);	
			errorMsg=null;
		}
		return errorMsg;

		
	}
	public String getNota(){

		String salida = "";
		 for(Linea l : this.lineas){

            salida += l.getLinea() +"\n";
   		 }

   		 return salida;
	}


}