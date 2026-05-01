package advJAVA;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferedAndScanner {

	public static void main(String[] args) throws IOException{
		
//BufferedReader was used earlier to get input from user and bf.readLine() method accepts only string so we need to convert this to Int if we need Int.
//so updated version Scanner came later which provides multiple userInput methods
//main class throws an Exception this is not good pratice to to throws by main but it works with BufferReader
		
		System.out.println("Enter the Value:");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		int num = Integer.parseInt(bf.readLine());
		System.out.println(num);
		
	}

}
