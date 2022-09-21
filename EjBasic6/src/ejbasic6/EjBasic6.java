package ejbasic6;

import java.util.Scanner;

public class EjBasic6 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.print("Escribe el primer número: ");
		int number1 = read.nextInt();
		System.out.print("Escribe el segundo número: ");
		int number2 = read.nextInt();
		int result1 = (number1 + number2);
		int result2 = (number1 - number2);
		double result3 = (number1 * number2);
		double result4 = (number1 / number2);
		System.out.println("La Suma es: " + result1);
		System.out.println("La Resta es: " + result2);
		System.out.println("La Multiplicación es: " + result3);
		System.out.println("La División es: " + result4);

	}

}
