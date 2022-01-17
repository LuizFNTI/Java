package triangulo;

public class Trapezio {
	private int baseMaior;
	private int baseMenor;
	private int altura;
	
	public int getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(int baseMaior) {
		this.baseMaior = baseMaior;
	}

	public int getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(int baseMenor) {
		this.baseMenor = baseMenor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		int area;
		area = ((this.baseMaior + this.baseMenor) * this.altura) / 2;
		System.out.println("A area do Trapézio é: " + area);
		return area;
	}
}
