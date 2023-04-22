package builder.problema2.clase;

public class Factura {
	private int numarFactura;
	private Boolean numarPunga;
	private Boolean plataCuCardul;
	private Boolean cardFidelitate;
	private Boolean platitorTva;
	
	public Factura()
	{
		this.numarFactura =0;
		this.numarPunga=false;
		this.plataCuCardul=false;
		this.cardFidelitate= false;
		this.platitorTva=false;
	}

	public void setNumarFactura(int numarFactura) {
		this.numarFactura = numarFactura;
	}

	public void setNumarPunga(Boolean numarPunga) {
		this.numarPunga = numarPunga;
	}

	public void setPlataCuCardul(Boolean plataCuCardul) {
		this.plataCuCardul = plataCuCardul;
	}

	public void setCardFidelitate(Boolean cardFidelitate) {
		this.cardFidelitate = cardFidelitate;
	}

	public void setPlatitorTva(Boolean platitorTva) {
		this.platitorTva = platitorTva;
	}

	@Override
	public String toString() {
		return "Factura " + numarFactura + 
				"contine: numarPunga=" + numarPunga +
				", plataCuCardul="+ plataCuCardul + 
				", cardFidelitate=" + cardFidelitate + ", platitorTva=" + platitorTva + "]";
	}
	
	

}
