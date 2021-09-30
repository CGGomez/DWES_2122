package mains;

public class Triangulo extends Figura{
	
	public Triangulo (String color) {
		super(color);
	}

	@Override
	public String dibujarFigura() {
		// TODO Auto-generated method stub
		return "1 es punto, 2 es línea, 3 es triangulo";
	}
}
