package exceptions;


public class Ex1 {
	String name;
	int age;
	public Ex1(String name, int age) throws AgeIncorectException {
		super();
		this.name = name;
		if (age>15) {
			this.age = age;
		}
		else {
			throw new AgeIncorectException();
		}
	}
	@Override
	public String toString() {
		return "Ex1 [name=" + name + ", age=" + age + "]";
	}
	
	

	

}
