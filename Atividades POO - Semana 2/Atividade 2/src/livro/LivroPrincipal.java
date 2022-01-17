package livro;

public class LivroPrincipal {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		Autor autor1 = new Autor();
		
		autor1.setNome("L");
		autor1.setPais("Brasil");
		autor1.setSexo("Masculino");
		livro1.setTitulo("Era Uma Vez um Livro");
		livro1.setAno(1994);
		livro1.setAutor(autor1);
		
		livro1.imprimir();
		autor1.imprimir();
	}

}
