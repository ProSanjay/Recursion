package dsa;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		int[] first= {2,3,6,7,9,8};
		int[] second= {2,6,7,9};
		ArrayList<Integer> list1=new ArrayList<>();
		for(int i=0;i<first.length;i++) {
			int target=first[i];
		   boolean b=binaray(target,second);
		   if(b) {
			   list1.add(target);   
		   }
		   
		}
		System.out.println(list1);
 	}

	private static boolean binaray(int target, int[] array) {
		// TODO Auto-generated method stub
		int low=0;
		int high=array.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(target==array[mid]) {
				return true;
				
			}else if(target<array[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
	    	return false;
	}

}
