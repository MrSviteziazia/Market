import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Market<T> implements QueueBehaviour<T>, MarketBehaviour<T> {
    private List<T> queue;

    public Market() {
        queue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(T item) {
        queue.add(item);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.get(0);
    }
    @Override
    public void acceptOrder(T order) {
        enqueue(order);
    }

    @Override
    public T deliverOrder() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return dequeue();
    }
    public void update() {
    }
}