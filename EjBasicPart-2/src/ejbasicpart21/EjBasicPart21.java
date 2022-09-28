package ejbasicpart21;

import java.util.Scanner;

public class EjBasicPart21 {

	public static void main(String[] args) {
		final double priceManzanas = 2.35;
		final double pricePeras = 1.95;
		double kgManzanas;
		double kgPeras;
		
		double importe;
		
		
		Scanner read = new Scanner (System.in);
		System.out.print("Kilos de manzanas: ");
		kgManzanas = read.nextDouble();
		System.out.print("Kilos de peras: ");
		kgPeras = read.nextDouble();
		
		kgManzanas *= priceManzanas;
		kgPeras  *= pricePeras;
		
		importe = kgManzanas + kgPeras;
		
		System.out.println("Ganancias por Manzanas: " + Math.round(kgManzanas *100.0)/100.0 + " €");
		System.out.println("Ganancias por peras: " + kgPeras + " €");
		System.out.print("Tu importe total de ganancias ha sido de: " + importe + " €");
		
	}

}
