import java.util.*;

class multipleList {
  public static void main(String[] args) {
    int[] studentID = {1234567, 9876543, 1357911, 2468101, 1928374};
    String[] studentName = {"Jimmy Smith", "Maria Hernandez", "Jamal Jerkins", "Ramiz Ahmed", "Michael Green"};
    Boolean[] closeContact = {true, false, false, true, true};
    int[][] grades = {{90, 80, 95, 90, 100}, {95, 100, 100, 90, 90}, {85, 85, 95, 100, 90}, {90, 100, 75, 85, 90}, {80, 80, 65, 55, 90}};
    int[] grades1 = {90, 80, 95, 90, 100};
    student student1 = new student("1234567", "Jimmy Smith", true, new int[] {90, 80, 95, 90 ,100});
    System.out.println(student1.getAverage());
      System.out.println(student1.getName());
    if (student1.getCloseContact()) {
      System.out.println("please report to the auditorium for your take-home COVID test");
    } else {
      System.out.println("continue wearing your mask");
    }
  }
}
