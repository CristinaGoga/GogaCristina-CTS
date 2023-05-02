package seminar10.observer.clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println(this.nume + " ai primit un mesaj promotional: " + mesaj);
    }
}
