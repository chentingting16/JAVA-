
public class MainClass {

	public static void main(String[] args) {
		Factory ff1=new AppleFactory();
		Fruit apple=ff1.createfruit();
		apple.getFruit();
		Factory ff2=new BananaFactory();
		Fruit banana=ff2.createfruit();
		banana.getFruit();
	
	}

}
