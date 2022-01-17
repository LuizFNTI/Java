
public class Acampamento {
	String nome;
	String equipe;
	int idade;
	
	void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Equipe: " + this.equipe);
		System.out.println("Idade: " + this.idade);
	}
	
	String separarGrupo(int equipe) {
		if(idade >= 6 && idade <= 10) {
			this.equipe = "A";
		}else if(idade >= 11 && idade <= 20) {
			this.equipe = "B";
		}else if(idade >= 21) {
			this.equipe = "C";
		}
		return this.equipe;
	}
}
