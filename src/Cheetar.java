package test.animal;

import animal.*;

	public  class Cheetar implements Animal{
		private String name = "チーター";
		private int speed = 110;


		public String getName(){
	      return name;
	 	}

	 	public int getSpeed(){
	 		return speed;
	 	}

	 	public String race(Animal a){
	 		if(speed == a.getSpeed()) {
	 			return "draw";

	 		}else if(speed < a.getSpeed()){
	 			return name + "lose";

	 		}else{
	 			return name + "win";
	 		}
}
}
