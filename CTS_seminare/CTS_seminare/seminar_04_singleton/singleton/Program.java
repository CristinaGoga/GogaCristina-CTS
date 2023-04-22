package cts.singleton;

public class Program {
	public static void main(String[] args) {
//		Decan decan = Decan.getInstance();
//		Decan decan1 = Decan.getInstance();
//		System.out.println(decan);
//		System.out.println(decan1);
//		decan1.setNume("Maria");
//		System.out.println(decan.getNume());
//		System.out.println(decan.getNume());
		Firma  firma1= Firma.getFirma("SC FIRMA SRL");
		Firma firma2= Firma.getFirma("SC FIRMA SRL");
		Firma firma3= Firma.getFirma("SC ALTA FIRMA SRL");
		
		firma1.setNrAngajati(10);
		firma2.setNrAngajati(15);
		firma3.setNrAngajati(20);
		
		System.out.println(firma1.toString());
		System.out.println(firma2.toString());
		System.out.println(firma3.toString());
	}
}
