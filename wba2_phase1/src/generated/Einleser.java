package generated;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 * In der Main wird als erstes gefragt ob die Liste abgerufen werden soll, oder
 * für ein bestimmtes Rezept ein Kommentar hinzugefuegt werden soll.
 * 
 *
 */
public class Einleser {

	// private static final String sammlung = "aufg3_d/aufg3.xml";

	static Scanner sc = new Scanner(System.in);
	// Exceptions da auch im Beispiel so angegeben
	public static void main(String[] args) throws JAXBException, IOException {
		int w = 0;

		while (w == 0) {
			System.out.println("1. um Liste zusehen");
			System.out.println("2. um Kommentar hinzuzufügen");
			w = sc.nextInt();
			String nrezept;
			
			switch (w) {
			case 1:
				rezepteholen();
				w = 0;
				break;
			case 2:
				System.out.println("Welches Rezept?");
				nrezept = sc.next();
				kommentarschreiben(nrezept);
				w = 0;
				break;
			default:
				System.out.println("Ungueltig");
			}
		}
	}
	
	public static void kommentarschreiben(String nrezept) throws JAXBException, IOException {
		String name;
		String text;
		Benutzer b = new Benutzer();
	
		// AUS de Datei
		JAXBContext context = JAXBContext.newInstance("generated");
		Unmarshaller um = context.createUnmarshaller();
		Kochbuch kb = (Kochbuch) um.unmarshal(new File("aufg3_d/aufg3.xml"));
		List<Rezept> list = kb.getRezept();
		int i=0;
		// Solange suchen bis Rezept gefunden
		for (Rezept rezept : list) {
			if(rezept.getName().contains(nrezept)) {
				System.out.println("Rezept gefunden");
				i++;
				System.out.println("Name?");
				name = sc.next();
				// ACHTUNG: LEERZEICHEN WERDEN NICHT ERKANNT, GEBEN FEHLER AUS!
				System.out.println("Der Kommentar:");
				text = sc.next();
				// Benutzer Namen geben und Wert
				b.setValue(text);
				b.setBname(name);
				rezept.getKommentare().getBenutzer().add(b);
				
				// Marshalling - In XML Datei schreiben!
			    Marshaller m = context.createMarshaller();
			    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			    //m.marshal(kb, System.out);
			    // Hier wieer in die Datei schreiben, sehr wichtig!
			    m.marshal(kb, new File("aufg3_d/aufg3.xml"));
			}
		}
		if(i==0) System.out.println("Nicht gefunden\n_________________________");
		
	}

	public static void rezepteholen() throws JAXBException {

		/**
		 * Marshalling – Java Objekt in XML File Unmarshalling - umgekehrt Hole
		 * hier Rezepte aus XML Dokument Kochbuch
		 * 
		 */
		JAXBContext context = JAXBContext.newInstance("generated");
		Unmarshaller um = context.createUnmarshaller();
		Kochbuch kb = (Kochbuch) um.unmarshal(new File("aufg3_d/aufg3.xml"));
		List<Rezept> list = kb.getRezept();
		int i=0;
		for (Rezept rezept : list) {
			i++;
			System.out.println("\n"+i+".Rezept: " + rezept.getName());
			System.out.println("\tZutaten:");
			
			// Zutaten liste
			List<Zutat> zl = rezept.getZutaten().getZutat();
			for(Zutat zutat : zl) {
				System.out.println("\t \t"+zutat.getAnzahl() +" " + zutat.getMesseinheit() +"\t"+ zutat.getValue());
			}
			
			// Zubereitung mit Daten
			System.out.println("\n \tArbeitszeit: " + rezept.getZubereitung().getArbeitszeit() + " Minuten \t || \t" +
			"Brennwert: " + rezept.getZubereitung().getBrennwert() + "(Kcal) \t || \t " + "Schwierigkeit:" + rezept.getZubereitung().getSchwierigkeit());
			
			List<Schritt> sl = rezept.getZubereitung().getBeschreibung().getSchritt();
			System.out.println("\n\tZubereitung:");
			for(Schritt schritt : sl) {
				System.out.print("\t" +schritt.getSchrittnr()+"."+schritt.getValue()+"\n");
			}
			
			// Kommentare
			System.out.println("\n\tKommentare:");
			List<Benutzer> kl = rezept.getKommentare().getBenutzer();
			for(Benutzer benutzer: kl) {
				System.out.println("\t" +benutzer.getBname()+":\t "+benutzer.getValue());
			}
			
		}
	}
}
