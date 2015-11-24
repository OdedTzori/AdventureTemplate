public class Entity {
	protected Location loc;
	protected Room currentRoom;
	
	public Entity(Room r) {
		this(r, r.getRandomEmptyLoc() );
	}
	
	public Entity(Room r, Location loc) {
		this.currentRoom = r;
		setLocation(loc);
	}
	
	public void setLocation(Location newLoc) {
		int num = currentRoom.get(loc.row, loc.col);
		if(this.loc != null && currentRoom.isInRoom(loc))
			currentRoom.put(loc.row, loc.col, Game.EMPTY);
		
		this.loc = new Location(newLoc.row, newLoc.col);
		currentRoom.put(newLoc.row, newLoc.col, num);
	}
	
	public Room getRoom(){
		return currentRoom;
	}
	
	public void setRoom(Room r){
		currentRoom = r;
	}
	
	public Location getLocation(){
		return loc;
	}
	
}
