package n3exercici1;

public class NoticiaDeMotociclisme extends Noticia{
	
	private String equip;
	
	public NoticiaDeMotociclisme(String titular, String[] campsNoticia) {
		super(titular);
		this.equip = campsNoticia[0];
	}

	@Override
	public int calcularPreuNoticia() {
		int preu = 100;
		preu += this.equip.contentEquals("Honda") || this.equip.contentEquals("Yamaha") ? 50 : 0;
		return preu;
	}

	@Override
	public int calcularPuntuaciaNoticia() {
		int puntuacio = 3;
		puntuacio += this.equip.contentEquals("Honda") || this.equip.contentEquals("Yamaha") ? 3 : 0;
		return puntuacio;
	}

}
