package factory_method.problema6.clase;

import java.util.List;

public class FactoryConcert implements Factory{

	@Override
	public IShow createShow(String name, String location, String dateTime) {
		Concert concert = new Concert(name,location,dateTime);
		concert.setArtisiti(null);
		concert.setGenMuzica("pop");
		return concert;
		
	}

}
