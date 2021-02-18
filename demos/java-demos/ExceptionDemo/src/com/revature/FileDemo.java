package com.revature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("demo1.txt");
			
			System.out.println("This will not print if the exception occurs");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("File could not be found!");
		}
		

		System.out.println("........");
		
	}

}
