package observer.exercitiuseminar.clase;

public interface Subject {
	void adugareObserver(Observer observer);
	void stergereObserver(Observer observer);
	void notificareAbonati(String mesaj);

}
