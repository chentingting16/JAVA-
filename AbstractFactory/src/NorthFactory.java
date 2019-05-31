
public class NorthFactory implements Factory {

	@Override
	public Fruit createApple() {
		System.out.println("北方苹果生成");
		return new Apple();
	}

	@Override
	public Fruit createBanana() {
		System.out.println("北方香蕉生成");
		return new Banana();
	}

}
