package strategy.exercitiul3.main;

import strategy.exercitiul3.clase.Client;
import strategy.exercitiul3.clase.VericiareAmerican;
import strategy.exercitiul3.clase.VerificareNonUE;
import strategy.exercitiul3.clase.VerificareUE;

public class Main {
public static void main(String[] args) {
	Client clientUE = new Client("Cosmin", new VerificareUE());
	Client clientNonUE= new Client("Gigel", new VerificareNonUE());
	Client clientAmerican= new Client("Jhon", new VericiareAmerican());
    clientNonUE.verifica();
	clientUE.verifica();
	clientAmerican.verifica();
	
	clientUE.setModVerificare(new VericiareAmerican());
	clientUE.verifica();
}

}
