package dsa;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a= {2,3,4,5,6,7};
     int index=0;
     boolean b=isSort(a,index);
     System.out.println(b);
	}

	private static boolean isSort(int[] a,int index) {
		// TODO Auto-generated method stub
		if(index==a.length-1) {
			return true;
		}
		if(a[index]<a[index+1]) {
		return	isSort(a,index+1);
		}
		return false;
	}

}
