
public class Student1 extends Student
{
	public void Student1()
	{
	}
	public Student1()
	{
		super();
	}
	public Student1(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String toString()
	{
		return name + " " + rollno;
	}
	public static void main(String[] args) 
	{
		Student1 obj = new Student1();
		Student1 obj1 = new Student1("Ram",100);
 obj.Student1();
 System.out.println(obj1);
	}

}
