package seminar10.observer.main;

import seminar10.observer.clase.Client;
import seminar10.observer.clase.Observer;
import seminar10.observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Bonita");
        Observer client1 = new Client("Ion");
        Observer client2 = new Client("Maria");
        Observer client3 = new Client("Ana");

        restaurant.adaugareObserver(client1);
        restaurant.adaugareObserver(client2);

        restaurant.notificareOfertaPret();

        restaurant.stergereObserver(client1);
        restaurant.adaugareObserver(client3);

        restaurant.notificaSchimbareMeniu();
    }
}
