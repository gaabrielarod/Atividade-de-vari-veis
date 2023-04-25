package POO;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String formaDePagamento;
	private int idade;
	private String produto;
	
	public Cliente(String nome, String endereco, String telefone, String formaDePagamento, int idade, String produto) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.formaDePagamento = formaDePagamento;
		this.idade = idade;
		this.produto = produto;
	}
	
	public Cliente(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public void imprimir() {
		System.out.println("\n\t\tINFORMAÇÕES CLIENTE: ");
		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(telefone);
	}
	
	
	
	

}
