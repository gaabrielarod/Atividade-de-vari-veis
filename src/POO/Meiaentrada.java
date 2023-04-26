package POO;

public class Meiaentrada extends Ingresso {
	
	private String comprovanteTipo;
	
	public Meiaentrada(String showIngresso, int quantIngresso, double valorUnitarioIngresso, String tipoIngresso,
			int codigoIngresso, String comprovanteTipo) {
		super(showIngresso, quantIngresso, valorUnitarioIngresso, tipoIngresso, codigoIngresso);
		this.comprovanteTipo = comprovanteTipo;
	}

	public String getComprovanteTipo() {
		return comprovanteTipo;
	}

	public void setComprovanteTipo(String comprovanteTipo) {
		this.comprovanteTipo = comprovanteTipo;
	}
	
	public void Imprimir() {
		System.out.println("\nEvento: "+getShowIngresso()+"\nQuantidade de ingressos: "+getQuantIngresso()+"\nValor unitário do ingresso: "+getValorUnitarioIngresso()
		+"\nTipo do ingresso: "+getTipoIngresso()+"\nCódigo do ingresso: "+getCodigoIngresso()+"\nComprovante de carteirinha: "+comprovanteTipo);
		
	}
	
	public void calcularMeiaEntrada () {
		double valorMeiaEntrada = getValorUnitarioIngresso() / 2;
		System.out.println("\nValor da meia-entrada: "+valorMeiaEntrada);
	}
		
	

	
	
	

}
