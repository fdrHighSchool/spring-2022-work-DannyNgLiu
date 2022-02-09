import java.util.*;

class multipleList {
  public static void main(String[] args) {
    int[] studentID = {1234567, 9876543, 1357911, 2468101, 1928374};
    String[] studentName = {"Jimmy Smith", "Maria Hernandez", "Jamal Jerkins", "Ramiz Ahmed", "Michael Green"};
    Boolean[] closeContact = {true, false, false, true, true};
    int[][] grades = {{90, 80, 95, 90, 100}, {95, 100, 100, 90, 90}, {85, 85, 95, 100, 90}, {90, 100, 75, 85, 90}, {80, 80, 65, 55, 90}};
    // System.out.println(Arrays.toString(studentID));
    // System.out.println(Arrays.toString(studentName));
    // System.out.println(Arrays.toString(closeContact));
    // System.out.println(Arrays.deepToString(grades));

    int counter = 0;
    int counter2 = 0;
    for(int i=0; i<closeContact.length; i++) {
      if(closeContact[i]) {
        counter++;
      }
    }
    String[] closeContactStudents = new String[counter];
    for(int q=0; q<closeContact.length; q++) {
      if(closeContact[q]) {
        closeContactStudents[counter2] = studentName[q];
        counter2++;
      }
    }
    System.out.println(Arrays.toString(closeContactStudents));
  }
}
