package lab2pack;

import lab2pack.*;
public class TestPrb3 {

    static final int nr_studenti = 13;

    public static void main(String[] args) {
        Grupa AC = new Grupa(nr_studenti);

        Student std1 = new Student(8900, "Alin", 1);
        Student std2 = new Student(7860, "Adam", 2);
        Student std3 = new Student(4500, "Avram", 4);

        AC.add(std1, 2);
        AC.add(std2, 4);
        AC.add(std3,8);

        AC.print();
    }

}
