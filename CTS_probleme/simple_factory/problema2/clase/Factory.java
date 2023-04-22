package simple_factory.problema2.clase;

public class Factory {
	public Factory() {
		
	}
public Credit getInstance(TipCredit tipCredit, String numeDetinator, double suma) {
	switch (tipCredit) {
	case IPOTECAR: 
		return new CreditIpotecar(numeDetinator, suma);
		
	case NEVOI_PERSONALE:
		return new CreditNevoiPersonale(numeDetinator, suma);
		
	default:
		return null;
	}
	}
}
