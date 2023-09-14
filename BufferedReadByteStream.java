package com.cozentus.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedReadByteStream {
    public static void main(String[] args) {

        String filePath = "2.txt";

        try (FileInputStream fis = new FileInputStream(filePath);
             BufferedInputStream bis = new BufferedInputStream(fis)) {

        	int byteData;       
            // Read bytes from the file until the end of the file is reached
            while ((byteData = fis.read()) != -1) {
                System.out.print((char)byteData); // Convert byte to char for text data
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

