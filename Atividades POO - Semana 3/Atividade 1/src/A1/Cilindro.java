package A1;

public class Cilindro extends Circulo{
	protected int altura;
	
	public Cilindro(int x, int y, int raio, int altura) {
		super(x, y, raio);
		this.altura = altura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	double getArea() {
		double as;
		as = 3.14 * (this.raio * this.raio);
		return as;
	}
	double getVolume() {
		double volume;
		volume = (3.14 * (this.raio * this.raio)* altura);
		return volume;
	}

}
