package FINAL;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cliente cli = new Cliente(1, "L", "3232-3232", "Rua 1");
		FichaCliente fc = new FichaCliente();
		Pedido p = new Pedido();
		Pagamento pg = new Pagamento();
		Compra cp = new Compra();
		
		fc.setCli(cli);
		cp.setPed(p);
		cp.setPag(pg);
		fc.setCmp(cp);
		
		System.out.println("");
		System.out.println("----------FICHA CLIENTE----------");
		System.out.println("ID Cliente: " + fc.getCli().getId());
		System.out.println("Nome: " + fc.getCli().getNome());
		System.out.println("Telefone: " + fc.getCli().getTelefone());
		System.out.println("Endereço: " + fc.getCli().getEndereco());
		System.out.println("");
		
		p.setNumPedido(45895254); 
		Data d1 = new Data(12,12,2021);
		Data d2 = new Data(31,12,2021);
		System.out.println("----------PRODUTOS----------");
		System.out.println("");
		p.adicionarProduto("Bala", 25.00, 5, d1);
		p.adicionarProduto("Agua", 25.00, 115, d2);
		cp.setValorTotal(p.calcularValor());
		cp.setQuantItens(p.contarTotalItens());
		fc.getCmp().setIdCompra(1);
		
		System.out.println("----------DADOS DA COMPRA----------");
		System.out.println("");
		System.out.println("ID da Compra: " + fc.getCmp().getIdCompra());
		System.out.println("Numero do Pedido: " + cp.getPed().getNumPedido());
		System.out.println("Quantidade Total de itens: " + cp.getQuantItens());
		System.out.println("Quantidade Total de Produtos: " + p.contarTotalProdutos());
		System.out.println("Total da Compra: " + cp.getValorTotal());
		
		//PAGAMENTO
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("----------PAGAMENTO----------");
		System.out.println("");
		
		System.out.println("Digite 1 para Cartão de Crédito");
		System.out.println("Digite 2 para Boleto");
		int opc = input.nextInt();
		
		switch(opc) {
		case 1:
			TipoPagamento cartao = new CartaoDeCredito();
			
			pg.setPagamento(cartao);
				
			System.out.println("");
			System.out.println("----------PAGAMENTO----------");
			System.out.println("");
			System.out.println("Forma de Pagamento Utilizada: " + cartao.formaEscolhida());
			System.out.println("Dia de Faturamento: " + cartao.getDiasFaturamento());	
			System.out.println("Porcentagem Financeira: " + cartao.getPorcentagemFinanceira() + "%");
			//FAZ O ACRÉSCIMO DA PORCENTAGEM FINANCEIRA
			cp.getPag().setValor((cp.getValorTotal() * cartao.getPorcentagemFinanceira() / 100) + cp.getValorTotal());
			System.out.println("Total a Pagar: " + cp.getPag().getValor());
			break;
		case 2:
			TipoPagamento boleto = new Boleto();
			
			pg.setPagamento(boleto);
			
			System.out.println("");
			System.out.println("----------PAGAMENTO----------");
			System.out.println("");
			System.out.println("Forma de Pagamento Utilizada: " + boleto.formaEscolhida());
			System.out.println("Dia de Faturamento: " + boleto.getDiasFaturamento());
			System.out.println("Porcentagem Financeira: " + boleto.getPorcentagemFinanceira() + "%");
			
			cp.getPag().setValor((cp.getValorTotal() * boleto.getPorcentagemFinanceira() / 100) + cp.getValorTotal());
			System.out.println("Total a Pagar: " + cp.getPag().getValor());
			break;
		default:
			System.out.println("Opição Invalida!!! ");
			break;
		}	
	}

}
