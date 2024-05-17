import java.util.Scanner;

public class Leaderboard {
	//atributos
		static String nombreVideojuego;
		
	//arreglo de nombres
		static String nombresJugadores[];
		
	//matriz de puntajes
		static int puntajes[][];
		
	//promedios
		static float promedioHealthPoint, promedioPuntos;
		
	//Constante para el numero de jugadores
		final static int NUM_JUGADORES = 3;
		
	//metodos
		public static void main( String [] args ){
			pedirNombreVJ();
			leerDatos();
			calcularPromedio();
			mostrarPromedio();
		}
		
		public static void pedirNombreVJ() {
			//se crea objeto para leer por consola
			Scanner lectorConsola = new Scanner (System.in);
			System.out.println("Ingrese el nombre del videojuego: ");
			nombreVideojuego = lectorConsola.next();
		}
		
		public static void leerDatos() {
			Scanner lectorConsola = new Scanner (System.in);
			puntajes = new int [NUM_JUGADORES][2];
			nombresJugadores= new String [NUM_JUGADORES];
			//recorrer arreglo
			for(int i = 0; i < NUM_JUGADORES; i++) {
				//leer cada nombre:
				System.out.println("Ingrese el nombre del jugador: #" + (i+1));
				nombresJugadores[i]= lectorConsola.next();
				
				System.out.println("Ingrese el numero de puntaje:" +(i+1));
				puntajes[i][0]= lectorConsola.nextInt();
				
				System.out.println("Ingrese el numero de HP:" +(i+1));
			    puntajes [i][1]= lectorConsola.nextInt();
			}
		}
		
		//tarea
		public static void calcularPromedio() {
			float sumPuntos = 0 , sumHP = 0;
			for(int i = 0; i<NUM_JUGADORES; i++){
				sumPuntos +=puntajes[i][0];
				sumHP +=puntajes[i][1];
			}
			promedioPuntos= sumPuntos/NUM_JUGADORES;
			promedioHealthPoint=sumHP/NUM_JUGADORES;
		}
		
		//tarea
		public static void mostrarPromedio() {
			System.out.println(nombreVideojuego);
			for(int i=0;i<nombresJugadores.length;i++) {
				System.out.println("Nombre de jugadores");
				System.out.println(nombresJugadores[i]);
			}
			System.out.println("Nombre de jugadores");
			System.out.println("Promedio es de: " + promedioPuntos);
			System.out.println("Promedio de HealthPoint es: " + promedioHealthPoint);
		}
}
