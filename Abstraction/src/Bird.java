
abstract public class Bird {
abstract void fly();
abstract void eat();
}
abstract class Eagle extends Bird{
	void fly() {
		System.out.println("I can fly above the clouds");
	}
}
abstract class Sparrow extends Bird{
	void fly() {
		System.out.println("I can't fly higher");
	}
}
class SerpantEagle extends Eagle{
	void eat() {
		System.out.println("I want to eat meat");
	}
}
class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("I don't want to eat meat");
	}
}
class VegSparrow extends Sparrow{
	void eat() {
		System.out.println("I don't love insects");
	}
}
class NonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("I love insects");
	}
}
