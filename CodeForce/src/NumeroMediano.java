import java.util.Scanner;

public class NumeroMediano {
static int num1, num2, num3;
	public static void main(String []args) {
	Scanner lectorConsola=new Scanner(System.in);
	
	System.out.println("Por favor diguite 3 numeros:");
	num1=lectorConsola.nextInt();
	num2=lectorConsola.nextInt();
	num3=lectorConsola.nextInt();
	
	System.out.println("El numero que se imprimira es el mediano");
	if(num1<num2&&num1>num3) {
		System.out.println(num1);
	}else if(num1>num2&&num1<num3){
		System.out.println(num1);
	}else if(num2<num1&&num2>num3) {
		System.out.println(num2);
	}else if(num2>num1&&num2<num3) {
		System.out.println(num2);
	}else if(num3<num1&&num3>num2) {
		System.out.println(num3);
	}else if(num3>num1&&num3<num2){
		System.out.println(num3);
	}
	
	lectorConsola.close();
	}
}
