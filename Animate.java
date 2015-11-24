
public class Animate extends Entity {
	private boolean isAlive;
	
	public Animate(Room r) {
		super(r);
	
	}
	
	public Animate(Room r, Location loc){
		super(r, loc);
		
	}
	
	public void moveRandom(){
		int r = (int) (Math.random() * currentRoom.getHeight()) - currentRoom.getHeight() / 2;
		int c = (int) (Math.random() * currentRoom.getWidth()) - currentRoom.getWidth() / 2;
		Location newLoc = new Location(loc.row - r, loc.col - c);
		if(currentRoom.isEmpty(newLoc.row, newLoc.col)){
			setLocation(newLoc);
		}
	}
	
	public void moveTowards(Location loc){
		int r = loc.row;
		int c = loc.col;
		if(this.loc.row < r) this.loc.row++;
		else this.loc.row--;
		if(this.loc.col < c) this.loc.col++;
		else this.loc.col--;
		setLocation(this.loc);
	}
	
	public void move(int direction){
		if (direction == Location.NORTH) loc.row--;
        if (direction == Location.SOUTH) loc.row++;
        if (direction == Location.EAST) loc.col++;
        if (direction == Location.WEST) loc.col--;
        setLocation(loc);
	}
	
	public void move(){
		
	}
	
}
