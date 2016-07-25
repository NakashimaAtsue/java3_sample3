package test.animal;

import animal.*;

public class Horse implements Animal{
	private int speed = 80;
	private String name = "馬";


	public int getSpeed(){
		return speed;
	}
	public String getName(){
		return name;
	}

	public String race(Animal a){
		if(getSpeed() = a.getSpeed()){
			return "draw";

		}else if(getSpeed() < a.getSpeed()){
			return "馬 lose";
		
		}else{
			return "馬 win";
		}

	}
	
