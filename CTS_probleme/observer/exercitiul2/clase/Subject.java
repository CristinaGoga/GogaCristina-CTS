package observer.exercitiul2.clase;

public interface Subject {
	void adaugaMesaj(Observer observer);
	void stergeMesaj(Observer observer);
	void trimiteMesaj(String mesaj);

}
