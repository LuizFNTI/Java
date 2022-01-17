package A2;

public class Produto {
	protected String nome;
	protected int quantidade;
	protected double valorUnitario;
	
	public Produto(String nome, int quantidade, double valorUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	int retirar(int quant) {
		quantidade -= quant;
		System.out.println("Quantidade Retirada: " + quant);
		System.out.println("Quantidade Atual: " + quantidade);
		return quantidade;
	}
	int adicionar(int quant) {
		quantidade += quant;
		System.out.println("Quantidade Adicionada: " + quant);
		System.out.println("Quantidade Atual: " + quantidade);
		return quantidade;
	}
}
