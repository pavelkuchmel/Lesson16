public class Book {
    private String nameBook;
    private String author;
    private String type;

    public Book(){}
    public Book(String nameBook, String author, String type){
        this.nameBook = nameBook;
        this.author = author;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getNameBook() {return nameBook;}

    public void setNameBook(String nameBook) {this.nameBook = nameBook;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}
}
