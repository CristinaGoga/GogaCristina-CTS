package factory_method.problema6.clase;

public class FactoryStandUpComedy implements Factory{

	@Override
	public IShow createShow(String name, String location, String dateTime) {
		StandUpComedy  standUpComedy = new StandUpComedy(name,location,dateTime);
		standUpComedy.setComedianti(null);
		standUpComedy.setLimbajLicentios(true);
		return standUpComedy;
		
	}

}
