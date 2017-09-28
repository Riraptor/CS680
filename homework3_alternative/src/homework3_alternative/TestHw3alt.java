package homework3_alternative;

public class TestHw3alt {
	public static void main(String[] args){
		Student s1= new Student( new InState(1000), "John Smith");
		System.out.println(s1.getTuition());
		System.out.println(s1.getName());
		//changing the status of the student
		Student s2 = new Student( new OutState(2000), s1.getName());	
		System.out.println(s2.getTuition());
		System.out.println(s2.getName());
 }
}