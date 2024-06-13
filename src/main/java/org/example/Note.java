package org.example;

import java.util.UUID;

public class Note {
    private String id;
    private String title;
    private String content;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.id = UUID.randomUUID().toString();
    }
}
