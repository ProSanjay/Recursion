package dsa;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
		int[] a= {2,2,2,2,5,6,6,7,8,8,8,7};
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(list.contains(a[i])) {
				
			}else {
				list.add(a[i]);
			}
		}
 System.out.println(list);
	}

}
