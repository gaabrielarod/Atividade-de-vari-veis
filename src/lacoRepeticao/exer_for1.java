package lacoRepeticao;

import java.util.Scanner;

public class exer_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int numero, quantPar=0, quantImpar=0, x;
	
		
		for (x=1; x <=10; x++) {
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				quantPar++;
			} else {
				quantImpar++;
			}
			
	}
		System.out.println(" A quantidade de números pares é: "+quantPar);
		System.out.println(" A quantidade de números ímpares é: "+quantImpar);
	}
	
}

		


