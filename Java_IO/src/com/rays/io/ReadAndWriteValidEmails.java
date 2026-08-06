package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidEmails {
	public static void main(String[] args) throws Exception {
		BufferedReader source = new BufferedReader(new FileReader("/Users/meetrambadia/Desktop/Dum/email.txt"));
		BufferedWriter target = new BufferedWriter(new FileWriter("/Users/meetrambadia/Desktop/Dum/validEmail.txt"));

		String email = source.readLine();

		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				target.write(email);
				target.newLine();
			}
			email = source.readLine();
		}
		source.close();
		target.close();

	}

}
