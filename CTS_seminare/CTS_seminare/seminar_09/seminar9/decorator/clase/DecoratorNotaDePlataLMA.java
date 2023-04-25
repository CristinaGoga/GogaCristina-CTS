package seminar4.decorator.clase;

public class DecoratorNotaDePlataLMA extends Decorator{

    public DecoratorNotaDePlataLMA(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaTotalDePlata(double totalDePlata) {
        super.printeazaTotalDePlata(totalDePlata);
        System.out.println("La multi ani!");
    }



    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
