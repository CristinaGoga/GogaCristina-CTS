package seminar11O.state.clase;

public class StareLaReparat  implements Stare{

	@Override
	public void changeState(Autobuz autobuz) {
		if(autobuz.getStare() instanceof StareLaCapatulLiniei)
		{
			System.out.println("Autobuzul cu numarul "+ autobuz.getNumarAutobuz() +" este acum la service!");
		autobuz.setStare(this);
		}
		else {
			System.out.println("Autobuzul cu numarul "+ autobuz.getNumarAutobuz()+" nu este la service!");
		}
	}

}
