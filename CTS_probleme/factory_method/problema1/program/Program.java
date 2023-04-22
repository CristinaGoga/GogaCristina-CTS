package factory_method.problema1.program;

import java.util.ArrayList;
import java.util.List;

import factory_method.problema1.clase.Factory;
import factory_method.problema1.clase.SupaCiuperciFactory;
import factory_method.problema1.clase.SupaDeVitaFactory;
import factory_method.problema1.clase.SupaLegumeFactory;
import factory_method.problema1.clase.TipSupa;

public class Program {
	public static void main(String[] args) {
		Factory fabricaSupaLegume = new SupaLegumeFactory();
		Factory fabricaSupaDeVita = new SupaDeVitaFactory();
		Factory fabricaSupaCiuperci = new SupaCiuperciFactory();
		
		List<TipSupa> listaSupe = new ArrayList<>();
		listaSupe.add(fabricaSupaLegume.createTipSupa(123,15));
		listaSupe.add(fabricaSupaCiuperci.createTipSupa(120,20));
		listaSupe.add(fabricaSupaDeVita.createTipSupa(131,21));
		for(TipSupa supa: listaSupe) {
			supa.descriere();
		}
	}

}
