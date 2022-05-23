
public class Bike_pramitrize_constructor {
	String name;
	public Bike_pramitrize_constructor(String n) {
		name = n;
	}
	public static void main(String[] args) {
		Bike_pramitrize_constructor b1 = new Bike_pramitrize_constructor("BMW");
		Bike_pramitrize_constructor b2= new Bike_pramitrize_constructor("Honda");
		System.out.println(b1.name);
		System.out.println(b2.name);
	}

}
