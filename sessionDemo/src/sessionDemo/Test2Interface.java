package sessionDemo;

public interface Test2Interface {
	
	public final int i=1;
	
	void hello();
}
class test3 implements TestInterface,Test2Interface{
	public void hello() {
		System.out.println("Hello welcome");
	}
	
	public void bye() {
		System.out.println("bye Tata");
	}
}