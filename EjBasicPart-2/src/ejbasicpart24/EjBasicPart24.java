package ejbasicpart24;

import java.util.Scanner;

public class EjBasicPart24 {

	public static void main(String[] args) {
		boolean lluvia, tareas, biblioteca, salirCalle;
		Scanner read = new Scanner (System.in);
		System.out.println("¿Está lloviendo?");
		lluvia = read.nextBoolean();
		System.out.println("¿Has hecho las tareas?");
		tareas = read.nextBoolean();
		System.out.println("¿Tienes que ir a la biblioteca?");
		biblioteca = read.nextBoolean();
		
		salirCalle = lluvia == false && tareas == true || biblioteca == true;
		
		System.out.print("¿Puedo salir a la calle?: " + salirCalle);
	}

}
