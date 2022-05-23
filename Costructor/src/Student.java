
public class Student {
		String name;
		int id;
		int rollno;
		
		Student(String name, int id, int rollno){
			this.name=name;
			this.id=id;
			this.rollno=rollno;
			
		}
		
		public static void main(String[] args) {
			Student s1 = new Student("Md Nabil Hussain",17,700);
			System.out.println(s1.name +"  "+ s1.id+ "  "+ s1.rollno);
			
		}
}
