package Seminar11.memento.program;

import Seminar11.memento.clase.Autobuz;
import Seminar11.memento.clase.AutobuzMemento;
import Seminar11.memento.clase.OperatorAutobuze;

public class Main {
	public static void main(String[] args) {
		
		Autobuz autobuz = new Autobuz("George", 16, "Mercedes",2005, 48);
		System.out.println(autobuz.toString());
		OperatorAutobuze operator= new OperatorAutobuze();
		operator.adaugaMemento(autobuz.creareMemento());
		autobuz.setNumeSofer("Catalin");
		autobuz.setConsumMediu(17);
		System.out.println(autobuz.toString());
		autobuz.restaurareAutobuz(operator.getMemento(0));
		
		System.out.println(autobuz.toString());
	}

}
