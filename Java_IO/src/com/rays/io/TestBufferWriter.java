package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferWriter {
	public static void main(String[] args) throws Exception{
		BufferedWriter file = new BufferedWriter(new FileWriter("/Users/meetrambadia/Desktop/Dum/Hello.txt"));
		
		file.write("public class Test {");
		file.newLine();
		file.write("	public static void main(String[] args) {");
		file.newLine();
		file.write("		System.out.println();");
		file.newLine();
		file.write("	}");
		file.newLine();
		file.write("};");
		
		System.out.println("File Write successfully.");
		file.close();
	}
}
