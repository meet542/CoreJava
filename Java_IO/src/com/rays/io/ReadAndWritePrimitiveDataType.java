package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveDataType {
	public static void main(String[] args) throws Exception {
		DataOutputStream outputStream = new DataOutputStream(
				new FileOutputStream("/Users/meetrambadia/Desktop/Dum/primitive.txt"));

		outputStream.writeInt(1);
		outputStream.writeChar('a');
		outputStream.writeBoolean(false);
		outputStream.writeFloat(2);
		outputStream.writeDouble(9.22210);

		outputStream.close();

		System.out.println("Data added.........");

		DataInputStream inputStream = new DataInputStream(
				new FileInputStream("/Users/meetrambadia/Desktop/Dum/primitive.txt"));

		System.out.println(inputStream.readInt());
		System.out.println(inputStream.readChar());
		System.out.println(inputStream.readBoolean());
		System.out.println(inputStream.readFloat());
		System.out.println(inputStream.readDouble());
		
		inputStream.close();
	}
};
