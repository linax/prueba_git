/**Clase que maneja el ingreso de una entrada, en este caso corresponde a una lìnea ingresada por el usuario
*En versiones posteriores se podrìan leer archivos, y guardar cada línea del archivo.
**/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ManejadorGalactico{

		
	BufferedReader br;

	Nota notas;
	ConversorNota conversor;

	public ManejadorGalactico(){


		this.br = new BufferedReader(new InputStreamReader(System.in)); //se indica el tipo de entrada que se está realizando
		this.notas = new Nota();

	}

	/*
	* Método que lee las líneas ingresadas por el usuario y que conforman la nota a ser convertida.
	*/
	public void leer() throws IOException{

		//Falta manejar excepciones


		String str = this.br.readLine();

		//Linea
		while(!str.equals("end")){
			 
			
			String msg = notas.addLinea(str); //Agrega una nueva lìnea, si esta es correcta se agrega efectivamente a las notas
			if ( msg != null) { //Si hay un error imprime la lìnea
				System.out.println(msg);
			}
			
			str = this.br.readLine();
		}


		this.br.close();
	}

	/*
	* Método que entrega la salida del programa, considerando las notas de entrada
	*/
	public void salida(){


		this.conversor = new ConversorNota(notas);
		String salida = conversor.resultado();
		System.out.println("");
		System.out.println("******************************");
		System.out.println(salida);

		System.out.println(notas.getNota());
	}
}