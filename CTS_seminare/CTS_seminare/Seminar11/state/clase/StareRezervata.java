package Seminar11.state.clase;

public class StareRezervata implements State{

	@Override
	public void doAction(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera))
		{
			masa.setStare(this);
			System.out.println("Masa " + masa.getNumarRezervare()+" este rezervata!");
		}
		else {
			System.out.println("Masa nu poate fi rezervata!");
		}
	}

}
