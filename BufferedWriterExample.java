package com.cozentus.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	
	public static void main(String [] args) throws IOException{
		
		//Java Program to write in a file
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("4.txt"));){
			writer.write("Welcome to my Resume");
			writer.newLine();
			writer.write("Hello Viewers !! My name is Gourish Bhagat");
			System.out.println("Successfully Written !!");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
