package dsa;

public class Implement {

	public static void main(String[] args) {
	Foo f=new Foo(5);
	 changeData(f);
   changeReference(f);
  
    System.out.println(f.attribute);
	}

	private static void changeData(Foo f) {
	   f.attribute=1;
	}

	private static void changeReference(Foo f) {
		Foo g=new Foo(2);
		f=g;
	}

}
