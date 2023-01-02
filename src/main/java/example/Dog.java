package main.java.example;

public class Dog {
	
	private String name;
	private Double weight;
	private String sex;
	private Integer age;
	
	public Dog(String name, Double weight, String sex, Integer age) {
		this.name = name;
		this.weight = weight;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() {
		return "My name is " + name + ".";
	}
	
	public String getItsHobby() {
		if (sex == "boy")
			return "Bite something.";
		else
			return "Play Ball.";
	}
	
	public Integer getHowFastCanItRun() {
		if(age < 1 || age > 10)
			return 1;
		else if (weight >= 5 && weight <= 10  )
			return 5;
		else
			return 3;
	}
}
