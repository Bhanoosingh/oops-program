package polymorph;

public class Child extends Aparent{

	int a,b;
	
	Child(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void sum() {
		System.out.println(
				"Aparent implemented in child Sum=" +
						(a + b));
	}

}
