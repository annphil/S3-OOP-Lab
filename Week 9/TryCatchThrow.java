import java.lang.Exception;

class Demo{

	void checkAge(int age) {//throws ArthmeticException{
		if(age <18)
			throw new ArithmeticException("Access denied, you must be 18+ \n");
		else
			System.out.println("Access granted \n" );
	}
}

class Main{
	public static void main(String[] args) {
		try{
			int a = 0;
			int b = 55/a;
			System.out.println("In Try block");
		}
		catch(ArithmeticException e){
			System.out.println("Caught Arithmetic exception " + e);
		}
		catch(Exception e){
			System.out.println("Caught exception " + e);
		}
		finally{
			System.out.println("In Finally block");
		}
		System.out.println("Rest of the code... ");
		
		Demo obj = new Demo();		
		obj.checkAge(17);
	}
}
