import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	static int pesoSandia, num1, num2;
	public static void main(String[]args) {
		Scanner lectorConsola=new Scanner(System.in);
		Random numRandom = new Random();
		
		System.out.println("En este algoritmo vamos a dividir una sandia en numeros par");
		System.out.println("Diguita el peso de la sandia que sea 1<=pesoSandia<=100");
		pesoSandia=lectorConsola.nextInt();
		
		num1=numRandom.nextInt(25)*2;
		num2=numRandom.nextInt(25)*2;
		
		if(1<=pesoSandia&&pesoSandia<=100) {
			if(num1%2==0&&num2%2==0) {
				if(num1+num2==pesoSandia) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("Los numeros no son pares");
			}
		}else {
			System.out.println("La sandia no cumple el requisito");
		}
		
	}
}
