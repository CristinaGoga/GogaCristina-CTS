package builder.problema4.clase;

public class BuilderContBancar implements Builder {
	private ContBancar contBancar;
	
	public BuilderContBancar(String numeDetinator) {
		this.contBancar= new ContBancar();
		this.contBancar.setNumeDetinator(numeDetinator);
	}
	@Override
	public ContBancar build() {
		return this.contBancar;
	}
	
	public BuilderContBancar setNumeDetinator(String numeDetinator) {
		this.contBancar.setNumeDetinator(numeDetinator);
		return this;
	}
	
	public BuilderContBancar setPrimesteSalariul(Boolean primesteSalariul) {
		this.contBancar.setPrimesteSalariul(primesteSalariul);
		return this;
	}
	
	public BuilderContBancar setCardAtasat(Boolean cardAtasat) {
		this.contBancar.setCardAtasat(cardAtasat);
		return this;
	}
	
	public BuilderContBancar setInternetBanking(Boolean internetBanking) {
		this.contBancar.setInternetBanking(internetBanking);
		return this;
	}
	

}
