package OOPS;

public class Employee {
	
	String name;
	int ID;
	String Job;
	int Sal;
	
	/*Employee(String name, int ID, String Job,int Sal)
	{
		this.name=name;
		this.ID=ID;
		this.Job=Job;
		this.Sal=Sal;
	}*/
	
	void Display()
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(Job);
		System.out.println(Sal);
		
	}
	

	public static void main(String[] args) {
		
		
		Employee Em1=new Employee();
		
		Em1.Display();
		
		
	}

}
