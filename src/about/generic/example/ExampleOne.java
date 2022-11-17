package about.generic.example;

public class ExampleOne<T> {
    private T instance;

    public void set(T obj) {
        instance = obj;
    }

    public T get() {
        return instance;
    }
}
