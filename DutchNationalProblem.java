package dsa;

public class DutchNationalProblem {

	public static void main(String[] args) {
		//java program to swap even odd number in an array
	int[] a= {3,5,10,8,15,6};
	  int low=0;
	  int high=a.length-1;
	  while(low<high) {
		  if(a[high]%2!=0) {
			  high--;
		  }
		  if(a[low]%2==0) {
			  low++;
		  } else{
			  if(a[high]%2==0) {
				  int temp=a[high];
				  a[high]=a[low];
				  a[low]=temp;
				  low++;
				  high--;
			  }
		  }
	  }
        for(int b:a) {
        	System.out.println(b);
        }
	}

}
