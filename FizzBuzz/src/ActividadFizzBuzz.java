import java.util.Scanner;

public class ActividadFizzBuzz {
	static String nombreUsuario;
	static int numero;
	final static int tope = 20;
	
	public static void main(String [] args) {
		Scanner lectorScanner =new Scanner (System.in);
		System.out.println("\tBienvenido a este software");
		System.out.println("Ingrese su nombre usuario");
		nombreUsuario = lectorScanner.next();
		System.out.println("Porfavor usuario '"+ nombreUsuario+"' ingrese un nombre entero para saber si es multiplo de '5' o '3'");
		numero = lectorScanner.nextInt();
		
		if (numero % 3 == 0 && numero % 5 == 0 ){
			System.out.println("Fizz Buzz");
		} else if (numero % 3 == 0) {
			System.out.println("Es multiplo de 3 'fizz'");
		} else if (numero % 5 == 0) {
			System.out.println("Es multiplo de 5 'buzz'");
		} else {
			System.out.println("No es multiplo de los 2 numeros propuesto, su numero es: #"+numero);
		}
	}
}
