class Realme extends Mobile {
	 Realme(String model, String clr, int price) {
		this.model= model;
		this.clr= clr;
		this.price = price;
	} 
	public static void main(String[] args) {
		Realme r = new Realme("Realme 5","Blue", 9999);
		System.out.println("Model name : " + r.model);
		System.out.println("Color : " + r.clr);
		System.out.println("Price : " + r.price);
		r.gaming();
		r.browsingInternet();
		r.callingFeature();
		r.runApp();
		
		Realme r1 = new Realme("Realme 7","white", 14999);
		System.out.println("Model name : " + r1.model);
		System.out.println("Color : " + r1.clr);
		System.out.println("Price : " + r1.price);
		
		r1.gaming();
		r1.browsingInternet();
		r1.callingFeature();
		r1.runApp();
		
		Realme r2 = new Realme("Realme Narzo 5","Grey", 12999);
		System.out.println("Model name : " + r2.model);
		System.out.println("Color : " + r2.clr);
		System.out.println("Price : " + r2.price);
		
		r2.gaming();
		r2.browsingInternet();
		r2.callingFeature();
		r2.runApp();

		
		
	
	}

}
