package seminar10.chain_of_responsability.clase;

public abstract class Notificator {
    private Notificator succesor = null;


    public Notificator getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    public abstract void notificaClient(String mesaj, Client client);
}
