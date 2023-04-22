package builder.problema5.cLASE;

public class PacientBuilder implements Builder {
	
	private Pacient pacient;
	
	
	public PacientBuilder(String nume) {
		 this.pacient  = new Pacient();
		 this.pacient.setNume(nume);
	}
	public PacientBuilder setNume(String nume) {
		pacient.setNume(nume);
		return this;
	}
	 public PacientBuilder setPatRabatabil(boolean patRabatabil) {
	        this.pacient.setPatRabatabil(patRabatabil);
	        return this;
	    }

	    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
	        this.pacient.setMicDejunInclus(micDejunInclus);
	        return this;
	    }

	    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
	        this.pacient.setPapuciDeCamera(papuciDeCamera);
	        return this;
	    }
	
	@Override
	public Pacient build() {
		return this.pacient;
	}

}
