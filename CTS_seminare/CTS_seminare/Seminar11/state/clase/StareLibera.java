package Seminar11.state.clase;

public class StareLibera implements State {

	@Override
	public void doAction(Masa masa) {
	if (!(masa.getStare() instanceof StareLibera))
	{
		masa.setStare(this);
		System.out.println("Masa " + masa.getNumarRezervare()+" este eliberata!");
	}
	else {
		System.out.println("Masa este deja libera");
	}
	
	}
}
