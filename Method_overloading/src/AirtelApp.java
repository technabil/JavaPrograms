class AirtelApp {
	long cardNumber;
	String expDate,upiId,username,password;
	int cvv;
	void payBill(long cardNumber, String expDate, int cvv) {
		this.cardNumber=cardNumber;
		this.expDate= expDate;
		this.cvv= cvv;
		System.out.println("You pay this bill via this Card functionality");
		System.out.println("Card Number"+this.cardNumber);
		System.out.println("Expire date"+ this.expDate);
		System.out.println("CVV number"+ this.cvv);
		System.out.println("--------------------------");
	}
	void payBill(String upiId) {
		this.upiId=upiId;
		System.out.println("You pay this bill via UPI ID  functionality");
		System.out.println("UPI ID : "+this.upiId);
		System.out.println("--------------------------");		
	}
	void payBill(String un, String ps) {
		this.username= un;
		this.password = ps;
		System.out.println("You pay this bill via Network functionality");

		System.out.println("Username : "+this.username);
		System.out.println("Password : "+this.password);
		
	}
	public static void main(String[] args) {
		AirtelApp a = new AirtelApp();
		a.payBill(523456278,"07/24",888);
		a.payBill("9878767668@ybl");
		a.payBill("nabil123","********");
		System.out.println("--------------------------");

		
		
	}
}
