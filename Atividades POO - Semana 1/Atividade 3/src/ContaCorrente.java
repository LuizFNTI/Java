import java.util.Scanner;

public class ContaCorrente {
	int conta;
	int agencia;
	double saldo;
	String nomeCliente;
	
	void cadastrar() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu Nome: ");
		nomeCliente = input.nextLine();
		
		System.out.println("Digite o Numero da conta: ");
		conta = input.nextInt();
		
		System.out.println("Digite Sua Agencia: ");
	    agencia = input.nextInt();
	}
	
	boolean sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente");
			return false;
		}else {
			saldo = saldo - valor;
			System.out.println("Saldo é de " + saldo);
			return true;
		}
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	void imprimir() {
		System.out.println("Conta: " + this.conta);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Nome do Cliente: " + this.nomeCliente);
	}
}
