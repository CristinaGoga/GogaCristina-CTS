package seminar10.strategy.clase;

public class PlataCard implements ModPlata{


    @Override
    public void plateste(String nume, double sumaDePlata) {
        System.out.println("Clientul " + nume + " realizeaza plata cu CARDUL pentru suma de " + sumaDePlata);
    }
}