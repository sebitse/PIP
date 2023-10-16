package lab2pack;

import java.lang.Exception;
import lab2pack.Student;
public class Grupa {

    private int nr_studenti;
    private Student[] lista_studenti;

    public Grupa(int nr_studenti) {
        this.nr_studenti = nr_studenti;
        this.lista_studenti = new Student[nr_studenti];
    }
    public void add(Student de_adaugat, int pozitie) {
        if (pozitie < 0 || pozitie >= nr_studenti)
            throw new ArithmeticException("Pozitie inexistenta");

        lista_studenti[pozitie] = new Student(de_adaugat);
    }
    public void print() {
        for (int index = 0; index < nr_studenti; index++) {
            if (lista_studenti[index] != null) {
                lista_studenti[index].printStudent();
            }
        }
    }
}
