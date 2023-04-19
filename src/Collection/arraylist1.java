package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylist1 {

	public static void main(String[] args) {
		
		String cor;
		int x;
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> listaDeCores = new ArrayList <String>();
		
		for (x = 0; x < 5; x++) {
			
			System.out.println("Digite uma cor: ");
			cor = leia.next();
			listaDeCores.add(cor);
		
		}
			System.out.println("\nLista das cores: ");
			System.out.println(listaDeCores);
			
			Collections.sort(listaDeCores);
			System.out.println("\nLista das cores em ordem alfabética: ");
			System.out.println(listaDeCores);
			
		}

	}


