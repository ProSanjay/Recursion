package dsa;

public class ReverseStringRecursion {

	public static void main(String[] args) {
	String s="sanjay";
	reverseString(s,s.length());

	}

	private static void reverseString(String s,int length) {
	if(length==0) {
		return;
	}
	System.out.print(s.charAt(length-1));
	reverseString("sanjay",length-1);
	}

}
