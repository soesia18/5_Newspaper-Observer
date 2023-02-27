package at.kaindorf;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Newspaper-Observer<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 27. Februar 2023<br>
 * <b>Time:</b> 12:25<br>
 */

public class NewspaperTester {
    public static void main(String[] args) {
        ConcretePublisher publisher = new ConcretePublisher();

        ConcreteReader reader1 = new ConcreteReader();
        ConcreteReader reader2 = new ConcreteReader();

        publisher.register(reader1);
        publisher.register(reader2);
        publisher.notifyReaders();
        publisher.unregister(reader1);
        publisher.notifyReaders();
    }
}
