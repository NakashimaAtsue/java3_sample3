package test.animal;

import animal.*;

	public  class Cheetar implements Animal{
		public String getName(){
	      return "チーター";
	 	}

	 	public int getSpeed(){
	 		return 110;
	 	}

	 	public String race(Animal a){
	 		if(110 = a.getSpeed()) {
	 			return "draw";

	 		}else if(110 < a.getSpeed()){
	 			return "チーター lose";

	 		}else{
	 			return "チーター　win";
	 		}
}