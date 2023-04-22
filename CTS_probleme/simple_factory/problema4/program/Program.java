package simple_factory.problema4.program;

import java.util.ArrayList;
import java.util.List;

import simple_factory.problema4.clase.Factory;
import simple_factory.problema4.clase.Autobuz;
import simple_factory.problema4.clase.MijlocTransport;
import simple_factory.problema4.clase.TipMijlocTransport;
import simple_factory.problema4.clase.Tramvai;
import simple_factory.problema4.clase.Troleibuz;

public class Program {
	public static void main(String[] args) {
		Factory factory = new Factory();
		MijlocTransport autobuz = new Autobuz("B-123-STB", 102);
		MijlocTransport troleibuz = new Troleibuz("GL-23-STB", 17);
		MijlocTransport tramvai = new Tramvai("GL-12-STB", 40);
		
		autobuz.descriere();
		tramvai.descriere();
		troleibuz.descriere();
		System.out.println("\n");
		
		
		List<MijlocTransport> mijloaceTransport = new ArrayList<>();
		mijloaceTransport.add(troleibuz);
		mijloaceTransport.add(tramvai);
		mijloaceTransport.add(autobuz);
		mijloaceTransport.add(factory.getInstance(TipMijlocTransport.AUTOBUZ, "B-123-STB", 348));
		mijloaceTransport.add(factory.getInstance(TipMijlocTransport.TRAMVAI, "B-435-STB", 12));
		mijloaceTransport.add(factory.getInstance(TipMijlocTransport.TROLEIBUZ, "B-970-STB", 70));
		for(MijlocTransport mijlocTransport: mijloaceTransport)
		{ 
			mijlocTransport.descriere();
		}
	}

}
