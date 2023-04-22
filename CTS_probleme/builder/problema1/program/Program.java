package builder.problema1.program;

import builder.problema1.clase.Client;
import builder.problema1.clase.ClientBuilder;

public class Program {
	public static void main(String[] args) {
		ClientBuilder clientBuilder = new ClientBuilder("Cristina");
		Client client = clientBuilder.setLocLaGeam(true).setMasaDecorata(true).build();
		System.out.println(client.toString());
		
		
		Client clientNou =new ClientBuilder("Ana").setLocLaGeam(true).build();		
		System.out.println(clientNou.toString());
		
		
		 
	}

}
