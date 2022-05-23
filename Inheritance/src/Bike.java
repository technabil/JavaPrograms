class Bike extends Vehicle {
	Bike(String name,int price){ //initializing the value using the constructor
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		Bike b1= new Bike("KTM",250000);
		System.out.println(b1.name);
		System.out.println(b1.price);
		b1.startEngine();
		b1.startEngine();
		 
	}

}
