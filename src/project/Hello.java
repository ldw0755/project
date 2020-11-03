package project;
public class Hello {
	private String name;
	private int age;
	private String place;

	public Hello(String name, int age, String place) {
		this.name = name;
		this.age = age;
		this.place = place;
	}
	
	public void displayInfor() {
		System.out.println("이름:"+name+" 나이:"+age+" 지역:"+place);
	}
}
