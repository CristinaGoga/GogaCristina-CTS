package seminar10.chain_of_responsability.clase;

public class NotificareManager extends Notificator{
    @Override
    public void notificaClient(String mesaj, Client client) {
        System.out.println("Pentru clientul " + client.getNume() + " nu avem date de contact.");
    }
}
