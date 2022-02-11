public class student {
private  String id;
private String name;
private boolean closeContact;
private int[] grades;

//constructor method
public student(String id, String n, boolean closeContact, int[] g) {
  this.id = id;
  this.name = n;
  this.closeContact = closeContact;
  this.grades = g;
}
//behavior methods
//get the close contact status of the student
// public boolean isCloseContact() {
//
// } // end isCloseContact methods
//
//set the value of close closeContact
public boolean getCloseContact() {
  if(this.closeContact) {
    return true;
  } else {
    return false;
  }
}
//
// //see if the student is failing
// public boolean isFailing() {
//
// }
//
//get object's name
public String getName() {
  return this.name;
}

public double getAverage() {
  int total = 0;
  for(int grade : this.grades) {
      total += grade;
    }
    return total / grades.length;
  }
}
