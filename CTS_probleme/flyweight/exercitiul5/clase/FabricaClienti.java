package flyweight.exercitiul5.clase;

import java.util.HashMap;

public class FabricaClienti {
	
	private HashMap<Integer, IClient> listaClienti;
	
	
	public FabricaClienti() {
		listaClienti = new HashMap<Integer,IClient>();
	}
	public int getNumarClienti() {
		return listaClienti.size();
	}
	
	public IClient getClient(int numarAsigurare) {
		IClient client = listaClienti.get(listaClienti);
		if(client ==null)
		{
			client = new Client("Nume", 1, 20);
			listaClienti.put(numarAsigurare, client);
		}
		return client;
	}

	@Override
	public String toString() {
		return "FabricaClienti [listaClienti=" + listaClienti + "]";
	}
	

}
