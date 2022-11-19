package about.generic.model;

public class User extends BaseObject {
    private String name;
    private int age;

    public User() {
        setItems("None", 0);
    }

    public User(String name, int age, float growth) {
        setItems(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setItems(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void printItems() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\n");
    }

    @Override
    public String toString() {
        return " --- Override! --- ";
    }
}