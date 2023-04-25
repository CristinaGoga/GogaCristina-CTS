package seminar4.problema2.clase;

public class Facade {
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;

	public Facade() {
		ospatar= new Ospatar();
		meseRestaurant= new MeseRestaurant();
		
		meseRestaurant= new MeseRestaurant();
		meseRestaurant.adaugaMasa(new Masa(true, true, 5));
		meseRestaurant.adaugaMasa(new Masa(true, false, 4));
		meseRestaurant.adaugaMasa(new Masa(false, true, 3));
		meseRestaurant.adaugaMasa(new Masa(false, false, 2));
		
		ospatar.debaraseazaMasa(1);
		ospatar.debaraseazaMasa(3);
	}
	
	public String verificareDisponibilitateMasa(int nrMasa) {
		if(meseRestaurant.esteLibera(nrMasa)) {
			if(ospatar.esteMasaDebarasata(nrMasa)&& meseRestaurant.suntServeteleNoi(nrMasa)) {
				return "Masa este libera si puteti lua loc";
			} else {
				return "Masa este libera, asteptati sa fie debarasata";
			}
		}
		else{
			return "Masa " +nrMasa+ " nu este libera";
		}
	}

}
