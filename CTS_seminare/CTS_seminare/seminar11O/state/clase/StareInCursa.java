package seminar11O.state.clase;

public class StareInCursa implements Stare{

	@Override
	public void changeState(Autobuz autobuz) {
		if(autobuz.getStare() instanceof StareLaReparat)
		{
			System.out.println("Autobuzul cu numarul "+ autobuz.getNumarAutobuz() +" a plecat intr-o noua cursa");
		autobuz.setStare(this);
		}
		else {
			System.out.println("Autobuzul cu numarul "+ autobuz.getNumarAutobuz()+" nu este in cursa!");
		}
	}
}
