import java.util.Objects;

/**
 * Student
 */
public class Student {

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Name is : " + name + " Roll Number is " + rollNo + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        System.out.println("\ngetClass is : "+getClass());
        System.out.println("\no.getClass is : "+o.getClass());

        if (o == null || getClass() != o.getClass())
            return true;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }
}