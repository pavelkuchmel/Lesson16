import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Phone p1 = new Phone("Nokia", 89026667771L);
        Phone p2 = new Phone("Samsung", 89026668881L);
        Phone p3 = new Phone("Xiaomi", 89025566778L, 125.5);

        p1.receiveCall();
        System.out.println(p1.getNumber());

        System.out.println();

        p2.receiveCall("Vasya");
        System.out.println(p2.getNumber());

        System.out.println();

        p3.receiveCall("Petya", 89027829438L);
        System.out.println(p3.getNumber());

        p1.sendMessage(89027829438L, 89027829438L, 89027829438L);

        Person per1 = new Person();
        Person per2 = new Person("Pavel Nikiforov", 18);*/

        /*Matrix m1 = new Matrix(3, 3);
        Matrix m2 = new Matrix(3, 3);

        Matrix m3 = new Matrix(m1.mult(3));
        m1.showArray();
        m3.showArray();*/

        ProgReader journalReader = new ProgReader();
        Reader r1 = new Reader("Павел", "Кучмель", "Викторович", 1, "Java", new BornDate(15, 02, 1993), 375257947362L);
        journalReader.addReader(r1);
        //System.out.println(journalReader.readers.get(0));
        //System.out.println(journalReader.getReader(375257947362L));
        System.out.println(journalReader.getReader("Кучмель"));
    }
}
