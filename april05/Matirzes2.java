package april05;

import java.util.Scanner;

public class Matirzes2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int M[][]= new int [3][3], linha, coluna,soma1=0, soma2=0, n, x=0;
		
		System.out.println("Entre com 9 valores de sua escolha: ");
		for(linha=0; linha<3; linha++) {
			for(coluna=0; coluna<3; coluna++) {
			x++;
			System.out.print("Entre com o valor "+x+": ");
			M[linha][coluna] = sc.nextInt();
			soma1 = soma1+M[linha][coluna];
	        soma2 = M[0][0]+M[1][1]+M[2][2];
			}
		}
		for(linha=0; linha<3; linha++) {
			for(coluna=0; coluna<3; coluna++) {
			System.out.print(M[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println("A soma de todos os números é: "+ soma1);
        System.out.println("A soma de todos os números na diagonal é: "+ soma2);
	}

}
