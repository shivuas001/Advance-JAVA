package advJAVA;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;

//here we use try and catch block to handle this arithmetic	runtime error.
//in try block it will try to execute if it throws an error catch block will be executed by excepting an error by object from try block
//if try block does not get an error it will ignore execution of catch block.catch block execute only when try throws an error.
		
		try
		{
			j=18/i;
		}
		catch(Exception e)
		{
			System.out.println("there is some error");
		}
		
		System.out.println(j);
	
		
		System.out.println("hello");
	}

}
