package dsa;

public class DiagonalElement {

	public static void main(String[] args) {
	//sumission of  first diagonal elements
		int[][] array= {{1,2,3,4},{11,12,13,14},{7,8,9,10}
		            ,{15,16,17,18}};
		int total=0;
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array[i].length;j++) {
//				if(i==j) {
//				total=total+array[i][j];
//					break;
//				}
//			}
//		}
//		System.out.println("Summission of diagonal elements :"+total);

		//summission of second diagonal element 
		for(int i=0;i<array.length;i++) {
			for(int j=array[i].length-1-i;j>=0;j--) {
				total=total+array[i][j];
				break;
			}
		}
		System.out.println("Summission of diagonal elements :"+total);
	}

}
