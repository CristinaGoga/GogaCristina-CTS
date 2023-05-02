package observer.exercitiuseminar.problema16.main;

import observer.exercitiuseminar.problema16.clase.Client;
import observer.exercitiuseminar.problema16.clase.NotificareTelefon;
import observer.exercitiuseminar.problema16.clase.Notificator;

public class Main {
	public static void main(String[] args) {
		Notificator notificatorTelefon= new NotificareTelefon();
		Notificator notificatorMail= new NotificareTelefon();
		Notificator notificatorManager= new NotificareTelefon();
		
		notificatorTelefon.setSuccesor(notificatorMail);
		notificatorMail.setSuccesor(notificatorManager);
		
//		notificatorMail.setSuccesor(notificatorTelefon);
//		notificatorTelefon.setSuccesor(notificatorManager);
		
		Client client1= new Client("Ana", "mailana@gmai", "0722");
		Client client2= new Client("Ion", "mailana@gmai", null);
		Client client3= new Client("George",null, "0722");
		Client client4= new Client("Vlad",null, null);
		
		notificatorTelefon.notificaClient(client1, "mesaj");
		notificatorTelefon.notificaClient(client2, "mesaj");
		notificatorTelefon.notificaClient(client3, "mesaj");
		notificatorTelefon.notificaClient(client4, "mesaj");
		
		
//		notificatorMail.notificaClient(client1, "mesaj");
//		notificatorMail.notificaClient(client2, "mesaj");
//		notificatorMail.notificaClient(client3, "mesaj");
//		notificatorMail.notificaClient(client4, "mesaj");
	}

}
