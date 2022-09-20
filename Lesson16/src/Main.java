public class Main {

    public static void main(String[] args) {

        Phone p1 = new Phone("Nokia", 89026667771L);
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

        Person per1 = new Person();
        Person per2 = new Person("Pavel Nikiforov", 18);


    }
}
