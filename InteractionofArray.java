package dsa;

import java.util.HashMap;

public class InteractionofArray {
	 public  static void intersection(int[] nums1, int[] nums2) {
	     HashMap<Integer,Integer> map=new HashMap<>();
	     int key=0;
	     for(int i=0;i<nums1.length;i++){
	         for(int j=0;j<nums2.length;j++){
	             if(nums1[i]==nums2[j]){
	                 if(map.containsValue(nums2[j])) {
	                	 
	                 }else {
	                	 map.put(key,nums2[j]);
	                	 key++;
	                 }
	             }
	         }
	     }
	     Object[] keys=map.keySet().toArray();
	     int[] array=new int[keys.length];
	     for(int i=0;i<array.length;i++) {
	    	 array[i]=map.get(i);
	     }
	     for(int a:array) {
	    	 System.out.println(a);
	    	 System.out.println("sanjay");
	     }
	    }
	public static void main(String[] args) {
     int[] a= {1,2,3};
   int[] b= {1,2,3};
   intersection(a,b);

	}

}
