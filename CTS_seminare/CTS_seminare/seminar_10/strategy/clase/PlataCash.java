package seminar10.strategy.clase;

public class PlataCash implements ModPlata{


    @Override
    public void plateste(String nume, double sumaDePlata) {
        System.out.println("Clientul " + nume + " realizeaza plata CASH pentru suma de " + sumaDePlata);
    }
}
