
public class Players {
	String name;
	void play() {
		System.out.println(this.name + " play the game");
	}
	Players(String name){
		this.name = name;
	}
	 public static void main(String[] args) {
		Players p1 = new Players("Dhoni");
		Players p2 = new Players("Kohli");
		Players p3 = new Players("Rohit");
		p1.play();
		p2.play();
		p3.play();
	}
	 
}

