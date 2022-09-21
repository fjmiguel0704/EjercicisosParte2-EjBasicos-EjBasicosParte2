package ejbasic3;

import java.util.Scanner;

public class EjBasic3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Introduce el año actual: ");
		int yeara = read.nextInt();
		System.out.print("Introduce el año de tu nacimiento: ");
		int yearn = read.nextInt();
		System.out.print(yeara - yearn + " años");
		

	}

}
