package seminar10.strategy.main;

import seminar10.strategy.clase.Client;
import seminar10.strategy.clase.PlataCard;
import seminar10.strategy.clase.PlataCash;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Marcel");

        client.realizeazaPlata(1000);
        client.setModPlata(new PlataCard());

        client.realizeazaPlata(150);
        client.setModPlata(new PlataCash());

        client.realizeazaPlata(340);
    }
}
