abstract class Book {


  protected String name;
  protected String author;


  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }


  public abstract String getDetails();

}


class MyBook extends Book {

  public MyBook(String name, String author) {
    super(name, author); 
  }

public static void main(String args[]) {
    Book myBook = new MyBook("Harry Potter", "J.k. Rowling");
    System.out.println(myBook.getDetails());
  }

}