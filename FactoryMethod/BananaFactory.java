
public class BananaFactory implements Factory {

	@Override
	public Fruit createfruit() {	
		return new Banana();
	}

}
