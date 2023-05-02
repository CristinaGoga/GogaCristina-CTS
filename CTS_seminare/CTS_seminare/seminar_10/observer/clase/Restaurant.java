package seminar10.observer.clase;

public class Restaurant implements Subject{
    private String nume;
    private List<Observer> clientiAbonati;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clientiAbonati = new ArrayList<>();
    }

    @Override
    public void adaugareObserver(Observer observer) {
        this.clientiAbonati.add(observer);
    }

    @Override
    public void stergereObserver(Observer observer) {
        this.clientiAbonati.remove(observer);
    }

    @Override
    public void notifocaAbonati(String mesaj) {
        for(Observer clientAbonati : clientiAbonati){
            clientAbonati.receptioneazaNotificare(mesaj);
        }
    }

    public void notificareOfertaPret(){
        this.notifocaAbonati(this.nume + ": Sunt reduceri de pret la shaorma.");
    }

    public void notificaSchimbareMeniu(){
        this.notifocaAbonati(this.nume + ": Avem produse noi in categoria Fructe si Legume.");
    }
}
