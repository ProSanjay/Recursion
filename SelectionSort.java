package dsa;
public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array= {7,6,4,9,0,2,16,3,10,2};
		  System.out.println("sorted array:");
		  int[] result=selection(array);
		  for(int a:result) {
			  System.out.println(a);
		  }

	}

	private static int[] selection(int[] array) {
	
	 for(int i=0;i<array.length;i++) {
		 int min=i;
		 for(int j=i;j<array.length;j++) {
			 if(array[j]<array[min]) {
				 min=j;				 
			 }
		 }
		 int temp=array[i];
		 array[i]=array[min];
		 array[min]=temp;
	 }
		return array;
	}

}
