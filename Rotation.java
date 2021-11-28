package dsa;

public class Rotation {

	public static void main(String[] args) {
		int[] array= {8,9,10,11,12,2,3,5,6};
		int rotate=rotation(array);
		System.out.println(rotate);

	}

	private static int rotation(int[] array) {
	int s=0;
	int e=array.length-1;
	if(array[s]<array[e]) {
		return 0;
	}
	while(s<=e) {
		int mid=(s+e)/2;
		if(mid>0) {
			if(array[mid]<array[mid-1]) {
				return mid;
			}else if(array[mid]>array[mid+1]) {
				return mid+1;
			}else if(array[s]<array[mid]) {
				s=mid+1;
			}else if(array[e]>array[mid]) {
				e=mid-1;
			}
		}else if(array[mid]>array[mid+1]) {
			return mid+1;
	}
	}
		return 0;
	}

}

