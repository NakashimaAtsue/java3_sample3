package animal;

public class Lion implements Animal{
	
        private String name = "���C�I��";
	private int speed = 60;

	public String getName(){

		return name;
	}

	public int getSpeed(){

		return speed ;
	}

	public String race(Animal a){

		if( getSpeed() == a.getSpeed() ){
		return "draw" ;

		}else if( getSpeed() < a.getSpeed() ){
		return  "���C�I�� lost";

		}else{
		return "���C�I���@lost" ;
		}
	}
}
