package skillbuilders;

public class gradebook {

	public static void main(String[] args) 
	{
		//Client creates objects
		Student alex = new Student("Alex Ross", 3.2);
		Student ali = new Student("Mohomed Ali", 3.3);
		Student amy = new Student("amy lin", 3.1);
		Student jasmine = new Student("jasmine jordan", 3.1);
	
		
		
		System.out.println(alex);//automatically calls toString() 
		System.out.println(ali);
		System.out.println(amy);
		System.out.println(jasmine);
	}

}
