/*
Aplicación principal que inicia el programa de conversiòn de líneas de números "galácticos" a normales
*/

import java.io.IOException;

public class AppMercaderGalactico{

	public static void main(String[] args) {
		System.out.println("Hi, please introduce your lines to converse it. When you finish, enter 'end'");

		
		try{
	        ManejadorGalactico manejador = new ManejadorGalactico();  //Lee las líneas de entrada

			manejador.leer(); //Lee la entrada ingresada por el usuario

			
			manejador.salida(); //Devuelve la salida al usuario

        }catch(IOException ex){ //Indica si hay o no error en la entrada
            System.err.println("Invalid Format, try again!");
        }

        //Entrega la salida


	}

}