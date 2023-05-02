package observer.exercitiuseminar.main;

import observer.exercitiuseminar.clase.ClientRestaurant;
import observer.exercitiuseminar.clase.Observer;
import observer.exercitiuseminar.clase.Restaurant;
import observer.exercitiuseminar.clase.Subject;

public class Main {
	public static void main(String[] args) {
		Restaurant restaurant= new Restaurant("Bonita");
		 Observer client1= new ClientRestaurant("Bogdan");
		 Observer client2= new ClientRestaurant("Vlad");
		 Observer client3= new ClientRestaurant("Ionut");
		 
		restaurant.adugareObserver(client3);
		restaurant.stergereObserver(client1);
		
	}

}
