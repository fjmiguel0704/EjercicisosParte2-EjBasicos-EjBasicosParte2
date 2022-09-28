package exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		Scanner keyboard = new Scanner(System.in);
		
		//Creamos las variables num1 y num2
		int num1, num2;
		
		//Declaramos que la variable num2 tendrá un valor igual a 6
		num2 = 6;
		
		//Le pedimos al usuario que introduzca un valor
		System.out.print("Enter value ");
		
		//Declaramos la variable num1, que será igual a valor introducido por el usuario
		num1 = keyboard.nextInt(); 
		
		//Declaramos la variable num1, indicando que esta será la suma del valor de la variable num1 (dato introducido por el usuario) mas 2
		num1 = num1 + 2;  
		
		//Declaramos la variable num2, que será la división del valor de la variable num1 por la variable num2
		num2 = num1 / num2; 
		
		//Le mostramos al usuario el resultado de la variable num2
		System.out.println("result = " + num2);


	}

}
