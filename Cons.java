class Student
{
	String name;
	int age;
	char gender;	

//------------------------
	Student(String n, int a, char g)        //parameterised constructor
	{
		System.out.println("inside Student(n,a,g)...");
		name = n;
		age = a;
		gender = g;		
	}

	Student()                     //parameterless constructor
	{
		name = "Unknown";
		System.out.println("inside Student()...");	
	}

	Student(String n, char g)
	{
		name = n;
		gender = g;
		System.out.println("inside Student(n,g)...");	
	}

	void print()
	{
		System.out.println("Name:" + name + ", age:" + age + ", Gender=" + gender);
	}
	
};

public class Cons
{
	public static void main(String [] args)
	{
		Student x;

		x = new Student();
		x.print();

		Student pooja = new Student("Pooja", 'F');		
		pooja.print();

		Student ram = new Student("Ram", 25, 'M');
		ram.print();
		
		
	}
}

