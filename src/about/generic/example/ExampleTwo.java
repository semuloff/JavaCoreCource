package about.generic.example;

public class ExampleTwo<T> {
    private T instance;

    private ExampleTwo() {
    }

    public static <T> ExampleTwo<T> init(T instantiator) {
        return new ExampleTwo<T>();
    }

    public void set(T obj) {
        instance = obj;
    }

    public T get() {
        return instance;
    }
}
