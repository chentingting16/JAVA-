
public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person();
		p1.setName("chentingting");
		p1.setGender("female");
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		
		Person p2=p1.Clone();
		p2.setName("ctt");
		System.out.println(p2.getName());
		System.out.println(p2.getGender());
		
	}

}
