package ejbasicpart22;

import java.util.Scanner;

public class EjBasicPart22 {

	public static void main(String[] args) {
		int age;
		boolean mayorEdad;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce tu edad: ");
		age = read.nextInt();
		
		mayorEdad = age>=18 ? true : false;
		
		System.out.print("¿Eres mayor de edad? " + mayorEdad);

	}

}
