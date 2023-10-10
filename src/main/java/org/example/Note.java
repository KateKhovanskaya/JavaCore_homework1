package org.example;

import java.io.Serializable;
import java.util.Date;

public class Note {
    private String noteBody;

    public Note(String noteBody){
        this.noteBody = noteBody;
    }

    public String getNoteBody() {
        return this.noteBody;
    }
}
