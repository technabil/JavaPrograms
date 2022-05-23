
public class FootballPlayer {
	String name;
	void plays(){ //Called Method
		System.out.println(this.name + " Play the game");
	}
	public static void main(String[] args) {
		FootballPlayer f1= new FootballPlayer();
		f1.name = "Ronaldo"; //initilize using object reference
		f1.plays(); //calling the method
		FootballPlayer f2= new FootballPlayer();
		f2.name = "Messi0";
		f1.plays(); //calling the method
		FootballPlayer f3 = new FootballPlayer();
		f3.name= "Medrit";
		f1.plays(); 
	}

}
