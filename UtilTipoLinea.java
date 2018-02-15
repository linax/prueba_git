/*
* Clase que ayuda a definir los tipos de lìneas y a validarlos
*/

public class UtilTipoLinea{

	
	public static String expNums = "^([A-Za-z]+) is ([I|V|X|L|C|D|M])$";
	public static String expCredits = "^([A-Za-z]+)([A-Za-z\\s]*) is ([0-9]+) ([c|C]redits)$";
	public static String expHowMuch = "^how much is (([A-Za-z\\s])+)\\?$";
	public static String expHowMany= "^how many [c|C]redits is (([A-Za-z\\s])+)\\?$";
	

	public static String tiposLinea[] = {"expNums", "expCredits", "expHowMuch", "expHowMany"};



	public static String matrizTipos[][] = {{expNums, tiposLinea[0]},
						 {expCredits, tiposLinea[1]},
						 {expHowMuch, tiposLinea[2]},
						{expHowMany, tiposLinea[3]}};
	

/*	public UtilTipoLinea(){
		
	}
*/
	public String getTipoLinea(String linea)
	{
		String auxLinea = linea.trim();

		boolean verifica = false;
		String result = "error";
		
			
		for(int i =0; (i<matrizTipos.length && !verifica) ;i++)
		{


			if( auxLinea.matches(matrizTipos[i][0]) )
			{
				verifica = true;
				result = matrizTipos[i][1];
			}
			
		}
		
		return result;
		
	}
}