package Main;
import java.awt.Color;
import java.awt.Graphics;


public class TestCharacter implements Controllable{

	//implement any state fields that you need here
	int xPos, yPos;
	Color c;
	int speed;
	boolean up, down, left, right, buttonA, buttonB;
	
	//write a constructor that accepts initial screen coordinates
	public TestCharacter(int x, int y, Color col){
		xPos = x;
		yPos = y;
		speed = 3;
		c = col;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(xPos-5,  yPos-5,  10,  10);
	}

	@Override
	public void update() {
		if(up) yPos -= speed;
		if(down) yPos += speed;
		if(left) xPos -= speed;
		if(right) xPos += speed; 
	}

	@Override
	public void inputChange(boolean[] keys) {
		up = keys[0];
		down = keys[1];
		left = keys[2];
		right = keys[3];
		buttonA = keys[4];
		buttonB = keys[5];
	}

	
}