package exercise5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		//Creamos las variables 
		int longitud;
		int altura;
		int area;
		int perímetro;
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduza la longitud del rectángulo
		System.out.print("Introduce la longitud del rectángulo: ");
		
		//Declaramos la varibale longitud, que será igual a lo introducido por el usuario
		longitud = read.nextInt();
		
		//Le pedimos al usuario que introduza la altura del rectángulo
		System.out.print("Introduce la altura del rectángulo: ");
		
		//Declaramos la varibale altura, que será igual a lo introducido por el usuario
		altura = read.nextInt();
		
		//Declaramos las variables area y perímetro donde se realizarán los cálculos que sean capaz de dar resultado a cada una de ellas
		area = longitud * altura;
		perímetro = (longitud * 2) + (altura * 2);
		
		//Le mostramos al usuario el resultado de las variables area y perímetro
		System.out.println("El área del rectángulo es: " + area + " cm²");
		System.out.println("El perímetro del rectángulo es: " + perímetro + " cm");
	}

}
