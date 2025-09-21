package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) throws IOException {
		String[] names = { "Java", "JavaScript", "Python", "SQL", "C" };
		var fw = new FileWriter("c:\\Program Files\\Java\\java24\\bin\\names.txt");

		for (var name : names) {
			fw.write(names + "\n");
		}

		fw.close();
	}
}