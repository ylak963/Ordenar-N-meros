package es.studium.OrdenarTresNumeros;

import java.util.Scanner;

public class OrdenarTresNumeros {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero:");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		num2=teclado.nextInt();
		
		System.out.println("Introduce el tercer n�mero:");
		num3=teclado.nextInt();
		
		
		System.out.println("El n�mero-->"+" "+ num2+" "+ "es mayor que el "+" " +num1 +" "+"por lo tanto el n�mero"+" " +num3 +" es el menor");
		if(num1<=num2 && num2<=num3) {
			System.out.println("El mayor es el n�mero:"+" "+ num3);
			System.out.println("El n�mero intermedio es: "+" "+ num2);
			System.out.println("El menor n�mero es:"+" "+ num1);
			
		}
		else if (num1<=num2 && num3<=num2){
			System.out.println("El mayor es el n�mero"+ num1);
			System.out.println("El n�mero intermedio es:"+ num3);
			System.out.println("El menor n�mero es"+ num2);
			
		}
		teclado.close();
	}

}
