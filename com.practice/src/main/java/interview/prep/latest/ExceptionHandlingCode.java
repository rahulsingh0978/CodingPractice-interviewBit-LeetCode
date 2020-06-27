package interview.prep.latest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingCode {
	public void readFile() throws IOException{   // cehcked exception
		FileReader file = new FileReader("C:\\test\\a.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
          
        // Print first 3 lines of file "C:\test\a.txt" 
        for (int counter = 0; counter < 3; counter++)  
            System.out.println(fileInput.readLine()); 
          
        fileInput.close(); 
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		try {
			System.out.println(a / b);
			int[] ar= new int[1];
			System.out.println(ar[2]);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Hurrray!!!");
		}
	}
}
