/*P5. Write a Java program to calculate the area of different shapes namely circle, rectangle and triangle using the concept of method overloading.*/

class garbageCollector{
	public static void main(String args[ ]){
		Runtime r = Runtime.getRuntime();
		long mem1;
		Integer someInt[ ] = new Integer[1000];
		System.out.println("Total memory is: " + r.totalMemory() );
		mem1 = r.freeMemory();
		System.out.println("Initail free memory: " + mem1);
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Free memory after garbage collection: " + mem1);
	}
}
