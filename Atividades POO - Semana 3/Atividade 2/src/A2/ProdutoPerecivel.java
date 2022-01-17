package A2;

public class ProdutoPerecivel extends Produto {
	protected Data dataValidade;
	protected Data dataRetirada;
	
	public ProdutoPerecivel(String nome, int quantidade, double valorUnitario) {
		super(nome, quantidade, valorUnitario);
		
	}

	public Data getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public Data getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Data dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	@Override
	int retirar(int quant) {
		if(dataRetirada.getMes() > dataValidade.getMes() && dataRetirada.getDia() > dataValidade.getDia()) {
			quantidade = 0;
			System.out.println("Produtos vencidos foram descartados! ");
		}else {
		quantidade -= quant;
		System.out.println("Quantidade Retirada: " + quant);
		System.out.println("Quantidade Atual: " + quantidade);
		}
		return quantidade;
	}
	@Override
	int adicionar(int quant) {
		if(quantidade == 0) {
		quantidade += quant;
		System.out.println("Quantidade Adicionada: " + quant);
		System.out.println("Quantidade Atual: " + quantidade);
		}
		return quantidade;
	}
	void imprimir() {
		System.out.println("Nome Produto: " + getNome());
		System.out.println("Quantidade em Estoque: " + getQuantidade());
		System.out.println("Valor Unitário: " + getValorUnitario());
		System.out.println("Data Validade " + dataValidade.getDia() + dataValidade.getMes() + dataValidade.getAno());
	}
}
