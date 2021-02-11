/**
   A simple class to represent you - a student
*/
public class Student{
   
   private String firstName;
   private String lastName;
   
   public Student(){
      firstName = "";
      lastName = "";
   }
   
   public Student(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public String getFirstName(){
      return firstName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   @Override
   public String toString()
   {
      return firstName + " " + lastName;
   }
}