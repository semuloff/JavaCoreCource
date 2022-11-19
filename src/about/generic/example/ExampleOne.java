package about.generic.example;

// class with generic.
public class ExampleOne<T> {
    private T instance;

    public void set(T object) {
        instance = object;
    }

    public T get() {
        return instance;
    }
}
