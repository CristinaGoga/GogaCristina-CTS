package flyweight.exercitiul2.main;

import flyweight.exercitiul2.clase.Camera;
import flyweight.exercitiul2.clase.FabricaDeCamere;
import flyweight.exercitiul2.clase.Rezervare;

public class Program {
	public static void main(String[] args) {
		FabricaDeCamere fabricaCamere = new FabricaDeCamere();
		
		Rezervare rezervare1 = new Rezervare(1," Goga Cristina");
		Rezervare rezervare2 = new Rezervare(2, "Gidoiu George");
		Rezervare rezervare3 = new Rezervare(3, "Galbinasu Ana");
		Rezervare rezervare4 = new Rezervare(4, "Glevan Ioana");
		
		Camera camera1= (Camera) fabricaCamere.getCamera(2);
		camera1.descriereCamera(rezervare4);
		fabricaCamere.getCamera(1).descriereCamera(rezervare3);
		
		System.out.println(fabricaCamere.toString());
	}

}
