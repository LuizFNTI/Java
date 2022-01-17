package FINAL;

public class Perecivel extends Produto {
	protected Data dataValidade;
	
	public Perecivel(String nomeProduto, double preco, int quantidade, Data dataValidade) {
		super(nomeProduto, preco, quantidade);
		this.dataValidade = dataValidade;
	}

	public Data getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Validade: " + dataValidade);
		System.out.println("");
	}
}
