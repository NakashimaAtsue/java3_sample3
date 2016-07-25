package test.animal;

import animal.*;

	public  class Lion implements Animal{
		public String getName(){
	      return "Lion";
	 	}

	 	public int getSpeed(){
	 		return　60;
	 	}

	 	public String race(Animal a){
	 		if(60 = a.getSpeed()) {
	 			return "draw";

	 		}else if(60 < a.getSpeed){
	 			return "ライオン lose";

	 		}else{
	 			return "ライオン　win";
	 		}
}