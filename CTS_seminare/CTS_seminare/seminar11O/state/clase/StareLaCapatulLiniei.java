package seminar11O.state.clase;

public class StareLaCapatulLiniei implements Stare{

	@Override
	public void changeState(Autobuz autobuz) {
		if(autobuz.getStare()instanceof StareInCursa || autobuz.getStare()instanceof StareLaReparat)
		{
			System.out.println("Autobuzul cu numarul " + autobuz.getNumarAutobuz()+" a ajuns la finalul liniei!");
			autobuz.setStare(this);
		}
		
		
		else {
			System.out.println("Autobuzul cu numarul "+ autobuz.getNumarAutobuz()+" nu este in cursa!");
		}
	}

}
