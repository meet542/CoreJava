package com.rays.io;

import java.io.File;

public class CreateSubdirectory {
	public static void main(String[] args) {
		File directory = new File("/Users/meetrambadia/Desktop/");
		//create a subDirectory
		File subDirectory = new File(directory,"dummy");
		subDirectory.mkdir();
	}
}
