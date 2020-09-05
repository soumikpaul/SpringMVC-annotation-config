package com.example.StudntWithJavaConfig;

public class Student {
	private String name;
	gender gender;
	private int StdId,age;
	public enum gender{
		Male, Female;
	};
	
	public Student(String name, int age, int stdid,gender gender)
	{
		this.name=name;
		this.age=age;
		this.StdId=stdid;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdId() {
		return StdId;
	}
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "I am "+this.name+" age is "+this.age+" ID is "+this.StdId+" gender is "+this.gender;
	}

}
