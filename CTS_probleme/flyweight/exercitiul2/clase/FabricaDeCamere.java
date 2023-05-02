package flyweight.exercitiul2.clase;

import java.util.HashMap;

public class FabricaDeCamere {
	private HashMap<Integer, ICamera> listaCamere;
	
	public FabricaDeCamere() {
		listaCamere= new HashMap<Integer,ICamera>();
	}
	public ICamera getCamera(int codAranjare) {
		if(listaCamere.containsKey(codAranjare)) {
			return listaCamere.get(codAranjare);
		}else {
			ICamera camera =new Camera(codAranjare, 2, 2, 3, 4);
			listaCamere.put(codAranjare, camera);
			return camera;
		}
		
	}

}
