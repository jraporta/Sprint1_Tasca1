package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Redactor> redactors = new ArrayList<Redactor>();
	
	final static String[][] ESPORTS = {{"Futbol","Competició", "Club", "Jugador"},{"Básquet","Competició", "Club"},
			{"Tenis", "Competició", "Tenista"}, {"F1", "Escuderia"}, {"Motociclisme", "Equip"}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String MENU = "Escull una opció:"
				+ "\n1.- Introduir un redactor."
				+ "\n2.- Eliminar un redactor."
				+ "\n3.- Introduir notícia a un redactor."
				+ "\n4.- Eliminar notícia. (demana redactor i titular)"
				+ "\n5.- Mostra totes les notícies per redactor."
				+ "\n6.- Calcula puntuació de la notícia."
				+ "\n7.- Calcula preu de la notícia."
				+ "\n0.- Sortir";
		
		int opcio = 0;
		Scanner entrada = new Scanner(System.in);
		String nomRedactor = "", dniRedactor = "";
		Redactor redactor = null;
		int esport = 0;
		ArrayList<String> campsNoticia = new ArrayList<String>();
		String titular = "";
		Noticia noticia = null;
		
		do {
			System.out.println(MENU);
			opcio = entrada.nextInt();
			switch (opcio) {
			case 1:
				System.out.print("Indica el nom del redactor: ");
				entrada.nextLine();
				nomRedactor = entrada.nextLine();
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				redactors.add(new Redactor(nomRedactor, dniRedactor));
				break;
			case 2:
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				System.out.println(eliminaRedactor(cercaRedactor(dniRedactor)) ? "S'ha eliminat el redactor" : "No s'ha pogut eliminar el redactor");
				break;
			case 3:
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				redactor = cercaRedactor(dniRedactor);
				if (redactor == null) {
					System.out.println("No s'ha trobat el redactor");
				}else {
					System.out.println(menuNoticies());
					esport = entrada.nextInt();
					//Clear buffer
					entrada.nextLine();
					System.out.print("Indica el titular de la notícia: ");
					titular = entrada.nextLine();
					campsNoticia.clear();
					for (int i = 1; i < ESPORTS[esport - 1].length ; i++) {
						System.out.print("Indica el/la " + ESPORTS[esport - 1][i] + ": ");
						campsNoticia.add(entrada.nextLine());
					}
					System.out.println(creaNoticia(redactor, titular, esport, campsNoticia) ? "Notícia creada" : "Error al crear la notícia");
				}
				break;
			case 4:
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				redactor = cercaRedactor(dniRedactor);
				if (redactor == null) {
					System.out.println("No s'ha trobat el redactor");
				}else {
					System.out.print("Indica el titular de la notícia: ");
					entrada.nextLine();
					titular = entrada.nextLine();
					System.out.println(redactor.eliminaNoticia(redactor.trobaNoticia(titular)) ? "S'ha eliminat correctament" : "Error al eliminar la notícia"); 
				}
				break;
			case 5:
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				redactor = cercaRedactor(dniRedactor);
				if (redactor == null) {
					System.out.println("No s'ha trobat el redactor");
				}else {
					System.out.println(redactor.mostraNoticies());
				}
				break;
			case 6:
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				redactor = cercaRedactor(dniRedactor);
				if (redactor == null) {
					System.out.println("No s'ha trobat el redactor");
				}else {
					System.out.print("Indica el titular de la notícia: ");
					entrada.nextLine();
					titular = entrada.nextLine();
					noticia = redactor.trobaNoticia(titular);
					if (noticia != null){
						System.out.println("La puntuació de la notícia és de: " + noticia.calcularPuntuaciaNoticia());
					}else {
						System.out.println("Notícia no trobada");
					}
				}
				break;
			case 7:
				System.out.print("Indica el dni del redactor: ");
				dniRedactor = entrada.next();
				redactor = cercaRedactor(dniRedactor);
				if (redactor == null) {
					System.out.println("No s'ha trobat el redactor");
				}else {
					System.out.print("Indica el titular de la notícia: ");
					entrada.nextLine();
					titular = entrada.nextLine();
					noticia = redactor.trobaNoticia(titular);
					if (noticia != null){
						System.out.println("El preu de la notícia és de " + noticia.calcularPreuNoticia() + "€");
					}else {
						System.out.println("Notícia no trobada");
					}
				}
				break;
			default:
				System.out.println("Opció no vàlida!");
					
				
			}
		}while (opcio != 0);
		entrada.close();
	}
	
	

	private static boolean eliminaRedactor(Redactor redactor) {
		return redactors.remove(redactor);
	}
	
	private static Redactor cercaRedactor(String dniRedactor) {
		Redactor redactor = null;
		int i = 0;
		while (redactor == null && i < redactors.size()) {
			if (redactors.get(i).getDni().equalsIgnoreCase(dniRedactor)){
				redactor = redactors.get(i);
			}
			i++;
		}
		return redactor;
	}
	
	private static String menuNoticies() {
		int i = 1;
		String resposta = "Escull el tipus de notícia:";
		for (String[] esport : ESPORTS) {
			resposta += "\n" + i++ + ".- Notícia de " + esport[0] + ".";
		}
		return resposta;
	}
	
	private static boolean creaNoticia(Redactor redactor, String titular, int esport, ArrayList<String> campsNoticia) {
		Noticia noticia = null;
		switch (esport) {
		case 1:
			noticia = new NoticiaDeFutbol(titular, castToArray(campsNoticia));
			break;
		case 2:
			noticia = new NoticiaDeBasquet(titular, castToArray(campsNoticia));
			break;
		case 3:
			noticia = new NoticiaDeTenis(titular, castToArray(campsNoticia));
			break;
		case 4:
			noticia = new NoticiaDeF1(titular, castToArray(campsNoticia));
			break;
		case 5:
			noticia = new NoticiaDeMotociclisme(titular, castToArray(campsNoticia));
			break;
		}
		if (noticia != null) {
			redactor.setNoticia(noticia);
		}
		return noticia != null;
	}
	
	private static String[] castToArray(ArrayList<String> myStringArrayList) {
		int i = 0;
		String[] myStringArray= new String[myStringArrayList.size()];
		for(String s : myStringArrayList) {
			myStringArray[i] = s;
			i++;
		}
		return myStringArray;
	}

}
