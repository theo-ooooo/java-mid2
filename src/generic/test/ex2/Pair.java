package generic.test.ex2;

public class Pair<T, K> {
    private T first;
    private K second;


    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(K data) {
        this.second = data;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
