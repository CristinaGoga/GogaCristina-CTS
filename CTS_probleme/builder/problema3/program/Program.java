package builder.problema3.program;

import builder.problema3.clase.AutobuzLinie;
import builder.problema3.clase.BuilderAutobuzLinie;

public class Program {
	public static void main(String[] args) {
		BuilderAutobuzLinie builderAutobuzLinie=new BuilderAutobuzLinie("Mercedes 2022");
		AutobuzLinie autobuz=AutobuzLinie.getInstanta("BMW", "Cristina", true, true, true);
		AutobuzLinie autobuz2=builderAutobuzLinie.setNumeSofer("Gigel").setAreOprireLaCapatulLiniei(true).build();
		
		System.out.println(autobuz.toString());
		System.out.println(autobuz2.toString());
		
		AutobuzLinie autobuzNou= new BuilderAutobuzLinie("Opel 2010").setNumeSofer("Marcel").setTextulAfisatDerulator(true).setDeschideUsile(true).build();
		System.out.println(autobuzNou.toString());
	}

}
