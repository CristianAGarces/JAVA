import java.util.ArrayList;
import java.util.Scanner;

public class ElOElla {
	static String nombre;
	
	public static void main(String []args) {
		ArrayList<Character> distintos=new ArrayList<Character>();
		Scanner lectorConsola=new Scanner(System.in);
		System.out.println("Por favor diguite un nombre");
		nombre=lectorConsola.next();
		
		distintos.add(nombre.charAt(0));
		
		for(int i=1; i<nombre.length(); i++)
			//si el caracter no esta contenido en distintos, agreguelo
		{ if(!distintos.contains(nombre.charAt(i))); 
			distintos.add(nombre.charAt(i));
			}
		
		if(distintos.size() %2==0)
			System.out.println("Chat With Her!.");
		else
			System.out.println("Ignore him!.");
	}
}
