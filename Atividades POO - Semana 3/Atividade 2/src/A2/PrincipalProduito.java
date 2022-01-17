package A2;

public class PrincipalProduito {

	public static void main(String[] args) {
		ProdutoPerecivel p1 = new ProdutoPerecivel("Bala", 10, 1.74);
		Data dv = new Data(10,5,2020);
		Data dr = new Data(11,6,2021);
		p1.setDataValidade(dv);
		p1.setDataRetirada(dr);
		p1.retirar(5);
		p1.adicionar(5);
		p1.imprimir();
		
	}

}
