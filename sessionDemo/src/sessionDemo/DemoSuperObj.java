package sessionDemo;

public class DemoSuperObj {
	DemoSuperObj()
	    {
	        System.out.println("Parent class");
	    }
	}
	 
	class DemoSuperObj2 extends DemoSuperObj {
		DemoSuperObj2()
	    {
	      
	        super();
	 
	        System.out.println("called base class");
	    }
	 
	    public static void main(String[] args)
	    {
	        new DemoSuperObj2();
	        System.out.println("completed");
	    }
}
