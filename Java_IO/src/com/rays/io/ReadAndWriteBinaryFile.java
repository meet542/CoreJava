package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws Exception{
		String source = "/Users/meetrambadia/Movies/2026-05-02 01-07-24.mov";
		String target = "/Users/meetrambadia/Movies/2026-05-02 01-07-24-copy.mov";
		
		FileInputStream inputStream = new FileInputStream(source);
		FileOutputStream outputStream = new FileOutputStream(target);
		
		int in = inputStream.read();
		
		while (in != -1) {
			System.out.println(in);
			outputStream.write(in);
			in = inputStream.read();
		}
		
		inputStream.close();
		outputStream.close();
		
		System.out.println("successfull..............");
	}
}
