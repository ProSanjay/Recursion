package dsa;

public class CeilingFloor {

	public static void main(String[] args) {
		int[] array= {3,5,7,9,10};
	     int target=6;
	     int result=searching(target,array);
	     if(result>=-1) {
	    	 if(result==array.length-1) {
	    		 System.out.println("Ceiling value doen't exit");
	    		 System.out.println("floor value:"+array[result]);
	    	 }else if(result==-1) {
	    		 System.out.println("floor value doen't exit");
	    		 System.out.println("ceiling value:"+array[result+1]);
	    	 } else {
	    		 System.out.println("floor value:"+array[result]); 
	    		 System.out.println("ceiling value:"+array[result+1]);
	    	 }
	     }   
	     
	}
	private static int searching(int target, int[] array) {
	int low=0;
	int high=array.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
	    if(target<array[mid]) {
	    	high=mid-1;
	    }else {
	    	low=mid+1;
	    }
	}
		return high;
	}

}
