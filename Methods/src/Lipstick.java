
public class Lipstick {
	
	String name, clr,type,size;
	int price, tax;
	 
	
	Lipstick(String n, int p, String c, String t, String s, int tx) {
		this.name = n;
		this.price = p;
		this.clr = c;
		this.type = t;
		this.size = s;
		this.tax = tx;
	}
	void details () {
		System.out.println("Name : "+this.name+"\nColor : "+this.clr);
		System.out.println("Price : "+this.price+ "\nType : "+ this.type +"\nSize : "+ this.size);
		this.totalPrice();
	}
	void totalPrice() {
		int total = price+tax;
		System.out.println("Price+tax : "+total);	
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		Lipstick b1 = new Lipstick("Lakme",250,"Pink", "Mattelic","Small",40);
		b1.details();
		Lipstick b2 = new Lipstick("Fitmee",200,"Pitch", "Red","Medium",30);
		b2.details();
		Lipstick b3 = new Lipstick("Nykaa",100,"Red", "Matty","Large",20);
		b3.details();

		
		
	}

}