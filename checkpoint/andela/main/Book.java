package checkpoint.andela.main;

public class Book {
  private String bookTitle;
  private String bookAuthor;
  private  int noOfCopies;
  private String isbnNumber;
  
  public Book(){
    this.bookTitle = "Book Name";
    this.bookAuthor = "Unknown Author";
    this.noOfCopies = 0;
    this.isbnNumber = "ISBN-1234-687-01";
  }
  
  public Book(String bookName,
      String bAuthor,
      int bCopies,
      String bIsbnNumber) {  
    this.bookTitle = bookName;
    this.bookAuthor = bAuthor;
    this.noOfCopies = bCopies;
    this.isbnNumber = bIsbnNumber;
  }
  
  // Setters for Book Title
  public void setTitle(String title) {
    this.bookTitle = title;
  }

  // Getters for Book Title
  public String getTitle(){
    return bookTitle;
  }
  
  // Setters for Book Author
  public void setAuthor(String author){
    this.bookAuthor = author;
  }

  // Getters for Book Author
  public String getAuthor(){
    return bookAuthor;
  }
  
  // Setters for Copies
  public  void setNoOfCopies(int copies) {
      this.noOfCopies = copies;
    }

  // Getters for Copies
  public int getNoOfCopies() {
    return noOfCopies; 
  }
  
  // Setters for ISBN Number
  public void setIsbnNumber(String isbnNo){
    this.isbnNumber = isbnNo;
  }

  // Getters for ISBN Number
  public String getIsbnNumber(){
    return isbnNumber;
  }
  // Decrease the number of book when member borrow book.
  public void decrementBook(){
    --noOfCopies;
  }
  
  // Increase number of book when they return book.
  public void incrementBook(){
    ++noOfCopies;
  }
}
