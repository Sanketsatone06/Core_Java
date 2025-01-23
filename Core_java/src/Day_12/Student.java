package Day_12;

class PersonalDetails{
	String name="Sanket";
	int Rollno=45;
	
	public void personaldetails() {
		
		System.out.println("Name is " + name);
		System.out.println("Roll no is " +Rollno);
	}
	
}

class AcademicDetails extends PersonalDetails{
	
	public void academicdetails() {
		System.out.println("Enter your AcademicDetails");
	}
}

class CurricularDetails extends AcademicDetails  {
	public void curriculardetails() {
		System.out.println("Enter your CurricularDetails");
	}
}
public class Student {

	public static void main(String[] args) {
		
		CurricularDetails acdetails = new CurricularDetails();
		
			
		acdetails.personaldetails();

	}

}

