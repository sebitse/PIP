package lab2pack;

public class Student {

    private long nrMatricol;
    private String numeStudent;
    private int anStudiu;

    // Ctor AREA
    public Student(String nume, int an) {
        this.anStudiu = an;
        this.numeStudent = nume;
    }

    public Student(long nrMat, String nume) {
        this.numeStudent = nume;
        this.nrMatricol = nrMat;
    }

    public Student(long nrMat, String nume, int an) {
        this.nrMatricol = nrMat;
        this.numeStudent = nume;
        this.anStudiu = an;
    }

    public Student(Student model) {
        this(model.nrMatricol, model.numeStudent, model.anStudiu);
    }

    public Student(String nume, float an) {
        this.numeStudent = nume;
        this.anStudiu = (int)an;

        //this(nume, (int)an);
    }

    // Methods
    public void printStudent() {
        System.out.println("Studentul: " + this.numeStudent);
        System.out.println("Numar matricol: " + this.nrMatricol);
        System.out.println("An de studiu: " + this.anStudiu + "\n");

        if(isValidStudent(this)) {
            System.out.println("Student valid");
        }
        else {
            System.out.println("Student invalid :(");
        }
    }

    public static boolean isValidStudent(Student model) {
        return model.numeStudent != null && model.nrMatricol != 0 && model.anStudiu != 0;
    }
}