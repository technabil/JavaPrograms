class Laptop {
		String brand;
		String color;
		int price;
		
		Laptop (String brand, String color, int price){
			this.brand= brand;
			this.color= color;
			this.price= price;
			
		}	
		
	public static void main(String [] args){
		Laptop l1 = new Laptop("HP","white",45000);
		Laptop l2 = new Laptop("Dell","black", 780000);
		Laptop l3 = new Laptop("Macbook","Greay", 80000);
		
		System.out.println(l1.brand+ l1.price);
	
	}
		



}
