package builder.problema4.program;

import builder.problema4.clase.BuilderContBancar;
import builder.problema4.clase.ContBancar;

public class Program {
	public static void main(String[] args) {
		BuilderContBancar builderContBancar= new BuilderContBancar("Goga Cristina");
		ContBancar contBancar= builderContBancar.setCardAtasat(true).setInternetBanking(true).build();
		System.out.println(contBancar.toString());
		
		ContBancar contBancar2= new BuilderContBancar("Virgolici Cosmin").setPrimesteSalariul(true).setInternetBanking(true).build();
		System.out.println(contBancar2.toString());
	}

}
