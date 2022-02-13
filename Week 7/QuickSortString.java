class QuickSort{
	void quickSort(String[] arr,int low,int high){
        if(low<high){
                int pi=partition(arr,low,high);

                quickSort(arr, low, pi-1);
                quickSort(arr, pi+1, high);
            }
    }

    int partition(String[] arr,int low,int high){
        int i=low-1;
        String pivot=arr[high];

        for(int j=low;j<=high-1;j++{
            if(arr[j].compareTo(pivot)<0){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    void swap(String[] arr,int x,int y) {
        String temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
}

class Main{
	public static void main(String[] args){
		String[] arr={"Anm","Sdp","Dan","Nanya","Lisa","Alan"};
		QuickSort QS=new QuickSort();
		QS.quickSort(arr,0,5);
		for(int i=0;i<6;i++){
      		  	System.out.println(arr[i]);
       	}
	}
}
