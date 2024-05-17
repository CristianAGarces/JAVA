import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCodeForces {
	
	public static void main(String [] args){
		String password;
		
		//Arraylist, arreglo dinamico de caracteres:
		ArrayList<Character> distintos=new ArrayList<Character>();
		Scanner lector=new Scanner(System.in);				
		
		//pedir cadena al usuario 
		System.out.println("Ingrese la cadena");
		password=lector.next();
				
		//agregar el arreglo de caracteres distintos de la 
		//primera letra de la cadena:
		distintos.add(password.charAt(0));
				
		//recorrer caracteres de la cadena para ir agregando 
		//los que son distintos :
		for(int i=1; i<password.length(); i++)
			//si el caracter no esta contenido en distintos, agreguelo
		{ if(!distintos.contains(password.charAt(i))); 
			distintos.add(password.charAt(i));
			}
		
		// .size mira el tamaño del arreglo
		//contar el numero de carateres no repetidos:
		if(distintos.size() %2==0)
			System.out.println("\nNo es segura");
		else
			System.out.println("\nEs segura:");
	}
}
