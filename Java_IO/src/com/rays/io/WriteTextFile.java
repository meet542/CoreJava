package com.rays.io;

import java.io.FileWriter;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception{
//		FileWriter file = new FileWriter("/Users/meetrambadia/Desktop/Dum/Hello.txt");
		FileWriter file = new FileWriter("/Users/meetrambadia/Desktop/Dum/Hello.txt",true);
		
		file.write(" Hello World.");
		
		System.out.println("File successfully written.");
		
		file.close();
	}

}
