package ejbasic8;

	import java.util.Scanner;


public class EjBasic8 {
	
	
	public static void main(String[] args) {
		
		//Creamos el Scanner para que el programa sea capaz de leer todo lo introducido por el usuario
		 Scanner read = new Scanner (System.in);
		 
		 //Le pedimos al usuario que introduzca su nombre 
		 System.out.print("Introduce tu nombre: ");
		 
		 //Declaramos la variable name, que esta recogerá el dato introducido por el usuario
		 String name = read.nextLine();
		 
		//Le pedimos al usuario que introduzca su edad
		 System.out.print("Introduce tu edad: ");
		 
		//Declaramos la variable age, que esta recogerá el segundo dato introducido por el usuario
		 int age = read.nextInt();
		 
		 //Le mostramos al usuario una frase que recoge sus datos introducidos anteriormente, como el nombre y la edad
		 System.out.print("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");
		 
		
		
	}

}
