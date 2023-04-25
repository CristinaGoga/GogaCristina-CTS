package seminar4.decorator.clase;

public abstract class Decorator implements INotaDePlata{
	  private INotaDePlata notaDePlata;

	    public Decorator(INotaDePlata notaDePlata) {
	        this.notaDePlata = notaDePlata;
	    }

	    @Override
	    public void printeazaTotalDePlata(double totalDePlata) {
	        this.notaDePlata.printeazaTotalDePlata(totalDePlata);
	    }

	    public abstract void printeazaFelicitare();
	}
	
