package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		//create object of "a.txt" file
		
		File file = new File("/Users/meetrambadia/Coding/Rays/Core/Java_IO/src/com/rays/io/a.txt");
		
		// Check if file exists
		if(file.exists()) {
			//Name of file
			System.out.println("Name : " + file.getName());
			
			//Path of file
			System.out.println("Path : " + file.getAbsolutePath());
			System.out.println();
			
			//Check access permission
			System.out.println("Access Permission");
			System.out.println("Writable : " + file.canWrite());
			System.out.println("Readable : " + file.canRead());
			System.out.println();
			
			//Check if it is a Directory or a file
			
			System.out.println("Is File : " + file.isFile());
			System.out.println("Is Directory : " + file.isDirectory());
			System.out.println();
			
			//Last modified date of file/directory
			Date date = new Date(file.lastModified());
			System.out.println("Date Modified : " + date);
			
			//Length of file
			long length = file.length();
			System.out.println("Length of file : " + length + " bytes");
		}
		
		else {
			System.out.println("File Does not exist");
		}
	}
}
