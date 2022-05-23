
public class Games {
	String name;
	String type;
	void PlayerList() {
		System.out.println("-------This is the list of player-------");
	}
	void Plays() {
		PlayerList();//Calling the function
		System.out.println(this.name + " play the game "+ this.type);
	}
	
	Games(String name , String type){
		this.name = name;
		this.type = type;
		
	}
	
	public static void main(String[] args) {
		Games g1 = new Games("Dhoni","Cricket");
		g1.Plays();
		Games g2 = new Games("Ronaldo","Football");
		g2.Plays();
		Games g3 = new Games("Kohli","Cricket");
		g3.Plays();
		Games g4 = new Games("Messi","football");
		g4.Plays();
		
				
		
	}
}