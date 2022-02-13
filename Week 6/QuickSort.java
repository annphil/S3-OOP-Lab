import java.util.Scanner;
import java.util.Collections;

class QuickSort{
	
	void quickSort(int n, int [] ar, int low, int high){
		if(low<high){
			int q = partition(n, ar, low, high );
		
			quickSort(n, ar, low, q-1 );
			quickSort(n, ar, q+1, high);
		}
	}
	
	int partition(int n, int[] ar, int low, int high){
		int x = ar[high];
		int i = low - 1;
		int j;
		for(j=low; j<high; j++){
			if(ar[j] < x){
				i++;
				int temp = ar[i];
               		ar[i] = ar[j];
                		ar[j] = temp;
			}
		}
		i++;
		int temp = ar[i];
		ar[i] = ar[high];
		ar[high] = temp;	
		return i;
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[50];
		QuickSort obj = new QuickSort();
		
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		System.out.print("Enter elements: ");
		for (int i=0; i<n; i++)
			ar[i] = sc.nextInt();
		
		obj. quickSort(n, ar, 0, n-1);
		System.out.print("Sorted lit: ");
		for (int i=0; i<n; i++)
			System.out.print(ar[i] + " ");
		System.out.println();
			
	}
}

