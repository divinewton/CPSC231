public class OfferedCourse extends Course {
   // Declare private fields
   private String instructor;
   private String location;
   private String time;

   // Define mutator methods -
   // setInstructorName(), setLocation(), setClassTime()
   public void setInstructorName(String instructorName) {
      instructor = instructorName;
   }

   public void setLocation(String classLocation) {
      location = classLocation;
   }

   public void setClassTime(String classTime) {
      time = classTime;
   }

   // Define accessor methods -
   // getInstructorName(), getLocation(), getClassTime()
   public String getInstructorName() {
      return instructor;
   }

   public String getLocation() {
      return location;
   }

   public String getClassTime() {
      return time;
   }
}