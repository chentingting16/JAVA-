
public class Person2{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	private static Person2 person;
	private Person2(){};
	public static Person2 getPerson2()
	{
		if(person==null)
		{
			person = new Person2();
			return person;
		}
		else {
			return person;
		}		
	}
}
