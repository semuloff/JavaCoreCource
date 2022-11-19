package about.generic.example;

public class ExampleTwo<T> {
    private T instance;

    private ExampleTwo() {
    }

    // generic method.
    public static <T> ExampleTwo<T> init(T instantiator) {
        return new ExampleTwo<T>();
    }

    public void set(T object) {
        instance = object;
    }

    public T get() {
        return instance;
    }

    @Override
    public String toString() {
        return "This is ExampleTwo :)";
    }
}
