package test2.problema1.clase;

public class GamingSystem {
	
	private String placaDeBaza;
	private int memoriaRam;
	private int ssd;
	private Boolean areMouse;
	private Boolean areTastatura;
	private Boolean areCamera;
	private Boolean areCasti;
	private Boolean areScaunGaming;
	
	
	public GamingSystem() {
		this.placaDeBaza= "Necunoscut";
		this.memoriaRam=0;
		this.ssd=0;
		this.areMouse=false;
		this.areTastatura=false;
		this.areCamera=false;
		this.areCasti= false;
		this.areScaunGaming=false;
	}


	public void setPlacaDeBaza(String placaDeBaza) {
		this.placaDeBaza = placaDeBaza;
	}


	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}


	public void setSsd(int ssd) {
		this.ssd = ssd;
	}


	public void setAreMouse(Boolean areMouse) {
		this.areMouse = areMouse;
	}


	public void setAreTastatura(Boolean areTastatura) {
		this.areTastatura = areTastatura;
	}


	public void setAreCamera(Boolean areCamera) {
		this.areCamera = areCamera;
	}


	public void setAreCasti(Boolean areCasti) {
		this.areCasti = areCasti;
	}


	public void setAreScaunGaming(Boolean areScaunGaming) {
		this.areScaunGaming = areScaunGaming;
	}


	@Override
	public String toString() {
		return "GamingSystem [placaDeBaza=" + placaDeBaza + ", memoriaRam=" + memoriaRam + ", ssd=" + ssd
				+ ", areMouse=" + areMouse + ", areTastatura=" + areTastatura + ", areCamera=" + areCamera
				+ ", areCasti=" + areCasti + ", areScaunGaming=" + areScaunGaming + "]";
	}
	
	

}
