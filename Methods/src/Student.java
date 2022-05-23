
public class Student {
	String name;
	int phy,chem,math;
	Student(String n, int p, int c, int m){
		this.name = n;
		this.phy = p;
		this.chem = c;
		this.math = m;
		
	}
	
	void details() {
		System.out.println("Student name : "+ this.name +"\nPhysics : "+this.math+"\nChemistry : "+ this.chem+ "\nMaths : "+this.math);
		this.totalMarks();
		this.percentage();
		
	}
	
	void totalMarks() {
		int total = phy+chem+math;
		System.out.println("Total Mark : " +total);
		
	}
	void percentage() {
		int per = (this.phy+this.chem+this.math)*100/300;
		System.out.println("Percentage : "+ per);
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		Student s1 = new Student("Nabil",78,86,90);
		s1.details();
		Student s2 = new Student("Radhe",85,86,88);
		s2.details();
		Student s3 = new Student("Anish",99,45,76);
		s3.details();
		
	}

}
