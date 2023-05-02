package seminar10.chain_of_responsability.main;

import seminar10.chain_of_responsability.clase.Notificator;
import seminar10.chain_of_responsability.clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorTelefon = new NotificareSMS();
        Notificator notificatorMail = new NotificareMail();
        Notificator notificatorManager = new NotificareManager();

        notificatorMail.setSuccesor(notificatorTelefon);
        notificatorTelefon.setSuccesor(notificatorManager);

        Client client1 = new Client("Ana", "0728276483", "mailana@gmail.com");
        Client client2 = new Client("Maria", "0728276483", null);
        Client client3 = new Client("Ion", null, "mailion@gmail.com");
        Client client4 = new Client("Andrei", null, null);

        notificatorMail.notificaClient("Aceasta este o notificare",client1);
        notificatorMail.notificaClient("Aceasta este o notificare",client2);
        notificatorMail.notificaClient("Aceasta este o notificare",client3);
        notificatorMail.notificaClient("Aceasta este o notificare",client4);
    }
}