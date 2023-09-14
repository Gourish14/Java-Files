package com.cozentus.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedWriteByteStream {
    public static void main(String[] args) {
        
    	String dataToWrite = "Hello to Everyone";

        String fileName = "2.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName); 
        		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);) {
            
            //Write data to the BufferedOutputStream
            byte[] dataBytes = dataToWrite.getBytes(); // Convert the string to bytes
            bufferedOutputStream.write(dataBytes);

            System.out.println("Data has been written to " +fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
