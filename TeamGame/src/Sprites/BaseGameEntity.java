package Sprites;

public class BaseGameEntity {

	protected boolean alive;
	// x,y are the coordinates of the object
	protected int x, y;
	// dx,dy are the velocity values
	protected int dx, dy;

	// y and dy should stay constant since sprites will only move side to side
	// unless further changed

	public boolean isAlive() {
		return alive;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDX() {
		return dx;
	}

	public int getDY() {
		return dy;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void incX(int i) {
		this.x += i;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void incY(int i) {
		this.y += i;
	}

	public void setDX(int dx) {
		this.dx = dx;
	}

	public void incDX(int i) {
		this.dx += i;
	}

	public void setDY(int dy) {
		this.dy = dy;
	}

	public void incDY(int i) {
		this.dy += i;
	}

	public BaseGameEntity() {
		setAlive(false);
		setX(0); //Change to center 
		setY(0); //Change to ground
		setDX(0);
		setDY(0);
	}

}
