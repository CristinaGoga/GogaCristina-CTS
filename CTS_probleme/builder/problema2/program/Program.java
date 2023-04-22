package builder.problema2.program;

import builder.problema2.clase.BuilderFactura;
import builder.problema2.clase.Factura;

public class Program {
	public static void main(String[] args) {
		BuilderFactura builderFactura = new BuilderFactura(12);
		Factura factura = builderFactura.setCardFidelitate(true).setPlataCuCardul(true).build();
		System.out.println(factura.toString());
		
		
		Factura facturaNoua= new BuilderFactura(15).build();
		System.out.println(facturaNoua.toString());
	}

}
