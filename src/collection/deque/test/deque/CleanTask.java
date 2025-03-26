package collection.deque.test.deque;

public class CleanTask implements Task {
    @Override
    public void execute() {
        System.out.println("사용 하지 않는 자원 정리...");
    }
}
