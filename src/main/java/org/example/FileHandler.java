package org.example;

import java.io.*;
import java.util.Date;

public class FileHandler {

    public void save(String fileName, Note note) {
        try(FileWriter fw = new FileWriter(fileName, true)){
//            Path path = Path.of(fileName);
//            if(Files.notExists(path)){
//                Files.createFile(path);
//            }

            Date date = new Date();
            StringBuilder  noteForWriting = new StringBuilder();
            noteForWriting.append(date.getDate());
            noteForWriting.append(".");
            noteForWriting.append(date.getMonth()+1);
            noteForWriting.append(".");
            noteForWriting.append(1900 + date.getYear());
            noteForWriting.append(" -> ");
            noteForWriting.append(note.getNoteBody());
            noteForWriting.append("\n");
            fw.append(noteForWriting.toString());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
