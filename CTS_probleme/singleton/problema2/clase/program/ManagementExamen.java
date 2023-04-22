package singleton.problema2.clase.program;

import java.util.ArrayList;
import java.util.List;

public class ManagementExamen {
	private String nume;
	private int durata;
	private float pondere;
	
	List<Student> studenti = new ArrayList();
	
	private static ManagementExamen instanta = null;
	
	private ManagementExamen(String nume, int durata, float pondere) {
		super();
		this.nume = nume;
		this.durata = durata;
		this.pondere = pondere;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public float getPondere() {
		return pondere;
	}

	public void setPondere(float pondere) {
		this.pondere = pondere;
	}
	
	public static ManagementExamen getInstance(String nume, int durata, float pondere) {
		if(instanta == null) {
			instanta = new ManagementExamen(nume, durata, pondere);
		}
		return instanta;
	}
	
//METODA CARE VERFICA DACA UN STUDENT A DAT DEJA EXAMENUL
	public boolean verificaDisponibilitateStudent(String nume,String prenume,int grupa) {
		
		for(Student student : studenti) {
			if (student.getNume().equals(nume) &&  student.getPrenume().equals(prenume) && student.getGrupa()== grupa) {
				System.out.println("Studentul " +nume +" " +prenume+ " din grupa "+ grupa + " a participat deja la examen!" );
				return false;
			}
		} 
		
		Student student = new Student(nume, prenume,grupa);
		studenti.add(student);
		System.out.println("Studentul " + nume + " " + prenume + " din grupa " + grupa + " poate participa la examen.");
		return true;
	}
	
	public void AfisareStudenti() {
		System.out.println("Lista studentilor care au participat la examenul " + nume + ":");
		for(Student student : studenti) {
			System.out.println(student.getNume()+" " + student.getPrenume() + " din grupa " + student.getGrupa());
		}

	}
}
