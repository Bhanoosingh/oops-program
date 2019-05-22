package polymorph;

public class Parent {
	public static int a;
	public static int b;
	
	protected static void sum() {
		System.out.println("Sum="+(a+b));
	}
	public static Aparent getAparent(int a,int b) {
		return new Child(a,b);
	}

}
