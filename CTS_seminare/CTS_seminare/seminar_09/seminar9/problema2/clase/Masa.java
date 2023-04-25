package seminar4.problema2.clase;

public class Masa {
	private boolean masaLibera;
	private int numarMasa;
	private boolean areServetele;
	
	public boolean isAreServetele() {
		return areServetele;
	}


	public void setAreServetele(boolean areServetele) {
		this.areServetele = areServetele;
	}


	public boolean isMasaLibera() {
		return masaLibera;
	}


	public void setMasaLibera(boolean masaLibera) {
		this.masaLibera = masaLibera;
	}


	public int getNumarMasa() {
		return numarMasa;
	}


	public Masa(boolean masaLibera,boolean areServetele, int numarMasa) {
		super();
		this.masaLibera = masaLibera;
		this.areServetele = areServetele;
		this.numarMasa = numarMasa;
	}
	
	
	

}
