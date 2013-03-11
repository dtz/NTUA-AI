import java.util.Random;

public class RandomRobot extends Robot {

	
	public RandomRobot(Position pos, int direction, Room room){
		super(pos, direction, room);
	}

	public void updatePosition(Robot robot){
		//TODO
		while(true){
			
			Random generator = new Random(); 
			int dir = generator.nextInt(4) + 1;
			 
		}
	}
}
