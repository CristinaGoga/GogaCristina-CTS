package cts.prototype.problema_02;

import java.util.List;

public abstract class Reteta implements Cloneable {
	private String denumire;
	private List<String> ingrediente;
	public Reteta(String denumire, List<String> ingrediente) {
		super();
		this.denumire = denumire;
		this.ingrediente = ingrediente;
	}
	public String getDenumire() {
		return denumire;
	}
	
	public List<String> getIngrediente() {
		return ingrediente;
	}
	
	public abstract Reteta clone();
	
	
	

}
