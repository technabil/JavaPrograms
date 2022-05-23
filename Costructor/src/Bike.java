//intilization using Constructor.
public class Bike {
		String name;
		int price;
		Bike(){
			name="BMW";
			price=89765;
			
		}
		public static void main(String[] args) {
			Bike b1= new Bike();
			System.out.println(b1.name);
			System.out.println(b1.price);
		}

}

