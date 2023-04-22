package singleton.problema2.clase.program;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Obtinem instanta Singleton a clasei ManagementExamen
        ManagementExamen examen = ManagementExamen.getInstance("CTS", 120, 0.7f);

        // Adaugam studenti la lista de studenti a examenului
        Student s1 = new Student("Popescu", "Ion", 123);
        examen.verificaDisponibilitateStudent("Popescu", "Ion", 123);
        Student s2 = new Student("Ionescu", "Maria", 124);
        examen.verificaDisponibilitateStudent("Ionescu", "Maria", 124);
        //afisarea mesajul ca studentul ionescu maria a participat la examen.
        examen.verificaDisponibilitateStudent("Ionescu", "Maria", 124);
        //afisare lista finala, cu studentul "ionescu maria o singura data.
        System.out.println();
        // Afisam lista de studenti a examenului
       examen.AfisareStudenti();
        

       
    }
}