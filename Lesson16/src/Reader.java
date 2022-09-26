import java.util.ArrayList;

public class Reader {
    private String name;
    private String sourName;
    private String middleName;
    private int readerNumber;
    private String faculty;
    private BornDate bornDate;
    private long phoneNumber;
    ArrayList<String> bookList = new ArrayList<String>();

    public Reader(String name, String sourName, String middleName, int readerNumber, String faculty, BornDate bornDate, long phoneNumber) {
        this.name = name;
        this.sourName = sourName;
        this.middleName = middleName;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nЧитатель № " + readerNumber + ':' +
                "\nИмя: " + name +
                "\nФамилия: " + sourName +
                "\nОтчество: " + middleName +
                "\nФакультет: " + faculty +
                "\nДата рождения: " + bornDate +
                "\nНомер телефона: " + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourName() {
        return sourName;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        faculty = faculty;
    }

    public BornDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(BornDate bornDate) {
        this.bornDate = bornDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(){}
    public void takeBook(int qnt){ System.out.println("Количество книг которые взялл" + getSourName() + ' ' + getName().charAt(0) + '.' + getMiddleName().charAt(0) + '.' + ' ' + ": " + qnt); }
    public void takeBook(String ...bookName){
        System.out.print(getSourName() + ' ' + getName().charAt(0) + '.'+ getMiddleName().charAt(0) + '.' + ' ' + " взял книги: ");
        for (int i = 0; i < bookName.length; i++) {
            if (i == bookName.length-1) System.out.println(bookName[i]+'.');
            else System.out.print(bookName[i]+", ");
        }
    }
    public void takeBook(Book ...bookType){
        System.out.print(getSourName() + ' ' + getName().charAt(0) + '.' + getMiddleName().charAt(0) + '.' + ' ' + " взял книги: ");
        for (int i = 0; i < bookType.length; i++) {
            if (i == bookType.length-1) System.out.print(bookType[i].getType()+".");
            else System.out.print(bookType[i].getType()+", ");
        }
    }
    public void returnBook(){}
    public void returnBook(int qnt){ System.out.println(getSourName() + ' ' + getName().charAt(0) + '.' + getMiddleName().charAt(0) + '.' + ' ' + "Вернул: " + qnt); }
    public void returnBook(String ...bookName){
        System.out.print(getSourName() + ' ' + ' ' + getName().charAt(0) + '.' + getMiddleName().charAt(0) + '.' + ' ' + " вернул книги: ");
        for (int i = 0; i < bookName.length; i++) {
            if (i == bookName.length-1) System.out.println(bookName[i]+'.');
            else System.out.print(bookName[i]+", ");
        }
    }
    public void returnBook(Book ...bookType){
        System.out.print(getSourName() + ' ' + getName().charAt(0) + '.' + getMiddleName().charAt(0) + '.' + ' ' + " вернул книги: ");
        for (int i = 0; i < bookType.length; i++) {
            if (i == bookType.length-1) System.out.print(bookType[i].getType()+".");
            else System.out.print(bookType[i].getType()+", ");
        }
    }

}
