package advJAVA;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		j=18/i;
		
		System.out.println(j);
		
	//In this case there is an arithmetic runtime error. but stops execution of code,
	//so we need to handle this runtime exception to execute further program
		
		System.out.println("hello");
	}

}
