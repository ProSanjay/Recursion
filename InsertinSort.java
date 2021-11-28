 package dsa;

public class InsertinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 int[] array= {87,78,67};
				  System.out.println("sorted array:");
				  int[] result=insertion(array);
				  for(int a:result) {
					  System.out.println(a);
				  }


	}

	private static int[] insertion(int[] array) {
		// TODO Auto-generated method stub
		for(int i=1;i<array.length;i++) {
			int temp=array[i];
			int j=i-1;
			while(j>=0 && array[j]>temp) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
		}
		return array;
	}

}
