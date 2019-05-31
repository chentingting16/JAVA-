
public class AppleFactory implements Factory {

	@Override
	public Fruit createfruit() {
		return new Apple();
	}

}
