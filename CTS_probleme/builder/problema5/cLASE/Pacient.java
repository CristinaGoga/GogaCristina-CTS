package builder.problema5.cLASE;

public class Pacient {
	
	private String nume;
	private Boolean patRabatabil;
    private Boolean micDejunInclus;
    private Boolean papuciDeCamera;
    
    
    public Pacient() {
    	this.nume="Unknown";
    	this.patRabatabil= false;
    	this.micDejunInclus=false;
    	this.papuciDeCamera=false;
    }


	public void setNume(String nume) {
		this.nume = nume;
	}


	public void setPatRabatabil(Boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}


	public void setMicDejunInclus(Boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}


	public void setPapuciDeCamera(Boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}


	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
				+ ", papuciDeCamera=" + papuciDeCamera + "]";
	}
  

}
