
public class PingfangBulider implements Builder {
	private House house=new House();
	@Override
	public void makefloor() {
		house.setFloor("平房地板");
	}

	@Override
	public void makewall() {
		house.setWall("平房墙");
	}
	
	public House getHouse()
	{
		return house;
	}

}
