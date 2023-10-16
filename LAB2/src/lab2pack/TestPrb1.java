package lab2pack;

import lab2pack.Student;

@SuppressWarnings("unused")

public class TestPrb1 {

    //static boolean testIncredere;
    //static double testValoare;

    public static void main(String[] args) {
        //Student std1 = new Student("Alin", 2);
        //Student std2 = new Student(1604, "Avram");
        Student std3 = new Student(1709, "Marcel", 4);
        Student std4 = new Student(std3);

        std4.printStudent();

//		if (testIncredere == true) {
//			System.out.println("Corect " + testValoare);
//		} else {
//			System.out.println("Incorect" + testValoare);
//		}



    }

}