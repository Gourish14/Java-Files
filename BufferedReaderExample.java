package com.cozentus.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
public static void main(String[] args) throws IOException {
		
		//Reading the data from the text file
		try(BufferedReader reader = new BufferedReader(new FileReader("4.txt"));) 
		{
			String document;
			while((document = reader.readLine())!=null) {
				System.out.println(document);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
