interface Animal{
	final int a = 10;
	void makeNoise();
}

class Dog implements Animal{
	public void makeNoise(){
		System.out.println("Bow Bow");
	}
	public void shakeTail(){
		System.out.println("Wag Wag");
	}
}

class Main{
	public static void main(String args[]){
		Animal obj = new Dog();
		obj.makeNoise();
//		Will not work as 'obj' is an instance of Animal class but it is a reference of Animal interface
//		obj.shakeTail();
	}
}

