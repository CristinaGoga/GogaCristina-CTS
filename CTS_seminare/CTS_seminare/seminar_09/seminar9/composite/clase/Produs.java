package seminar4.composite.clase;

public class Produs  implements Item{
	private String nume;
	

	public Produs(String nume) {
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		throw new Exception("Adaugare Item nu este implementat");
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		throw new Exception("Stergere Item nu este implementat");
		
	}

	@Override
	public void descriere(String indetare) {
		System.out.println(indetare+this.nume);
		
	}

	@Override
	public Item getItem(int index) throws Exception {
		throw new Exception("Get Item  nu este implementat");
		
	}

}
