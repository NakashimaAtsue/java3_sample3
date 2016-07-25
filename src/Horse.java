package test.animal;

import animal.*;

	public  class Horse implements Animal{
		public String getName(){
	      return "馬";
	 	}

	 	public int getSpeed(){
	 		return　80;
	 	}

	 	public String race(Animal a){
	 		if(80 = a.getSpeed()) {
	 			return "draw";

	 		}else if(80 < a.getSpeed){
	 			return "馬 lose";

	 		}else{
	 			return "馬　win";
	 		}
}