package dsa;

public class fabnoiceSeries {
  public static void main(String args[]) {
	 fab(1,1,10);	//1 1 2 3 5
  }

private static void fab(int previous,int current,int bound ){
  if(current>bound) {
	  return;
  }else {
	  if(previous==1 && current==1) {
		  System.out.print("1,1");
	  }
	  System.out.print(","+(previous+current));
	  fab(current,(current+previous),bound);
  }
}

}
