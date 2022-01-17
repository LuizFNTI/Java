import java.util.Scanner;

import sun.java2d.marlin.stats.StatLong;

public class Principal {

	public static void main(String[] args) {
		Acampamento acp1 = new Acampamento();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		acp1.nome = entrada.nextLine();
		
		System.out.println("Digite o sua idade:");
		acp1.idade = entrada.nextInt();
		
		acp1.separarGrupo(acp1.idade);
		acp1.imprimir();

	}
}

