
public class Robot {
	
    protected Position p;
	protected int d;
	Room r;
	
	public Robot(Position pos, int direction, Room room){
		p=pos;
		d=direction;
		r=room;
	}
	
	public Position getPos(){
		return p;
	}
	
	public int getDir(){
		return d;
	}
	
	public boolean goUp() {
		return d==1;
	}
	
	public boolean goDown() {
		return d==2;
	}
	
	public boolean goRight(){
		return d==3;
	}
		
	public boolean goLeft(){
		return d==4;
	}
	
	public void setDir(int dir){
		d=dir;
	}
	
	public void moveUp(int step){
		p.setY(p.getY()+step);
	}
	
	public void moveDown(int step){
		p.setY(p.getY()-step);
	}
	
	public void moveRigth(int step){
		p.setX(p.getX()+step);
	}
	public void moveLeft(int step){
		p.setX(p.getX()-step);
	}
}
