package builder.problema2.clase;

public class BuilderFactura implements Builder {
	public Factura factura;
	
	
	public BuilderFactura(int numarFactura) {
		this.factura= new Factura();
		factura.setNumarFactura(numarFactura);
	}
	
	@Override
	public Factura build() {
		return this.factura;
	}
	
	public BuilderFactura setNumarFactura(int numarFactura) {
		this.factura.setNumarFactura(numarFactura);
		return this;
	}
	public BuilderFactura setNumarPunga(Boolean numarPunga) {
		this.factura.setNumarPunga(numarPunga);
		return this;
	}
	public BuilderFactura setPlataCuCardul(Boolean plataCuCardul) {
		this.factura.setPlataCuCardul(plataCuCardul);
		return this;
	}
	public BuilderFactura setCardFidelitate(Boolean cardFidelitate) {
		this.factura.setCardFidelitate(cardFidelitate);
		return this;
	}
	public BuilderFactura setPlatitorTva(Boolean platitorTva) {
		this.factura.setPlatitorTva(platitorTva);
		return this;
	}
	
	

}
