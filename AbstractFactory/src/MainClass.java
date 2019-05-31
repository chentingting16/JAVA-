
public class MainClass {

	public static void main(String[] args) {
		Factory F1=new NorthFactory();
		Fruit apple1=F1.createApple();
		Fruit banana1=F1.createBanana();
		
		Factory F2=new SouthFactory();
		Fruit apple2=F2.createApple();
		Fruit banana2=F2.createBanana();

	}

}
