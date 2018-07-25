package book_FKJavaJY;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.Test;

public class C15_IO {

	@Test
	public void test5() throws FileNotFoundException {
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		PrintStream out = new PrintStream(new File("./src/test/java/book_FkJavaJY/1"));
		System.setOut(out);
		System.out.println(1111111);
		
	}
	
	@Test
	public void test4() throws FileNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream(".");
		PrintStream printStream = new PrintStream(".");
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(".")));
		
	}
	
	@Test
	public void test3() throws FileNotFoundException {
		FileInputStream fs = new FileInputStream(".");
		
	}
	
	@Test
	public void test2() {
		File file = new File(".");
//		file.list(dir,name) -> name.endWith(".java");
	}
	@Test
	public void test1() {
		File file = new File("~/Documents/json.md");
		System.out.println(file.getPath());
		System.out.println(file.getName());
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getAbsoluteFile());
	}
}
