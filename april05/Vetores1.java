package april05;

import java.util.Random;

public class Vetores1 {

	public static void main(String[] args) {
		
		/*Crie um programa que preencha os 10 campos do vetor com números sortidos de 1 à 6*/
		
	    Random r = new Random();
		int x, vet[] = new int [10];
		
		for(x=0;x<10;x++) {
			vet[x] = (int)(Math.random()*6)+1;
			System.out.print(vet[x]+ " \t");
		}

	}

}
