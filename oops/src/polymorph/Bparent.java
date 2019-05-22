package polymorph;

public interface Bparent {
	default  void sum(int a,int b) {
		System.out.println("Bparent Sum="+(a+b));
	}

}
