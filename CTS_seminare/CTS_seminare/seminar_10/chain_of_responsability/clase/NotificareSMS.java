package seminar10.chain_of_responsability.clase;

public class NotificareSMS extends Notificator{

    @Override
    public void notificaClient(String mesaj, Client client) {
        if(client.getNrTelefon() != null){
            System.out.println("Clientul " + client.getNume() + " primeste SMS cu mesajul '" + mesaj + "'");
        }else{
            if(super.getSuccesor() != null){
                super.getSuccesor().notificaClient(mesaj, client);
            }else{
                System.out.println("Clientul " + client.getNume() + " nu poate fi notificat.");
            }

        }
    }
}
