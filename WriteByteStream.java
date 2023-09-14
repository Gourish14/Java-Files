package com.cozentus.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteStream {
    public static void main(String[] args) {
        String data = "Hello Everyone";

        try (FileOutputStream fos = new FileOutputStream("1.txt")) 
        {
            byte[] bytes = data.getBytes(); // Convert the string to bytes and write it to the file
            fos.write(bytes);

            System.out.println("Data written successfully");
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

