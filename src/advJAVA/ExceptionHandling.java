package advJAVA;
//Ducking the exception that means the method which as defined will not handle exception it throws and class who is calling will handle it.

class A{
	 static void show() throws ClassNotFoundException {
		 Class.forName("Demo");
	 }
}

public class ExceptionHandling {
	
	static {
		System.out.print("class loaded");
	}

	public static void main(String[] args){
		A obj = new A();
		
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			System.out.println("ur class not found" + e);
		}
		
	}

}
