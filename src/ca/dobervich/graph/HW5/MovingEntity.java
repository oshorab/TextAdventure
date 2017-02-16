package ca.dobervich.graph.HW5;

import java.util.List;

public abstract class MovingEntity extends Entity{

	public abstract void move();
	
	public void moveRandom() {
		Room neighbor = currentRoom.getRandomNeighbor();
		// move to the neighbor
	}
	
	public void tick() {
		move();
	}
	
	
}
