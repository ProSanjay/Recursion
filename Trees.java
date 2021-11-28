package dsa;
import java.util.Scanner;
public class Trees{
Nodet root;
Nodet temp;
  Scanner sc=new Scanner(System.in);
 public Nodet toCreate(int data) {
	if(data==-1) {
		return null;
	}
	if(temp==null) {
		root=new Nodet(data);
		temp=root;
	}else{
		root=new Nodet(data);	
	}
		
		System.out.println("Enter left node of "+data);
		int data1=sc.nextInt();
	    root.left=toCreate(data1);
	    System.out.println("Enter right node of "+data);
	    int data2=sc.nextInt();
	    root.right=toCreate(data2);
		return root;
	
}
public void inOrder1() {
	this.root=this.temp;
	inOrder(root);
}
public void inOrder(Nodet root) {
    if(root==null) {
    	return;
    }
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
    
   }
}
class Nodet{
	int data;
	Nodet left, right;
 public	Nodet(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}