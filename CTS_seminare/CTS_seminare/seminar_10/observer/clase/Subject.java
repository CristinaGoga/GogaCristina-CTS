package seminar10.observer.clase;

public interface Subject {

    void adaugareObserver(Observer observer);

    void stergereObserver(Observer observer);

    void notifocaAbonati(String mesaj);
}