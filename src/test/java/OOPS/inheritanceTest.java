package OOPS;

public class inheritanceTest {

	public static void main(String[] args) {
		
		A obA=new A();
		
		obA.ShowA();
		
		System.out.println("--------------------------------");
		
		B obB=new B();
		
		obB.ShowA();
		obB.ShowB();
		
		
		System.out.println("---------------------------------");
		
		C obC=new C();
		
		obC.ShowC();
		obC.ShowA();
		obC.ShowD();
		
		
		
	
		
		
		
		
		
		
		
	}

}
