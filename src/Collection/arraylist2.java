package Collection;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class arraylist2 {

	public static void main(String[] args) {
		
		boolean numEncontrado = false;
		List <Integer> listaNum = new ArrayList<Integer>( );
		
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
		
		for (int i = 0; i < listaNum.size(); i++) {
			
			if (numEsperado == listaNum.get(i)) {
				System.out.println("\nO número "+numEsperado+" foi encontrado na posição "+i);
				numEncontrado = true;
			}
			
		}
		
		if (!numEncontrado) {
			System.out.println("\nO número "+numEsperado+" não foi encontrado");
		}
		
	
		
        leia.close();

	}

}
