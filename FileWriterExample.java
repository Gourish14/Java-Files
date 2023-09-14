package com.cozentus.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        //Define the file path
        String filePath = "3.txt";

        try (FileWriter fw = new FileWriter(filePath)) {
            // Data to be written to the file
            String data = "Hello, this is my file";
            // Write the data to the file
            fw.write(data);
            System.out.println("Data written successfully");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

