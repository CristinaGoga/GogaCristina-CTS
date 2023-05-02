package test2.problema1.clase;

public class GamingSistemBuilder implements IGamingSystem {
	public GamingSystem gamingSistem;
	
	public GamingSistemBuilder (String placaDeBaza,int memoriaRam,int ssd) {
		this.gamingSistem= new GamingSystem();
		gamingSistem.setPlacaDeBaza(placaDeBaza);
		gamingSistem.setMemoriaRam(memoriaRam);
		gamingSistem.setSsd(ssd);
		//return this;
	}
	public GamingSistemBuilder setAreMouse( Boolean areMouse) {
		this.gamingSistem.setAreMouse(areMouse);
		return this;
		
	}
	public GamingSistemBuilder setAreCasti( Boolean areCasti) {
		this.gamingSistem.setAreCasti(areCasti);
		return this;
		
	}
	public GamingSistemBuilder setAreTastatura( Boolean areTastatura) {
		this.gamingSistem.setAreTastatura(areTastatura);
		return this;
		
	}
	public GamingSistemBuilder setAreCamera( Boolean areCamera) {
		this.gamingSistem.setAreCamera(areCamera);
		return this;
		
	}
	public GamingSistemBuilder setAreScaunGaming( Boolean areScaunGaming) {
		this.gamingSistem.setAreScaunGaming(areScaunGaming);
		return this;
		
	}
	
	@Override
	public void printConfiguration() {
		System.out.println(this.gamingSistem.toString());
		
	}

}
