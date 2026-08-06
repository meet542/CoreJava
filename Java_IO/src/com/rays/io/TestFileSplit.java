package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileSplit {
	public static void main(String[] args) throws Exception{
		BufferedReader fileRead = new BufferedReader(new FileReader("/Users/meetrambadia/Desktop/Dum/mainFile.txt"));
		
		String string = fileRead.readLine();
		int count =0;
		
		while(string!=null) {
			count++;
			string= fileRead.readLine();
		}
		
		System.out.println("Total number of lines in file : " + count);
		
		BufferedReader bReader = new BufferedReader(new FileReader("/Users/meetrambadia/Desktop/Dum/mainFile.txt"));
		
		for(int i=1;i<=count;i++) {
			String line = bReader.readLine();
			System.out.println("create file " + i + " for line: " + line);
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/meetrambadia/Desktop/Dum/SplitFile" + i + ".txt"));
			bw.write(line);
			bw.close();
		}
		
		bReader.close();
		fileRead.close();
		System.out.println("File split into " + count + " parts.");
	}

}
