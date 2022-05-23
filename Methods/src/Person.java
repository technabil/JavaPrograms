
public class Person {
	void eatFood() {
		System.out.println("Person eat food");
	}
	void washHand() {
		System.out.println("Person wash hand");
		eatFood();
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.washHand();
	}

}
