package lacoRepeticao;

import java.util.Scanner;

public class exer_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int idade, x=0, y=0; 
		
		System.out.println("Entre com uma idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			
			System.out.println("Entre com uma idade: ");
			idade = leia.nextInt();
			
			if(idade >= 1 && idade <= 21 ) {
				x++;
			} else if ( idade >= 50 ); {
				y++;	
			}
					
		}
		System.out.println("Total de pessoas menores de 21 anos: "+x);
		System.out.println("Total de pessoas maiores de 50 anos:"+y);
	
	}

}
