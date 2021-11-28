package dsa;

public class CelingFloor {

	public static void main(String[] args) {
		//program to find ceiling and floor of any given number when it present in array
	int[] array= {3,5,7,9,10};
     int target=10;
     int index=searching(target,array);
     if(index>=0) {
    	 if(index==array.length-1) {
    		 System.out.println("Ceiling value doen't exit");
    		 System.out.println("floor value:"+array[index-1]);
    	 }else if(index==0) {
    		 System.out.println("floor value doen't exit");
    		 System.out.println("ceiling value:"+array[index+1]);
    	 } else {
    		 System.out.println("floor value:"+array[index-1]); 
    		 System.out.println("ceiling value:"+array[index+1]);
    	 }
     }
	}

	private static int searching(int target, int[] array) {
	int low=0;
	int high=array.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
	    if(target==array[mid]) {
	    	return mid;
	    }else if(target<array[mid]) {
	    	high=mid-1;
	    }else {
	    	low=mid+1;
	    }
	}
		return -1;
	}

}
