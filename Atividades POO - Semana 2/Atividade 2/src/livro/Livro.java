package livro;

public class Livro {
	private Autor autor;
	private String titulo;
	private int ano;
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void imprimir() {
		System.out.println("Autor do Livro: " + getAutor().getNome());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Ano de Publicação: " + getAno());
		
	}
}
