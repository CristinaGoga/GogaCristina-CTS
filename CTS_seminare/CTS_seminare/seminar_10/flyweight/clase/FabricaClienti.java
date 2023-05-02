package seminar10.flyweight.clase;

public class FabricaClienti {
    private HashMap<String, IClient> clienti;

    public FabricaClienti() {
        clienti = new HashMap<String, IClient>();
    }

    public IClient getClient(String nume){
        if(clienti.get(nume) != null){
            return clienti.get(nume);
        } else{
            IClient client = new Client(nume, "NA", "NA");
            clienti.put(nume,client);
            return client;
        }
    }
}
