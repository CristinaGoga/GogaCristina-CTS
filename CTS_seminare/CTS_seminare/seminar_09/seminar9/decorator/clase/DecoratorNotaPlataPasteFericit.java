package seminar4.decorator.clase;

public class DecoratorNotaPlataPasteFericit extends Decorator{

    public DecoratorNotaPlataPasteFericit(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Paste fericit!");
    }
}
