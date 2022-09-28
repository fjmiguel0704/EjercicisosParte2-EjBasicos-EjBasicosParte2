package ejbasicpart25;

import java.util.Scanner;

public class EjBasicPart25 {

	public static void main(String[] args) {
		int note1, note2, note3;
		double noteFinal;
		double noteFInalRedondeada;
		
		Scanner read = new Scanner (System.in);
		System.out.print("Nota del primer trimestre: ");
		note1 = read.nextInt();
		System.out.print("Nota del segundo trimestre: ");
		note2 = read.nextInt();
		System.out.print("Nota del tercer trimestre: ");
		note3 = read.nextInt();

		noteFinal = (note1+note2+note3) /3.0;
		noteFInalRedondeada = Math.round(noteFinal * 100.0)/100.0;
		
		System.out.println("Nota media Boletín de calificaciones: " +  (int) noteFinal);
		System.out.println("Nota media Expediente Académido: " + noteFInalRedondeada);
	}

}
