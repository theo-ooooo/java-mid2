package generic.test.ex1;

public class Container<T> {
    private T item;


    public void setItem(T data) {
        item = data;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty() {
        return item == null;
    }
}
