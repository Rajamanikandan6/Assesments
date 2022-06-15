package sessionDemo;

public class StudentNew {
	 public String address;  
	 public String rollNumber;  
	 public String name; 
	 public String phone; 
}
class TestStudent1{  
	 public static void main(String args[]){  

		 StudentNew s1=new StudentNew();  
		 StudentNew s2=new StudentNew();  

	  s1.phone="999999999";  
	  s1.name="sam";  
	  s1.rollNumber="1";  
	  s1.address="bangalore";  
	  
	  s2.phone="888888888";  
	  s2.name="jake";  
	  s2.rollNumber="2";  
	  s2.address="mangalore";  
	  
	  System.out.println("Details of :"+s1.name); 
	  System.out.println("name :"+s1.name+"rollNumber :"+s1.rollNumber+"phone :"+s1.phone+"address :"+s1.address);  
	  System.out.println("Details of :"+s2.name);  
	  System.out.println("name :"+s2.name+"rollNumber :"+s2.rollNumber+"phone :"+s2.phone+"address :"+s2.address); 
	 } 
	}