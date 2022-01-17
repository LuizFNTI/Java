import java.util.Scanner;

public class PrincipalContaCorrente {
	
	
	
	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		double valor;
		
		Scanner input = new Scanner(System.in);
		
		
		
		int resposta = 1;
	
		while(resposta == 1) {
			
			int opecao;
			
			System.out.println("Digite 1 para Saque: ");
			System.out.println("Digite 2 para Deposito: ");
			System.out.println("Digite 3 para Consulta: ");
			System.out.println("Digite 4 para Cadastro: ");
			opecao = input.nextInt();
			
			switch(opecao) {
			case 1:
				System.out.println("Digite o valor que deseja Saque: ");
				valor = input.nextDouble();
				conta1.sacar(valor);
				break;
			case 2:
				System.out.println("Digite o valor que deseja Depositar: ");
				valor = input.nextDouble();
				conta1.depositar(valor);
				break;
			case 3:
				if(conta1.nomeCliente == null ) {
					System.out.println("Cadastro não encontrado! ");
				}else {
					conta1.imprimir();
				}
				break;
			case 4:
				conta1.cadastrar();
				break;
			default:
				System.out.println("Opição Invalida!");
				break;
			}
		}
	}

}
