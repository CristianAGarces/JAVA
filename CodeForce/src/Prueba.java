import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (tieneDosNumerosPares(numero)) {
            System.out.println("El número ingresado tiene dos números pares cuya suma es igual a " + numero);
        } else {
            System.out.println("El número ingresado no cumple con la condición.");
        }
    }

    public static boolean tieneDosNumerosPares(int numero) {
        int conteoPares = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                conteoPares++;
            }
            numero /= 10;
        }
        return conteoPares >= 2;
    }
}