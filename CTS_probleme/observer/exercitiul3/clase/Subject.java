package observer.exercitiul3.clase;

public interface Subject {
	public void adaugaMesaj(Observer observer);
	public void trimiteMesaj(String mesaj);
	public void stergeMesaj(Observer observer);

}
