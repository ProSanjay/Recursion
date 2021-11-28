package dsa;

public class RotationOfArray {

	public static void main(String[] args) {
	//java program count rotation of array
		int[] rotate= {2,3,4};
		int count=0;
		boolean flag=false;
		for(int i=0;i<rotate.length-1;i++) {
			flag=false;
			if(rotate[i]<rotate[i+1]) {
				count++;
				flag=true;
			}
			if(!flag) {
				break;
			}
		}
		System.out.println(count+1);

	}

}
