package checkpoint.andela.members;

import checkpoint.andela.main.Member;

public class Staff extends Member {
  private int staffNumber;
  private double netPay;
   
  // Default constructor
  public Staff() { 
    super();
    this.staffNumber = 000;
    this.netPay = 0.00;
  }
  
  // Overloaded constructor
  public Staff(String names, 
      char sex, 
      String DOB,  
      String email, 
      String phoneNo, 
      double netPay, 
      int staffNo) {
    super(names, sex, DOB, email, phoneNo);
    this.staffNumber = staffNo;
    this.netPay = netPay;
  }
  
  // Setter for Staff Number
  public void setStaffNumber(int value) {
    this.staffNumber = value;
  }
  // Getter for Staff Number
  public int getStaffNumber() {
    return staffNumber;
  }
  
  // Setter for Staff Net Pay
  public void setStaffNetpay(double amount) {
    this.netPay = amount;
  }
  // Getter for Staff Net Pay
  public double getStaffNetpay() {
    return netPay;
  }
}
  