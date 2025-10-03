package dev.naimsulejmani.pts;

import java.util.concurrent.atomic.AtomicInteger;

public class Todos {
    private static final AtomicInteger id = new AtomicInteger(0);

    public static Todo todo(String title) {
        return new Todo(id.incrementAndGet(), title);
    }
}
