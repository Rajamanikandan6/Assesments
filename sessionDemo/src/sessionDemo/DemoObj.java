package sessionDemo;

public class DemoObj {
	DemoObj()
	    {
	        this(10);
	        System.out.println("successful");
	    }
	 
		DemoObj(int a)
	    {
	        System.out.println("got the value : "+a);
	    }
	    public static void main(String[] args)
	    {
	        new DemoObj();
	        System.out.println("Completed");
	    }
}

