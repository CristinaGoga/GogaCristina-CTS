package seminar4.problema2.main;

import seminar4.problema2.clase.Facade;

public class Main {
	public static void main(String[] args) {
		Facade restaurant = new Facade();
		System.out.println(restaurant.verificareDisponibilitateMasa(2));
		System.out.println(restaurant.verificareDisponibilitateMasa(3));
		System.out.println(restaurant.verificareDisponibilitateMasa(4));
	}

}
