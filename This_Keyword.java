package sahil;

public class This_Keyword 
{
	int student_id;
	String student_name;
	double salary;
	
	void student_details(int student_id, String student_name, double salary)
	{
		this.student_id = student_id;
		this.student_name=student_name;
		this.salary=salary;

	}
	
public static void main(String[] args) {
	This_Keyword t = new This_Keyword();
	t.student_details(29, "Sahil", 167000);
	System.out.println(t.student_id);
	System.out.println(t.student_name);	
	System.out.println(t.salary);
	
	
}	
}

