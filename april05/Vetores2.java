package april05;

import java.util.Scanner;

public class Vetores2 {
	
	public static void main(String[] args) {
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
		
		Scanner sc = new Scanner (System.in);
		int vet[] = new int [5], x, maiorVal=0, v=0;
		
		for (x=0;x<5;x++) {
			v=v++;
			System.out.println("Digite a pontuação " + v + ": ");
			vet[x] = sc.nextInt();
			
			System.out.println();
			
			if (vet[x]>maiorVal){
			maiorVal=vet[x];
			}
		}
		System.out.println("A pontuação é: ");
		for(x=0;x<5;x++) {
			System.out.println(vet[x] + "\t");
		}
		System.out.println("\nA maior pontuação é: "+ maiorVal);	
		
		sc.close();
			
	}

}
