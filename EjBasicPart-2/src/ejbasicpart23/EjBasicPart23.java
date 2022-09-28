package ejbasicpart23;

import java.util.Scanner;

public class EjBasicPart23 {

	public static void main(String[] args) {
	//	boolean par;
		int num;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		num = read.nextInt();
		
	 // par = num%2 == 0 ? true : false;
		
		
		
		System.out.print((num%2 == 0 ? "par" : "impar"));

	}

}
