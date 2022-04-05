package april04;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		Scanner scan = new Scanner(System.in);
		int idade = 0, contTeen = 0, contOld = 0;

		while (idade != -99) {
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();

			if (idade >= 50) {
				contOld++;
			} else if (idade < 21 && idade >=0) {
				contTeen++;
			}

		}
		System.out.println("Total de pessoas com menos de 21 anos: " + contTeen);
		System.out.println("Total de pessoas com mais de 50 anos: " + contOld);
		
		scan.close();

	}

}
