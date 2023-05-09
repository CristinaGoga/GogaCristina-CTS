package Seminar11.template.program;

import Seminar11.template.clase.MasaLocala;
import Seminar11.template.clase.MasaRestaurant;
import Seminar11.template.clase.MasaRezervata;

public class Main {
	public static void main(String[] args) {
		MasaRestaurant masa = new MasaRezervata(5, "20:00");
		masa.ocupaMasa();
		System.out.println("\n");
		MasaRestaurant masa2 = new MasaLocala(7);
		masa2.ocupaMasa();
		
	}

}
