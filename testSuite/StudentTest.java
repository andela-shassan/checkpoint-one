package testSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import checkpoint.andela.main.Book;
import checkpoint.andela.members.*;

public class StudentTest {
  Student nobest = new Student("John Doe", 'F', "12th May, 1996",
      "semiu_hassan@hotmail.com",  
      "08056706725",231, 12 ); 
  Book book2 = new Book();
 
  
  @Test
  public void testBorrowBoo() {
    book2.setNoOfCopies(3);
    assertEquals(book2.getNoOfCopies(), 3);
    nobest.borrowBook(book2);
    assertEquals(book2.getNoOfCopies(), 2);
  } 
   
  @Test
  public void testBorrowBookWhenNotAvailable() {
    book2.setNoOfCopies(0);
    assertEquals(book2.getNoOfCopies(), 0); 
    nobest.borrowBook(book2);
    assertEquals(book2.getNoOfCopies(), 0);
  }

  @Test
  public void testReturnBook() {
    book2.setNoOfCopies(0); 
    nobest.returnBook(book2);
    assertEquals(book2.getNoOfCopies(), 1);
  }

}
