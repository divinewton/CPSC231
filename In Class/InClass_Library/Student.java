public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Double GPA;

    //Constructor
    Student(String first, String last, Double gradeAverage) {
        this.firstName = first;
        this.lastName = last;
        this.GPA = gradeAverage;
    }

    //Compare students by GPA first, then last name, then first
    public int compareTo(Student otherStudent) {
        if (GPA > otherStudent.GPA) {
            return -1;
        }
        else if (GPA < otherStudent.GPA) {
            return 1;
        }
        // if equal GPA, sort in order of last name, then first name
        else if (lastName.compareTo(otherStudent.lastName) != 0) {
            return lastName.compareTo(otherStudent.lastName);
        }
        else {
            return firstName.compareTo(otherStudent.firstName);
        }
    }

    public String toString() {
        return GPA + " " + lastName + ", " + firstName;
    }
}
