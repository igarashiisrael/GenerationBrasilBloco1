package april04;

import java.util.Scanner;

public class ExcericioDoWhile2 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */
		Scanner scan = new Scanner(System.in);
		int num, soma=0;
		double media=0, cont=0;

		do {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			if (num %3==0 && num!=0) {
			soma = soma+num;
			cont++;
			}
		} while (num !=0);
		media = soma/cont;
		System.out.println("A media dos n�meros �: "+ media);
	}
}
