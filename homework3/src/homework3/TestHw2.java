package homework3;

public class TestHw2 {
	public static void main(String[] args){
		Student s1= new Student(StudentStatus.INSTATE, "Rizan Amatya");
		//Student s2 = s1;
		//s2 = StudentStatus.OUTSTATE;
		System.out.println(s1.getTuition());
		System.out.println(s1.getName());
			}

}
