public class Course{
   // Declare private fields
   private String number;
   private String title;

   // Define mutator methods - 
   // setCourseNumber(), setCourseTitle()
   public void setCourseNumber(String courseNumber) {
      number = courseNumber;
   }

   public void setCourseTitle(String courseTitle) {
      title = courseTitle;
   }

   // Define accessor methods - 
   // getCourseNumber(), getCourseTitle()
   public String getCourseNumber() {
      return number;
   }

   public String getCourseTitle() {
      return title;
   }

   // Define printInfo()
   public void printInfo() {
      System.out.println("Course Information:");
      System.out.println("   Course Number: " + number);
      System.out.println("   Course Title: " + title);
   }
}