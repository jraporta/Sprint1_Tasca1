package n3exercici1;

public abstract class Noticia {
	
	private String titular;
	private String text;
	
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public abstract int calcularPreuNoticia();
	public abstract int calcularPuntuaciaNoticia();

	public String toString() {
		return "Titular: " + this.titular + " Text: " + (this.text.equalsIgnoreCase("") ? "-" : this.text);
	}
}
