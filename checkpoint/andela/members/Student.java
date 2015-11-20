package checkpoint.andela.members;

import checkpoint.andela.main.Member;

public class Student extends Member {
  private int studentNumber;
  private int studentClass;
  
  // Default constructor
  public Student() {
    super();
    this.studentNumber = 0000;
    this.studentClass = 00; 
  }
  
  // Overloaded constructor
  public Student(String names, 
      char sex, 
      String DOB,  
      String email, 
      String phoneNo,
      int studentNo, 
      int stdClass) {
    super(names, sex, DOB, email, phoneNo);
    this.studentNumber = studentNo;
    this.studentClass = stdClass;
  }
  
  // Setter for Student Number
  public void studentNumber(int value) { 
    this.studentNumber = value;
  }
  // Getter for Student Number
  public int getStudentNumber() {
    return studentNumber;
  }
  
  // Setter for Student Class
  public void setStudentClass(int theClass) {
    this.studentClass = theClass;
  }
  // Getter for Student Class
  public double gerStaffNetpay() {
    return studentClass;
  }
} 