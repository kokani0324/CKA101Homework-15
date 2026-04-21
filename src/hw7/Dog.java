package hw7;

import java.io.Serializable;

public class Dog extends Animal implements Serializable { //Serializable把物件序列化， implements實作 認證的
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
