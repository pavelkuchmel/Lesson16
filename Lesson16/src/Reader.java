public class Reader {
    private String name;
    private String sourName;
    private String middleName;
    private int readerNumber;
    private String faculty;
    private BornDate bornDate;
    private long phoneNumber;

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
        return "Читатель № " + readerNumber + ':' +
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
    public void returnBook(){}

}
