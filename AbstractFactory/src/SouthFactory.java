
public class SouthFactory implements Factory {

	@Override
	public Fruit createApple() {
		System.out.println("南方苹果生成");
		return new Apple();
	}

	@Override
	public Fruit createBanana() {
		System.out.println("南方香蕉生成");
		return new Banana();
	}

}
