package observer.exercitiul1.clase;

public interface Subject {
	void adaugareObserver(Observer observer);
	void stergereObserver(Observer observer);
	void trimiteNotificare(String mesaj);
	

}
