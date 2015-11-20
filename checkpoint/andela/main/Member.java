package checkpoint.andela.main;

import java.util.Date;

import checkpoint.andela.members.BorrowOrder;

public class Member {
  private String fullName;
  private char sex;
  private String dateOfBirth;
  private String email;  
  private String phoneNumber;
  private Date registrationDate;
  
  public Member(){
    this.fullName = "Full Name";
    this.sex = 'G';
    this.dateOfBirth = "01/January/1900"; 
    this.email = "something@example.com";
    this.phoneNumber = "08012345678";
    this.registrationDate = new Date();
  }
  public Member(String names,
      char sex, 
      String DOB,
      String email,
      String phoneNo){ 
    this.fullName = names;
    this.sex = sex;
    this.dateOfBirth = DOB;
    this.email = email;
    this.phoneNumber = phoneNo;
    this.registrationDate = new Date();
  }
  
  // Setters for name
  public void setName(String name){
    this.fullName = name;
  }
  
  // Getters for name
  public String getName(){
    return fullName;
  }
  
  // Setters for Gender
  public void setSex(char gender){
    this.sex = gender;
  }
    
  // Getters for Gender
  public char getSex(){
    return sex;
  }
    
  // Setters for Date of Birth
  public void setDateOfBirth(String date){
    this.dateOfBirth = date;
  }
    
  // Getters for  Date of Birth
  public String getDateOfBirth(){ 
    return dateOfBirth;
  }
    
  // Setters for email
  public void setEmail(String mail){
    this.email = mail;
  }
        
  // Getters for  email
  public String getEmail(){   
    return email;
  }
  
  // Setter for Phone Number
  public void setPhoneNumber(String phone){
    this.phoneNumber = phone;
  }
  
  // Getter for Phone number
  public String getPhoneNumber(){
    return phoneNumber;
  }
  
  // Setter for Date Of Registration
  public Date setRegistrationDate(Date customDate){
    this.registrationDate = customDate;
    return registrationDate;
  }
    
  // Getter for Date Of Registration
  public Date getRegistrationDate(){
    return registrationDate;
  }
  
  // Get Current date
  public Date getCurrentDate() {
    return new Date();
  }
   
  // Borrow Book
  public String borrowBook(Book book) {
    if (book.getNoOfCopies() > 0) {
      BorrowOrder.addToBorrowQueue(this);
      book.decrementBook();
      return "Enjoy the book";
    }else {
      return "Sorry the book you requested is not available now";
    }
  }
  
  //Return Book
  public String returnBook(Book book) {
    BorrowOrder.addToReturningQueue(this);
    book.incrementBook();
    return "Thank You";
  }
}
