package cts.singleton;

public class Rector {
	private String nume;
	private  int numarMandate;
	private int varsta;
	
	public static Rector instanta = null;
	
	public Rector(String nume, int numarMandate, int varsta) {
		super();
		this.nume = nume;
		this.numarMandate = numarMandate;
		this.varsta = varsta;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNumeMandate() {
		return numarMandate;
	}
	public void setNumeMandate(int numeMandate) {
		this.numarMandate = numeMandate;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public static Rector getInstanta() {
		return instanta;
	}
	
	public static synchronized Rector getInstanta(String nume, int nrMandate, int varsta) {
		if(instanta == null) {
			instanta= new Rector(nume, nrMandate, varsta);
		}
		return instanta;
	}


	@Override
	public String toString() {
		return "Rector [nume=" + nume + ", numarMandate=" + numarMandate + ", varsta=" + varsta + "]";
	}
	
}
