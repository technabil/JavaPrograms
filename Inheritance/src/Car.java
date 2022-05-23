class Car extends Vehicle{
	Car(String name, int price){
		this.name = name;
		this.price = price;
	} 
	void speed() {
		System.out.println("This speed of car is 400km/hour");
		this.startEngine();
		this.stopEngine();
	}
	public static void main(String[] args) {
		Car c1= new Car("BMW", 1000000);
		System.out.println(c1.name);
		System.out.println(c1.price);
		c1.speed();
	}

}
