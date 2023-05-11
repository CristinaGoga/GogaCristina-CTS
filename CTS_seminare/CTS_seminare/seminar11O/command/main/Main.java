package seminar11O.command.main;

import seminar11O.command.clase.Autobuz;
import seminar11O.command.clase.Automobil;
import seminar11O.command.clase.CommandPlecareInCursa;
import seminar11O.command.clase.ManagerComenzi;

public class Main {
	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		Automobil autobuz = new Autobuz(13);
		managerComenzi.invocaComanda(new CommandPlecareInCursa(3, new Autobuz(1)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(4, autobuz));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(5, new Autobuz(3)));
		managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
	
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new CommandPlecareInCursa(5, new Autobuz(23)));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		
	}

}
