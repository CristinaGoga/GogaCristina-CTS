package flyweight.exercitiul1.clase;
//FactoryFlyweight

import java.util.HashMap;


public class FabricaDePachete {
	
	private HashMap<Integer, IPachetTuristic> pacheteTuristicie;

	public FabricaDePachete() {
		pacheteTuristicie= new HashMap<Integer, IPachetTuristic>();
	}
	
	public int getNumarPachete() {
		return pacheteTuristicie.size();
	}
	
	public IPachetTuristic getPachetTuristic(int codPachet) {
		IPachetTuristic pachet = pacheteTuristicie.get(codPachet);
		if(pachet==null) {
			pachet = new PachetTuristic(codPachet, "Hotel","Oras", true);
			pacheteTuristicie.put(codPachet,pachet);
		}
		return pachet;
	}

}
