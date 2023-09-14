package com.cozentus.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        //Define the file path
        String filePath = "3.txt";

        try (FileReader fr = new FileReader(filePath)) {
            int charData;
            // Read characters from the file one by one
            while ((charData = fr.read()) != -1) {
                System.out.print((char) charData);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

