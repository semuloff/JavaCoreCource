package about.generic.model;


public class User extends BaseObject {
    public static int count = 0;
    private String name;
    private int age;
    private float growth;

    public User() {
        increment();
        setItems("None", 0, 0f);
    }

    public User(String name, int age, float growth) {
        increment();
        setItems(name, age, growth);
    }

    private void increment() {
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrowth(float growth) {
        this.growth = growth;
    }

    public void setItems(String name, int age, float growth) {
        setName(name);
        setAge(age);
        setGrowth(growth);
    }

    public void printItems() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nGrowth: " + growth + "\n");
    }

    @Override
    public String toString() {
        return " --- Override! --- ";
    }
}