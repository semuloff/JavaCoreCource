package about.oop.principe;

public class Main {
    public static void main(String[] args) {
        System.out.println(Person.count + "\n");
        Person Racer = new Person();
        System.out.println(Person.count + "\n");
        Person Manager = new Person("Joel", 32, 176.4f);
        System.out.println(Person.count + "\n");

        Racer.printItems();
        Racer.setItems("Martin", 6, 144.f);
        Racer.printItems();

        Manager.printItems();
    }
}
