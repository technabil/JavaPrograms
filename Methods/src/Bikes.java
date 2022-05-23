
public class Bikes {
	String name, clr;
	int srprice, tax;
	Bikes(String name, String clr, int srprice, int tax){
		this.name = name;
		this.clr = clr;
		this.srprice = srprice;
		this.tax = tax;
	}
	void details() {
		System.out.println("Name: "+this.name + " \nColor: "+this.clr +"\nShowroom Price: "+this.srprice + "\nTaxes: "+this.tax);
		this.totalPrice();
	}
	void totalPrice() {
		int total = srprice + tax;
		System.out.println("Total price of the bike : " + total);
		System.out.println("------------------------------");
	}
	
	public static void main(String[] args) {
		Bikes b1 = new Bikes("KTM","Orange",180000,12500);
		b1.details();
		Bikes b2 = new Bikes("Bullet","Black",140000,13500);
		b2.details();
		Bikes b3 = new Bikes("NinJa","Green",200000,23500);
		b3.details();
		
	}
}
