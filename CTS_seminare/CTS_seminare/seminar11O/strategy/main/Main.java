package seminar11O.strategy.main;

import seminar11O.strategy.clase.Calator;
import seminar11O.strategy.clase.PlataCardBancar;
import seminar11O.strategy.clase.PlataSMS;

public class Main {
	public static void main(String[] args) {
		Calator calator =new Calator("Goga Cristina");
		calator.platesteBilet(2);
		calator.setModPlata(new PlataSMS());
		calator.platesteBilet(2.5);
		calator.setModPlata(new PlataCardBancar());
		calator.platesteBilet(3);
	}

}
