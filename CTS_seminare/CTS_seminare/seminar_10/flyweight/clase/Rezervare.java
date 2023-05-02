package seminar10.flyweight.clase;

public class Rezervare {
    private int id;
    private int numarMasa;
    private int numarPersoane;
    private int oraRezervata;

    public Rezervare(int id, int numarMasa, int numarPersoane, int oraRezervata) {
        this.id = id;
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervata = oraRezervata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public int getOraRezervata() {
        return oraRezervata;
    }

    public void setOraRezervata(int oraRezervata) {
        this.oraRezervata = oraRezervata;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "id=" + id +
                ", numarMasa=" + numarMasa +
                ", numarPersoane=" + numarPersoane +
                ", oraRezervata=" + oraRezervata +
                '}';
    }
}
