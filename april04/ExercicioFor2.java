package april04;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		    
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.printf("Digite o " + i + "º número: ");
	            num = scan.nextInt();
	             
	            if(num % 2 == 0){
	                contPar++;
	            }
	            else {
	            	contImpar++;
	         
	            }
	        }
	        
	        System.out.println("Foram digitados " + contPar + " números pares e "+ contImpar + " números ímpares");
	}

}
