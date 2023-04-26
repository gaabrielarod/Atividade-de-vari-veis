package POO;

public class Vip extends Ingresso {

	private String beneficios;

	public Vip(String showIngresso, int quantIngresso, double valorUnitarioIngresso, String tipoIngresso,
			int codigoIngresso, String beneficios) {
		super(showIngresso, quantIngresso, valorUnitarioIngresso, tipoIngresso, codigoIngresso);
		this.beneficios = beneficios;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public void Imprimir() {
		System.out.println("\nEvento: "+getShowIngresso()+"\nQuantidade de ingressos: "+getQuantIngresso()+"\nValor unitário do ingresso: "+getValorUnitarioIngresso()
		+"\nTipo do ingresso: "+getTipoIngresso()+"\nCódigo do ingresso: "+getCodigoIngresso()
		+"\nBenefícios do VIP: "+beneficios);
	}
	
}
