package simple_factory.problema2.program;

import java.util.ArrayList;
import java.util.List;


import simple_factory.problema2.clase.Credit;
import simple_factory.problema2.clase.CreditIpotecar;
import simple_factory.problema2.clase.CreditNevoiPersonale;
import simple_factory.problema2.clase.Factory;
import simple_factory.problema2.clase.TipCredit;

public class Program {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Credit creditIpotecar= new CreditIpotecar("Goga Cristina", (double) 30000000);
		Credit creditNevoiPersonale= new CreditNevoiPersonale("Gigel Popa", (double) 76404460);
		creditIpotecar.descriere();
		creditNevoiPersonale.descriere();
		System.out.println("\n");
		
		
		
		List<Credit> credite = new ArrayList<>();
		credite.add(creditNevoiPersonale);
		credite.add(creditIpotecar);
		credite.add(factory.getInstance(TipCredit.IPOTECAR, "Barbulescu Andrei", 2344566));
		credite.add(factory.getInstance(TipCredit.NEVOI_PERSONALE, "Tomescu Alexandru", 456245));
		
		for(Credit credit : credite) {
			credit.descriere();
		}
		
		
	}

}
