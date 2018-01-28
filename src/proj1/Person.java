package proj1;

public class Person {

	private String fullName;
	private String phone;
	private String pesel;
	private int age;
	
	public Person() {
	}
	public Person(String name, String phone, String pesel, int age) {
		this.fullName = name;
		this.phone = phone;
		this.pesel = pesel;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
