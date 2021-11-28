package dsa;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
  forword(a);
	}

	private static void forword(int a) {
		// TODO Auto-generated method stub
		if(a==0) {
			return;
		}
		
		forword(a-1);
		System.out.println(a);
		
	}

}
