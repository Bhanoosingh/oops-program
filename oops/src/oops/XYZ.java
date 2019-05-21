package oops;

public class XYZ {

	public static void main(String[] args) {
		XYZ ob=new XYZ();
		ob.sum(7, 8);
		ob.mul(3, 5);

	}
	void sum(int a,int b) {
		System.out.println("Sum="+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("Sub="+(a-b));
	}
	public int div(int a,int b) {
		return (a/b);
	}
	private void mul(int a,int b) {
		System.out.println("mul "+(a*b));
	}
	protected void mul1(int a,int b) {
		System.out.println("mul "+(a*b));
	} 
	
	protected static void mul3(int a,int b) {
		System.out.println("mul "+(a*b));
	} 

}
