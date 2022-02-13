import java.util.Scanner;

class Employee{
	String name;
	int age;
	String phNo;
	String address;
	float salary;
	
	void printSalary(){
		System.out.println("Salary = " + salary);
	}
	
	void dataInput(){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
		System.out.print("Enter phone No. : ");
		phNo = sc.next();
		System.out.print("Enter address: ");
		address = sc.next();
		System.out.print("Enter salary: ");
		salary = sc.nextFloat();
	}
	
	void display(){
		System.out.println("Name: " + name + "\nAge: " + age + "\nPh No: " + 			phNo + "\nAddress: " + address  );
	}

}

class Officer extends Employee{

	String specialization;
	
	void specInput(){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter specialization: ");
		specialization = sc.nextLine();
	}
}

class Manager extends Employee{
	
	String department;
	
	void depInput(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department: ");
		department = sc.nextLine();
	}
}

class Main{
	public static void main(String[ ] args){
		Officer ob1 = new Officer();
		Manager ob2 = new Manager();
		
		System.out.println("Input Officer Details: ");
		ob1.dataInput();
		System.out.println("Input Manager Details: ");
		ob2.dataInput();
		
		System.out.println("Officer Details: ");
		ob1.display();
		System.out.println("Officer Details: ");
		ob2.display();
	}

}
