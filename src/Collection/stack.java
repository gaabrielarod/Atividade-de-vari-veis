package Collection;

import java.util.Stack;
import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		
	
		Stack <String> pilha = new Stack<String> ();
		Scanner leia = new Scanner (System.in);
		
		int op = 4;
		
		do {
			
			System.out.println("\n=== MENU ===");
		    System.out.println("\n(1) Adicionar livro na pilha");
		    System.out.println("\n(2) Listar todos os livros");
		    System.out.println("\n(3) Retirar livro da pilha");
		    System.out.println("\n(4) Sair");
		    System.out.println("\nDigite uma opção: ");
		    op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nAdicione um livro: ");
				String livro = leia.next();
				pilha.push(livro);
				System.out.println("\nLivro adicionado!");
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nLista de todos os livros: ");
				System.out.println(pilha);
				break; 
				
			case 3:
				leia.nextLine();
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				} else {
					System.out.println("\nLivro retirado: "+pilha.pop());
				}
				break;
				
			case 4:
				leia.nextLine();
				System.out.println("Obrigado e volte sempre");
				break;
				
				default:
					System.out.println("\nOpção inválida!");
			
		} 
		} while (op != 4);		
		
	}

}
