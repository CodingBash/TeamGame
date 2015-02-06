import java.awt.Graphics;

public interface Controllable {

	//paint is called once per frame
	public void paint(Graphics g);
	
	//update is called once per frame
	//it should update character state and exit
	//as quickly as possible.
	public void update();
	
	//The following six methods are called from the InputAdapter
	//They should initiate a change in state (if appropriate) and
	//then exit quickly
	public void up();
	
	public void down();
	
	public void left();
	
	public void right();
	
	public void buttonA();
	
	public void buttonB();
	
}
