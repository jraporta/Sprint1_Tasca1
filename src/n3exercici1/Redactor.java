package n3exercici1;

import java.util.ArrayList;

public class Redactor {

	private String nom;
	private final String dni;
	private static int sou;
	private ArrayList<Noticia> noticies;
	
	static {
		Redactor.sou = 1500;
	}
	
	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
		this.noticies = new ArrayList<Noticia>();
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public void setNoticia(Noticia noticia) {
		this.noticies.add(noticia);
	}
	
	public static void setSou(int sou) {
		Redactor.sou = sou;
	}
	
	public String mostraNoticies() {
		String resposta = "";
		int i = 1;
		for (Noticia noticia : noticies) {
			resposta += "\n" + i++ + ".- " + noticia;
		}
		return resposta;
	}
	
	public boolean eliminaNoticia(Noticia noticia) {
		boolean b = false;
		if (noticia != null) {
			b = noticies.remove(noticia);
		}
		return b;
	}
	
	public Noticia trobaNoticia(String titular) {
		Noticia noticia = null;
		int i = 0;
		while(noticia == null && i < this.noticies.size()) {
			if (titular.equalsIgnoreCase(noticies.get(i).getTitular())) {
				noticia = noticies.get(i);
			}
			i++;
		}
		return noticia;
	}
	
}
