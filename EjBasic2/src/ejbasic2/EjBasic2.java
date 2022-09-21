package ejbasic2;

import java.util.Scanner;

public class EjBasic2 {
	

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.print("¿Cuál es tu edad?");
		int age = read.nextInt();
		System.out.print("El año que viene cumplirás: ");
		System.out.print(age + 1 + " años");

	}

}
