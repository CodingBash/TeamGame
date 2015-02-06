import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputAdapter implements MouseListener, KeyListener{

	//An input adapter object acts as the connection between keyboard/mouse and
	//the game objects. It receives the native OS keyboard events, and distributes
	//them to the screen object and the two player objects.
	//ScreenInterface defines the required methods for the screen - for now, just a pause action and a quit action.
	//Controllable defines the methods that players/characters must implement

	ScreenInterface screen;
	Controllable p1, p2;
	
	public InputAdapter(ScreenInterface si,  Controllable c1, Controllable c2){
			screen = si;
			p1 = c1;
			p2 = c2;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()=='Q' || e.getKeyChar()=='q') screen.quit();
		if(e.getKeyChar()=='P' || e.getKeyChar()=='p') screen.pause();
		if(e.getKeyChar()=='W' || e.getKeyChar()=='w') p1.up();
		if(e.getKeyChar()=='A' || e.getKeyChar()=='a') p1.left();
		if(e.getKeyChar()=='S' || e.getKeyChar()=='s') p1.down();
		if(e.getKeyChar()=='D' || e.getKeyChar()=='d') p1.right();
		if(e.getKeyChar()=='O' || e.getKeyChar()=='o') p2.up();
		if(e.getKeyChar()=='K' || e.getKeyChar()=='k') p2.left();
		if(e.getKeyChar()=='L' || e.getKeyChar()=='l') p2.down();
		if(e.getKeyChar()==';' || e.getKeyChar()==':') p2.right();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}
