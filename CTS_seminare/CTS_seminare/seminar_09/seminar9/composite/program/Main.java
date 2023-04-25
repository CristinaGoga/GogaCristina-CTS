package seminar4.composite.program;

import seminar4.composite.clase.Item;
import seminar4.composite.clase.Produs;
import seminar4.composite.clase.Sectiune;

public class Main {
	public static void main(String[] args) {
		
		Item meniu = new Sectiune("Meniu");
		
		Item sectiuneBauturi= new Sectiune("Bauturi");
		Item sectiuneStartere= new Sectiune("Startere");
		
		Item sectiuneSucuri= new Sectiune("Sucuri");
		Item sectiuneCafea= new Sectiune("Cafea");
		
		Item produsCafeNeagra= new Produs("CafeaNeagra");
		Item produsCapuccino= new Produs("Capuccino");
		
		Item produsCocaCola= new Produs("Coca-cola");
		Item produsPepsi= new Produs("Pepsi");
		
		Item produsApaPlata= new Produs("Apa Plata");
		
		
		Item bruschete = new Produs("Bruschete");
		
		
		try {
			sectiuneCafea.adaugareItem(produsCafeNeagra);
			sectiuneCafea.adaugareItem(produsCapuccino);
			
			sectiuneSucuri.adaugareItem(produsPepsi);
			sectiuneSucuri.adaugareItem(produsCocaCola);
			
			
			sectiuneBauturi.adaugareItem(sectiuneCafea);
			sectiuneBauturi.adaugareItem(sectiuneSucuri);
			sectiuneBauturi.adaugareItem(produsApaPlata);
			
			sectiuneStartere.adaugareItem(bruschete);
			
			meniu.adaugareItem(sectiuneBauturi);
			meniu.adaugareItem(sectiuneStartere);;
			meniu.descriere("   ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
