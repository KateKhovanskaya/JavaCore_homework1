package org.example;
import org.example.*;

public class Main {
    public static void main(String[] args) {
//        org.example.Note note1 = new org.example.Note("note 1");
        org.example.Note note1 = new org.example.Note("note 1");

        String fileName = "D:\\GeekBrains\\ООП\\Проект генеалогическое дерево\\JavaCore_Homework1\\notes.txt";
        FileHandler fileHandler = new FileHandler();
        fileHandler.save(fileName, note1);
    }
}