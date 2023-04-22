package singleton.problema1.clase.program;

public class Program {
	public static void main(String[] args) {
		Agentie primaAgentie = Agentie.getInstance("Nume", 2000, 10);
		Agentie aDouaAgentie = Agentie.getInstance("Alta agentie", 1500, 5);
	
		
		System.out.println(primaAgentie.getNume());
		System.out.println(aDouaAgentie.getNume());
		
		
		AgentieLazyI primaAgentieLazy = AgentieLazyI.getInstance("NumeLazy", 2000, 10);
		AgentieLazyI aDouaAgentieLazy = AgentieLazyI.getInstance("Alta agentie Lazy", 1500, 5);
	
		
		System.out.println(primaAgentieLazy.getNume());
		System.out.println(aDouaAgentieLazy.getNume());
	}

}
