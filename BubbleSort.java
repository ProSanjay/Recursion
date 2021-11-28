package dsa;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] array= {5,3,5,7,1};
	  System.out.println("sorted array:");
	  int[] result=bubble(array);
	  for(int a:result) {
		  System.out.println(a);
	  }

	}

	private static int[] bubble(int[] array) {
		int counter=0;
		for(int i=0;i<array.length-1;i++) {
			boolean flag=true;
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					counter++;
					flag=false;
				}
			}
			
			if(flag) {
				break;
			}
		}
		System.out.println(counter);
		return array;
	}

}
