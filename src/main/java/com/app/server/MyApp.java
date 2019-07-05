package com.app.server;

public class MyApp {

    private final long id;
    private final String content;

    public MyApp(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}