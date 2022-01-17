package FINAL;
import java.util.ArrayList;

public class Pedido {
	protected int numPedido;
	
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	
	ArrayList<Perecivel> produtos = new ArrayList<Perecivel>();
	
	public void adicionarProduto(String nome, double preco, int quantidade, Data dataValidade) {
		
		Perecivel p = new Perecivel(nome, preco, quantidade, dataValidade);
		produtos.add(p);
		
		for(Perecivel p1 : produtos) {
			p1.getNomeProduto();
			p1.getPreco();
			p1.getQuantidade();
			p1.getDataValidade();
		}
		p.imprimir();
	}
	
	public double calcularValor() {
		double soma = 0;
		for(Perecivel p : produtos) {
			soma += p.getPreco();
		}
		return soma;
	}
	
	public int contarTotalItens() {
		int quant = produtos.size();
		return quant;
	}
	
	public int contarTotalProdutos() {
		int soma = 0;
		for(Perecivel p : produtos) {
			soma += p.getQuantidade();
		}
		return soma;
	}
}

