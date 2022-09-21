package ejbasic7;

import java.util.Scanner;

public class EjBasic7 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce tu nombre: ");
		String name = read.next();
		System.out.print("Introduce tu dirección: ");
		String direction = read.next();
		System.out.print("Introduce tu teléfono: ");
		int telephone = read.nextInt();
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + direction);
		System.out.println("Teléfono: " + telephone);
		

	}

}
