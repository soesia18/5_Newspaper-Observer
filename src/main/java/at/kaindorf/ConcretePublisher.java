package at.kaindorf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Newspaper-Observer<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 27. Februar 2023<br>
 * <b>Time:</b> 12:21<br>
 */

public class ConcretePublisher implements Publisher {
    private Set<Reader> readers = new HashSet<>();

    public ConcretePublisher() {
    }
    @Override
    public void register(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void unregister(Reader reader) {
        readers.remove(reader);
    }

    @Override
    public void notifyReaders() {
        readers.forEach(reader -> reader.update("news"));
    }
}
