package A1;

public class Circulo extends Ponto {
	protected int raio;
	
	public Circulo(int x, int y, int raio) {
		super(x, y);
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	double getArea() {
		double area;
		area = 3.14 * (raio * raio);
		return area;
	}

}
