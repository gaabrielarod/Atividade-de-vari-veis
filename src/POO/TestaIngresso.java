package POO;

public class TestaIngresso {

	public static void main(String[] args) {

		Vip ingresso1 = new Vip("Rock in Rio", 1, 400, "VIP", 11912, "Open food\nOpen drinks\nBanheiro exclusivo");
		Meiaentrada ingresso2 = new Meiaentrada("Rock in Rio", 1, 400, "Meia Entrada", 98382, "Carteirinha da faculdade");

		ingresso1.Imprimir();
		ingresso2.Imprimir();
		ingresso2.calcularMeiaEntrada();

	}

	
	
	
	
}
