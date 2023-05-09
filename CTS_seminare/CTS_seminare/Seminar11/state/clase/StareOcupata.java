package Seminar11.state.clase;

public class StareOcupata implements State{

	@Override
	public void doAction(Masa masa) {
		if(!(masa.getStare() instanceof StareRezervata))
		{
			masa.setStare(this);
			System.out.println("Masa "+ masa.getNumarRezervare()+" este ocupata in acest moment!");
		}
		else {
			System.out.println("Masa este deja rezervata!");
		}
		
	}

}
