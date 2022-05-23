class OnePlus extends Mobile{
	OnePlus(String model, String clr, int price){
		this.model = model;
		this.clr = clr;
		this.price= price;
		
	}
	void allfeatures() {
		System.out.println("Model Name : "+ this.model+"\nColor = "+this.clr+"\nPrice : "+this.price);
		this.gaming();
		this.callingFeature();
		this.browsingInternet();
		this.runApp();
	}
	public static void main(String[] args) {
		OnePlus o = new OnePlus("OnePlus 10R","White", 39999);
		o.allfeatures();
		OnePlus o1 = new OnePlus("OnePlus Nord 2","Sky Blue",29999);
		o.allfeatures();
		
		
	}
	

}
