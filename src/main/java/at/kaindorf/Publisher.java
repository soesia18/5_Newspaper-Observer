package at.kaindorf;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Newspaper-Observer<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 27. Februar 2023<br>
 * <b>Time:</b> 12:19<br>
 */

public interface Publisher {
    void register(Reader reader);
    void unregister(Reader reader);
    void notifyReaders();
}
