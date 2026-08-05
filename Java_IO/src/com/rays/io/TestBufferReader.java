package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferReader {
	
	public static void main(String[] args) throws Exception{
		BufferedReader file = new BufferedReader(new FileReader("/Users/meetrambadia/Desktop/Dum/Hello.txt"));
		String string = file.readLine();
		while(string != null) {
			System.out.println(string);
			string = file.readLine();
		}
		file.close();
		
	}

}
