public class Course implements Comparable<Course> {
    private String department;
    private Integer number;

    //Constructor
    Course(String dept, Integer num) {
        this.department = dept;
        this.number = num;
    }

    //Compare courses by department first, then number
    public int compareTo(Course otherCourse) {
        if (department.compareTo(otherCourse.department) != 0) {
            return department.compareTo(otherCourse.department);
        }
        else {
            return number.compareTo(otherCourse.number);
        }
    }

    public String toString() {
        return department + " " + number;
    }
}
