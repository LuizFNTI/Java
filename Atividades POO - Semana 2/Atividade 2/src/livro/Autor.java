package livro;

public class Autor {
	private String nome;
	private String pais;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void imprimir() {
		System.out.println("Mais Informações Sobre o Autor:");
		System.out.println("Nome: " + this.nome);
		System.out.println("País de Origem: " + this.pais);
		System.out.println("Sexo: " + this.sexo);
	}
	
}
