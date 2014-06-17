package Serialisation;

import java.io.*;

public class Dog extends Animal implements Tricks{

	public Dog() {
		
		setName("pooka");
		setType("Dog");
           
		
	}
	
	//this is an overload
    public Dog(String name) {
		
		setName(name);
		setType("Dog");
           
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public String shakeHands() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String rollOver() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
