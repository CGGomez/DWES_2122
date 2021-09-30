package mains;

public abstract class Figura{
	private String color;
	
	public Figura (String color){
		this.setNombre(color);
	}

	public String getColor() {
		return color;
	}

	public void setNombre(String color) {
		this.color = color;
	}
	
	public abstract String dibujarFigura();
}
