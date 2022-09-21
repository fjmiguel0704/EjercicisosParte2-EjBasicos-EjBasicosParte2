package ejbasic4;

import java.util.Scanner;

public class EjBasic4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		int number1 = read.nextInt();
		System.out.print("Escribe el segundo número: ");
		int number2 = read.nextInt();
		double resultado = (number1 + number2) /2;
		System.out.print("la media aritmética es: " + resultado);

	}

}
