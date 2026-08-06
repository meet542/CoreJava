package com.rays.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputAndOutputStream {
	public static void main(String[] args) throws IOException {

		String source = "/Users/meetrambadia/Movies/2026-05-02 01-07-24.mov";

		String target = "/Users/meetrambadia/Movies/2026-05-02 01-07-24-copy.mov";

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));

		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));

		int count = in.read();

		System.out.println(count);

		while (count != -1) {

			out.write(count);

			count = in.read();

		}
		System.out.println("sucessfully");
		in.close();
		out.close();

	}
}
