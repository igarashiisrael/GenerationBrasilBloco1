package april04;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int contPrincipal = 0, contCalmas = 0, contBadGirl = 0, contBadboys = 0, contOthers=0, contTeenCalm = 0, contIdosos = 0,
				totalPessoas = 1, idade;
		char sexo, jeito;

		while (contPrincipal < 2) {
			contPrincipal++;
			System.out.printf("Obtendo dados da pessoa " + (totalPessoas++ + "\n"));
			System.out.printf("Informe a idade: ");
			idade = scan.nextInt();
			System.out.printf("Informe se o sexo: (M/F/O) ");
			sexo = scan.next().charAt(0);
			System.out.printf("Informe se a pessoa é Calma(C), Nervosa(N), Agressiva(A)");
			jeito = scan.next().charAt(0);
			
			if (jeito == 'C') { contCalmas++;};
			if (sexo == 'F' && jeito == 'N') { contBadGirl++;};
			if (idade > 40 && jeito == 'N') {contIdosos++;};
			if (sexo == 'M' && jeito == 'A') {contBadboys++;};
			if (jeito == 'C' && idade < 18) {contTeenCalm++;};
			if (jeito == 'C' && sexo == 'O') {contOthers++;};
			System.out.println("\n");
		}
			
			System.out.printf("\n\nTotal de pessoas calmas: "+ contCalmas);
			System.out.printf("\nTotal de mulheres nervosas: "+ contBadGirl);
			System.out.printf("\nTotal de homens agressivos: "+ contBadboys);
			System.out.printf("\nTotal de outros calmos: "+ contOthers);
			System.out.printf("\nTotal de jovens calmos: "+ contTeenCalm);
			System.out.printf("\nTotal de idosos nervosos: "+ contIdosos);

	}

}
