public class Students {
	void boys() 
	{
		System.out.println("_________Boys__________");
		System.out.println("Nabil");
		System.out.println("Suraj");
		System.out.println("Avinash");
		System.out.println("Anish");

	}
	void girs() {
		System.out.println("___________Girls________");
		System.out.println("Nisha");
		System.out.println("Priya");
		System.out.println("Deepika");
		System.out.println("Sheela");
	}
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.boys();
		s1.girs();
		s1.boys();
	}
}
