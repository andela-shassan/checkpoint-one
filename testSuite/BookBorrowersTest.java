package testSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import checkpoint.andela.main.Book;
import checkpoint.andela.members.*;

public class BookBorrowersTest {
  Staff staff1 = new Staff("Hassan Semiu", 'M', "10/06/1986",
      "hassan.ayomon@andela.com", "08036294879", 71.500, 123453); 
  {
    try {
      Thread.sleep(1000);                 
    }catch(InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  } 
  
  Staff staff2 = new Staff("Opeyemi Hassan",'M',"10th June, 1986",
      "semiu_hassan@ymail.com", "08056706725", 91.500, 45663); 

  Student student1 = new Student("John Doe", 'F', "12th May, 1996",
      "semiu_hassan@hotmail.com", "08056706725",231, 12 ); 
  {
    try { 
        Thread.sleep(1000);                 
      }catch(InterruptedException e) {
        Thread.currentThread().interrupt();
      } 
  }
  
  Student student2 = new Student("Andela Guru", 'M', "10th May, 2010",
      "andela.guru@andela.com", "08085435202",2324, 01);
  
  Book book1 = new Book("God are not to blame","Chinua Achebe", 5, "ISBN:08798-48"); 
     
  @Test  
  public void testAddToBorrowQueue() {      
    student2.borrowBook(book1); 
    student1.borrowBook(book1);   
    staff2.borrowBook(book1);  
    staff1.borrowBook(book1);  
    assertEquals(BorrowOrder.borrowingQueue.peek().getName(), "Hassan Semiu"); 
    assertEquals(staff1.getRegistrationDate().before(staff2.getRegistrationDate()), true);
  }  
   
  @Test   
  public void testAddToBorrowQueue2() {       
    student2.borrowBook(book1); 
    student1.borrowBook(book1);  
    assertEquals(BorrowOrder.borrowingQueue.peek().getName(), "John Doe");  
    assertEquals(student1.getRegistrationDate().before(student2.getRegistrationDate()), true);
  }
  
  @Test   
  public void testAddToBorrowQueue3() {      
    staff1.borrowBook(book1);  
    staff2.borrowBook(book1);   
    assertEquals(BorrowOrder.borrowingQueue.peek().getName(), "Hassan Semiu"); 
    assertEquals(staff1.getRegistrationDate().before(staff2.getRegistrationDate()), true);
  }
     
  @Test     
  public void testAddToReturningQueue() {      
    student1.returnBook(book1);  
    staff1.returnBook(book1); 
    assertEquals(BorrowOrder.returningQueue.peek().getName(), "Hassan Semiu");   
  } 
} 
