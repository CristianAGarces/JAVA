import java.util.Scanner;

public class LiebreTortuga {
	
	static int pasosTortuga, pasosLiebre, totalTortuga, totalLiebre;
	static String nombreUsuario;
	final static int finJuego= 100;
	
	public static void main( String [] args ){
		Scanner lectorConsola = new Scanner(System.in);
		System.out.println("Bienvenido al juego de la tortuga & la liebre");
		System.out.println("Ingrese su nombre usuario");
		nombreUsuario =lectorConsola.next();
		System.out.println("Bienvenido usuario " +nombreUsuario);

		int contador=1;
		while(totalLiebre < finJuego && totalTortuga < finJuego){
			System.out.println("Ingrese un numero de 1 al 10 para la Tortuga, paso: #"+contador);
			pasosTortuga=lectorConsola.nextInt();
			totalTortuga= totalTortuga + pasosTortuga;
			System.out.println("Ingrese un numero de 1 al 10 para la Liebre, paso #"+contador);
			pasosLiebre=lectorConsola.nextInt();
			totalLiebre= totalLiebre + pasosLiebre;
			contador++;
		}
		
		if (totalTortuga==totalLiebre){
			System.out.println("Empate");
		} else if(totalTortuga>=finJuego) {
			System.out.println("Gano la tortuga");
		} else if (finJuego <= totalLiebre){
			System.out.println("Gano la liebre");
		} 
		
		System.out.println("Debe ser mayor a 100 para ganar y si tienen el mismo puntaje sera empate");
		System.out.println("Pasos de la tortuta:"+totalTortuga);
		System.out.println("Pasos de la Liebre:"+totalLiebre);
		
	}
	
}
