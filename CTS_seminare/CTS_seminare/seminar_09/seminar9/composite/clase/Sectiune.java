package seminar4.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Item{
	private String nume;
	private List<Item> listaItems;
	
	public Sectiune(String nume)
	{
		this.nume= nume;
		this.listaItems= new ArrayList<Item>();
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		this.listaItems.add(item);
		
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		this.listaItems.remove(item);
		
	}

	@Override
	public void descriere(String indetare) {
		
		System.out.println(indetare+this.nume);
		 for(Item item: this.listaItems){
	            item.descriere(indetare + " ");
	        }
	}

	@Override
	public Item getItem(int index) throws Exception {
		
		return this.listaItems.get(index);
	}

}
