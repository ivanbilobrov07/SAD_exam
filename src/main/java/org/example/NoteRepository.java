package org.example;

import java.util.ArrayList;
import java.util.List;

public class NoteRepository {
    private List<Note> notes;

    public List<Note> getNotes() {
        return notes;
    }

    public NoteRepository() {
        notes = new ArrayList<>();

        notes.add(new Note("First note", "Some content"));
        notes.add(new Note("Second note", "Some content"));
    }

    public Note addNote(Note note) {
        notes.add(note);
        return note;
    }
}
