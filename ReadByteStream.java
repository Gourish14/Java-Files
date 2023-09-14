package com.cozentus.file;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteStream {
    public static void main(String[] args) {

        String filePath = "1.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            // Read bytes from the file until the end of the file is reached
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convert byte to char for text data
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

