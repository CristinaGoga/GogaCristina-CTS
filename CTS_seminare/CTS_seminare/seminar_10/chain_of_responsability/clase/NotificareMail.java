package seminar10.chain_of_responsability.clase;

public class NotificareMail extends Notificator{

    @Override
    public void notificaClient(String mesaj, Client client) {
        if(client.getAdresaEmail() != null){
            System.out.println("Clientul " + client.getNume() + " primeste MAIL cu mesajul '" + mesaj + "'");
        }else{
            if(super.getSuccesor() != null){
                super.getSuccesor().notificaClient(mesaj, client);
            }else{
                System.out.println("Clientul " + client.getNume() + " nu poate fi notificat.");
            }
        }
    }
}
}
