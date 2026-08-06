package com.rays.io;

import java.io.File;

public class RenameDeleteFileOrDirectory {
	public static void main(String[] args) {
		File file = new File("/Users/meetrambadia/Desktop/dummy");
		
		//Rename file/directory
		file.renameTo(new File("/Users/meetrambadia/Desktop/Dum"));
		
		file.delete();
		file.deleteOnExit();
	}
}
