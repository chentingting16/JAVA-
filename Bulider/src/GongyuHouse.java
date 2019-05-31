
public class GongyuHouse implements Builder {
	private House house=new House();
	@Override
	public void makefloor() {
		house.setFloor("¹«Ô¢µØ°å");
	}

	@Override
	public void makewall() {
		house.setWall("¹«Ô¢Ç½");
	}
	
	public House getHouse()
	{
		return house;
	}

}
