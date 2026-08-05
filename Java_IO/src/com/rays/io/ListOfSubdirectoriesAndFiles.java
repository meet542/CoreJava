package com.rays.io;

import java.io.File;

public class ListOfSubdirectoriesAndFiles {
	public static void main(String[] args) {
		File directory = new File("/Users/meetrambadia/Coding/Rays/Core/");
		
		//get the list of files and subdirectories
		
		String files[] = directory.list();
		for(String f : files) {
			System.out.println(f);
		}
	}
}
