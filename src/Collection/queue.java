package Collection;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class queue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Queue <String> fila = new LinkedList <String> ();
		
		int op = 4;
		
		do {
			
			System.out.println("\n=== MENU ===");
			System.out.println("\n(1) Adicionar um nome na fila");
			System.out.println("\n(2) Lista de clientes na fila");
			System.out.println("\n(3) Próximo cliente a ser chamado");
			System.out.println("\n(4) Sair do menu");
			System.out.println("\nDigite uma opção: ");
			
			op = leia.nextInt();
			
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente");
				String nome = leia.next();
				fila.add(nome);
				break;
			case 2:
				leia.nextLine();
				
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					System.out.println("\nLista de clientes na fila: "+fila);	
				}
				break;
			case 3:
				leia.nextLine();
				
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia");
				} else {
					System.out.println("\n Nome que será chamado: "+fila.poll());
				} 
				break;
			case 4:
				leia.nextLine();
				System.out.println("\nPrograma finalizado.");
			
				default:
					System.out.println("\nOpção inválida!");
			}
			
			
		} while (op != 4);		
		
		
		
		
	}

}
