
public class BirdApp {

	public static void main(String[] args) {
		
		SerpantEagle se=new SerpantEagle();
		GoldenEagle ge=new GoldenEagle();
		VegSparrow vs=new VegSparrow();
		NonVegSparrow nvs=new NonVegSparrow();
		se.fly();
		se.eat();
		ge.fly();
		ge.eat();
		vs.fly();
		vs.eat();
		nvs.fly();
		nvs.eat();
	}

}
