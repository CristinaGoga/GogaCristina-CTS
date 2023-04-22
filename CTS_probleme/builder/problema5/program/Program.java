package builder.problema5.program;

import builder.problema5.cLASE.Pacient;
import builder.problema5.cLASE.PacientBuilder;

public class Program {
	public static void main(String[] args) {
		PacientBuilder pacientBuilder= new PacientBuilder("Cristina");
		Pacient pacinet = pacientBuilder.setMicDejunInclus(true).build();
		System.out.println(pacinet.toString());
		
	
	}

}
