
public class Bike {
	void Honda() {
		System.out.println("---------Types of Honda Bikes------");
		System.out.println("Honda Grazia");
		System.out.println("Honda Activa");
		System.out.println("Honda CBR");
	}
	void Hero() {
		System.out.println("----------Types of Hero Bikes-------");
		System.out.println("Hero Splender");
		System.out.println("Hero HF delux");
		System.out.println("Hero Passion Pro");
	}
	void Yamaha() {
		System.out.println("-------Types of Yamaha Bikes-----------");
		System.out.println("Yamaha fasino");
		System.out.println("Yamaha FZS");
		System.out.println("Yamaha SZR");
	} 
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.Honda();
		b1.Hero();
		b1.Yamaha();
	}
}
