package Collection;

import java.util.Scanner;
import java.util.HashSet;


public class set1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		HashSet <Integer> listaNum = new HashSet <Integer>(); {
		
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
		
		//System.out.println("Lista de números"+listaNum);
	    // pra cada item dentro do objeto 'listaNum' ser printado, utiliza:
		listaNum.forEach(System.out::println);
		
		//para cada num dentro da listaNum, é printado
		//for(int num:listaNum) {
		//System.out.println(num);
		
        leia.close();
		//}
	}
	
	}
}


	
	
	
	
	
