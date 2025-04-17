package level3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Juan",12, "PHP",8));
        students.add(new Student("Ana",13, "JAVA",9));
        students.add(new Student("Craig",14, "PHP",4));
        students.add(new Student("David",15, "JAVA SCRIPT",6));
        students.add(new Student("Eric",16, "JAVA",7));
        students.add(new Student("Frank",17, "JAVA SCRIPT",5));
        students.add(new Student("Greg",18, "PHP",9));
        students.add(new Student("Harry",19, "FULLSTACK",4));
        students.add(new Student("Ian",20, "JAVA",10));
        students.add(new Student("Jose",21, "JAVA SCRIPT",6));

        students.stream().forEach(student -> System.out.println(student.getName() + " - " + student.getAge()));

        System.out.println("-----------------------");
        List<Student> filteredStudents = new ArrayList<>();

        students.stream()
                .filter(student -> student.getName().charAt(0) == 'A')
                .forEach(filteredStudents::add);

        filteredStudents.forEach(student ->
                System.out.println(student.getName() + " - " + student.getAge()));

        System.out.println("-----------------------");
        students.stream().filter(student->student.getGrade()>=5).forEach(student ->
                System.out.println(student.getName() + " - " + student.getAge()));


        System.out.println("-----------------------");
        students.stream().filter(student->student.getGrade()>=5 && student.getCourse()!="PHP")
                .forEach(student -> System.out.println(student.getName() + " - " + student.getAge()));

        System.out.println("-----------------------");
        students.stream().filter(student->student.getAge()>=18 && student.getCourse()=="JAVA")
                .forEach(student -> System.out.println(student.getName() + " - " + student.getAge()));




    }
}
