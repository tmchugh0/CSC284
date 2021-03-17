import java.util.ArrayList;

public class ParticipationList {

   public static void main(String[] args) {
      
      ArrayList<Student> students = new ArrayList<>();
      
      //TODO: Create a Student Object with your first and last name and add them to the students list
      students.add(new Student("Colson","Dunlap"));
      students.add(new Student("John","Doe"));
      students.add(new Student("Nadia", "Brandl");
      students.add(new Student("Safron","Haile"));
      students.add(new Student("Chris","Gouin"));
      students.add(new Student("Malvina", "Muzichuk"); 
      students.add(new Student("Jerry","Lopez Chaparro"));

      //Sort the list by last name
      students.sort((o1,o2) -> o1.getLastName().compareTo(o2.getLastName()));
      
      //print the list of students
      for(Student student: students){
         System.out.println(student);
      }
   }
}
