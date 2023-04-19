package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class set2 {

	public static void main(String[] args) {
		
		HashSet <Integer> listaNum = new HashSet<Integer>( );
		Scanner leia = new Scanner (System.in);
		
		int numEsperado;
			
			listaNum.add(1);
			listaNum.add(2);
			listaNum.add(3);
			listaNum.add(4);
			listaNum.add(5);
			listaNum.add(6);
			listaNum.add(7);
			listaNum.add(8);
			listaNum.add(9);
			listaNum.add(10);
		
		System.out.println("\nDigite um número: ");
		numEsperado = leia.nextInt();
		
		if (listaNum.contains(numEsperado)) {
			System.out.println("\nO número "+numEsperado+" foi encontrado!");
			
		}else {
			System.out.println("\nO número "+numEsperado+" não foi encontrado!");
		}

	}

}
