package Sprites;

/*Things might have to be changed here, this class is a parent of the ImageEntity class.*/
//TODO: Update class throughout the project

public class BaseGameEntity {
	
	// ///////////////////////////////
	// ///////Instance Field//////////
	// ///////////////////////////////
	
	/**
	 * protected boolean alive: if the object (character etc.) is playable or
	 * not
	 */
	protected boolean alive;

	/**
	 * protected int x,y: coordinates of an object
	 */
	protected int x, y;

	/**
	 * protected int dx, dy: velocity of an object
	 */
	protected int dx, dy;

	// ///////////////////////////////
	// ///////Constructor/////////////
	// ///////////////////////////////

	/**
	 * public BaseGameEntity(): constructor for BaseGameEntity class
	 */
	public BaseGameEntity() {
		setAlive(false);
		setX(0); // Change to center
		setY(0); // Change to ground
		setDX(0);
		setDY(0);
	}

	// ///////////////////////////////
	// //////////*GETTERS*////////////
	// ///////////////////////////////
	/**
	 * public boolean isAlive(): returns the alive variable (encapsulation)
	 * 
	 * @return boolean
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * public boolean getX(): returns the x coordinate variable (encapsulation)
	 * 
	 * @return int
	 */
	public int getX() {
		return x;
	}

	/**
	 * public boolean getY(): returns the y coordinate variable (encapsulation)
	 * 
	 * @return int
	 */
	public int getY() {
		return y;
	}

	/**
	 * public boolean getDX(): returns the dx velocity variable (encapsulation)
	 * 
	 * @return int
	 */
	public int getDX() {
		return dx;
	}

	/**
	 * public boolean getDy(): returns the dy velocity variable (encapsulation)
	 * 
	 * @return int
	 */
	public int getDY() {
		return dy;
	}

	// ////////////////////////////////
	// //////////* SETTERS*////////////
	// ////////////////////////////////
	/**
	 * public void setAlive(boolean alive): changes the objects alive variable
	 * from parameter
	 * 
	 * @param alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	/**
	 * public void setAlive(boolean alive): changes the objects x coordinate
	 * variable
	 * 
	 * @param int
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * public void incX(int i): adds the current x value by a parameter
	 * 
	 * @param int
	 */
	public void incX(int i) {
		this.x += i;
	}

	/**
	 * public void setY(int y): changes the objects y coordinate variable
	 * 
	 * @param int
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * public void incY(int i): adds the current y value by a parameter
	 * 
	 * @param int
	 */
	public void incY(int i) {
		this.y += i;
	}

	/**
	 * public void setDX(int dx): changes the current dx value by a parameter
	 * 
	 * @param int
	 */
	public void setDX(int dx) {
		this.dx = dx;
	}

	/**
	 * public void incDX(int dx): adds the current dx value by a parameter
	 * 
	 * @param int
	 */
	public void incDX(int i) {
		this.dx += i;
	}

	/**
	 * public void setDY(int dy): changes the current dy value by a parameter
	 * 
	 * @param int
	 */
	public void setDY(int dy) {
		this.dy = dy;
	}

	/**
	 * public void incDY(int dy): adds the current dy value by a parameter
	 * 
	 * @param int
	 */
	public void incDY(int i) {
		this.dy += i;
	}
}
