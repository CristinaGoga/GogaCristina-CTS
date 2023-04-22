package builder.problema4.clase;

public class ContBancar  {
	private String numeDetinator;
	private Boolean primesteSalariul;
	private Boolean cardAtasat;
	private Boolean internetBanking;
	
	public ContBancar() {
		this.numeDetinator="Anonim";
		this.primesteSalariul=false;
		this.cardAtasat= false;
		this.internetBanking=false;
	}

	public void setNumeDetinator(String numeDetinator) {
		this.numeDetinator = numeDetinator;
	}

	public void setPrimesteSalariul(Boolean primesteSalariul) {
		this.primesteSalariul = primesteSalariul;
	}

	public void setCardAtasat(Boolean cardAtasat) {
		this.cardAtasat = cardAtasat;
	}

	public void setInternetBanking(Boolean internetBanking) {
		this.internetBanking = internetBanking;
	}

	@Override
	public String toString() {
		return  numeDetinator + " detine un cont bancar cu urmatoarele specificatii  : primesteSalariul= " + primesteSalariul + ", cardAtasat= "
				+ cardAtasat + ", internetBanking= " + internetBanking;
	}
	
	

}
