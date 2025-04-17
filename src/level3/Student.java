package level3;

public class Student {
    private String name;
    private int age;
    private String course;
    private float grade;

    public Student(String name, int age, String course, float grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public float getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }
}

/* Crea una clase Alumno con sus atributos: Nombre, edad, curso y nota. */

