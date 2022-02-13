import java.util.Scanner;

class BinarySearch{
	int binarySearch(int n, int [] ar, int search){
		int first, last, mid;
		
		first = 0;
		last = n-1;
		
		while(last>=first){
			mid = (first+last)/2;
			if(ar[mid] == search)
				return mid;
			else if(ar[mid]>search)
				last = mid-1;
			else if(ar[mid]<search)
				first = mid+1;
		}
		return -1; 
	}
}

class Main{
	public static void main(String[] ars){
		int n, search, pos, rpos;
		int ar[] = new int[50];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		n = sc.nextInt();
		
		System.out.print("Enter elements in sorted order: ");
		for(int i=0; i<n; i++)
			ar[i] = sc.nextInt();
			
		System.out.print("Enter element to be searched: ");
		search = sc.nextInt();
			
		BinarySearch obj = new BinarySearch();
		pos = obj.binarySearch(n, ar, search);
		rpos = pos + 1;
		
		if (pos == -1)
			System.out.print("Element not found ");
		else
			System.out.print(search +  " found at " + rpos + "\n");
	}
}
