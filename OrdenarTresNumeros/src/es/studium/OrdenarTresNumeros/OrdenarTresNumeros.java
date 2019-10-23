package es.studium.OrdenarTresNumeros;

import java.util.Scanner;

public class OrdenarTresNumeros {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo número:");
		num2=teclado.nextInt();
		
		System.out.println("Introduce el tercer número:");
		num3=teclado.nextInt();
		
		
		System.out.println("El número-->"+" "+ num2+" "+ "es mayor que el "+" " +num1 +" "+"por lo tanto el número"+" " +num3 +" es el menor");
		if(num1<=num2 && num2<=num3) {
			System.out.println("El mayor es el número:"+" "+ num3);
			System.out.println("El número intermedio es: "+" "+ num2);
			System.out.println("El menor número es:"+" "+ num1);
			
		}
		else if (num1<=num2 && num3<=num2){
			System.out.println("El mayor es el número"+ num1);
			System.out.println("El número intermedio es:"+ num3);
			System.out.println("El menor número es"+ num2);
			
		}
		teclado.close();
	}

}
