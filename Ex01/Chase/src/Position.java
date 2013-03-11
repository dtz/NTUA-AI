
public class Position {
	private int x;
	private int y;
	
	public Position(int xcoor, int ycoor){
		x=xcoor;
		y=ycoor;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int newX){
		x=newX;
	}
	
	public void setY(int newY){
		y=newY;
	}
}
