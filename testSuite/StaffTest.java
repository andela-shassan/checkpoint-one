package testSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import checkpoint.andela.main.*;
import checkpoint.andela.members.*;

public class StaffTest {
  Staff nobest = new Staff();
  Book book1 = new Book();
  @Test
  public void testBorrowBook() { 
    book1.setNoOfCopies(5);
    assertEquals(book1.getNoOfCopies(), 5);
    nobest.borrowBook(book1);
    assertEquals(book1.getNoOfCopies(), 4); 
  }

  @Test
  public void testReturnBook() {
    book1.setNoOfCopies(4);
    nobest.returnBook(book1);
    assertEquals(book1.getNoOfCopies(), 5); 
  }
}  