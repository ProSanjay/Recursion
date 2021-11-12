package dsa;

public class SumOfArrayRecursive {

	public static void main(String[] args) {
  int[] array= {2,4,5,7,8,9,10};
  int count=0;
  int total=0;
   sumOfArray(array,count,total);

	}

	private static void sumOfArray(int[] array, int count ,int total) {
	  if(count==array.length) {
		  return;
	  }
	 total=total+array[count];
	 sumOfArray(array,count+1,total);
	 if(count==array.length-1) {
		 System.out.println(total);	 
	 }
  	
	}

}
