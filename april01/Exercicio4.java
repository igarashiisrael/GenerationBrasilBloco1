package april01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
			int num, resto;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Digite o número: ");
			num = leia.nextInt();
			
			resto = num % 2;
					
			if (resto == 0) {
				System.out.println("O número " + num + " é par" + 
			    " e sua raiz quadrada é " +  Math.sqrt(num));
				// 'Math.sqrt(x)' é para calcular a raiz quadrada de um núemro(x)
			}
			else {
				System.out.println("O número " + num + " é impar" +
				" e ao elevá-lo ao quadrado, o resultado é " + Math.pow(num, 2));
				/* 'Math.pow(x, y)' é para elevar um número(x) a uma potência(y).
				   Neste caso, ao quadrado. */
			}
			System.out.println("Programa Finalizado!!");
	}

}