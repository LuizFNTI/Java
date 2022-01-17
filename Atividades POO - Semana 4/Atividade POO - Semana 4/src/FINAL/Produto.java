package FINAL;

public class Produto {
	protected String nomeProduto;
	protected double preco;
	protected int quantidade;
	
	public Produto(String nomeProduto, double preco, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void imprimir() {
		System.out.println("Nome do Produto: " + preco);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
	}
	
	
	
	
}
