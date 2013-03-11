public class Room {

	private int length;
	private int width;
	private int[][] layout;
	
	public Room(int n, int m, int[][] a){
		length = n;
		width = m;
		layout = a;		
	}
	
	public boolean isPositionInRoom(Position pos){
		if (pos.getX()<width && pos.getX()>=0 && pos.getY()>=0 && pos.getY()<length)
			return true;
		else
			return false;
	}
	
	public boolean isPotitionEmpty(Position pos){
		if (layout[pos.getX()][pos.getY()]==0)
			return true;
		else
			return false;
	}
	
}
