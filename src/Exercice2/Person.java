package Exercice2;

public class Person {

	private String name;
	private String lastName;
	private String email;
	private Integer age;

	public Person() {
		super();
	}

	public Person(String name, String lastName, String email, Integer age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person person = new Person("John", "Wick", "john@wick.com", 55);
		System.out.println(person);

	}

	@Override
	public String toString() {
		return "Person {name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "}";
	}

}
