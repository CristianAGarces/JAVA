import java.util.Scanner;

public class BearlimakAndBob {
	static int numA, numB,resultadoA,resultadoB;
	
	public static void main(String []args) {
		Scanner lectorConsola =new Scanner(System.in);
		System.out.println("Diguite un numero A para el peso de Limak y un peso B para el peso de Bob");
		numA=lectorConsola.nextInt();
		numB=lectorConsola.nextInt();

		int i=0;
		while(numA<=numB){
			numA=numA*3;
			numB=numB*2;
			i++;
		}
		
		System.out.println(i);
	}
}

