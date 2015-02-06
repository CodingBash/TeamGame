import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel implements ScreenInterface {

	// declare fields here
	int height;
	int width;
	boolean pause, quit;
	Controllable player1, player2;

	public Panel() {
		height = 600;
		width = 800;
		pause = false;
		quit = false;
		setPreferredSize(new Dimension(width, height));
		setBackground(Color.BLACK);
		InputAdapter ia = new InputAdapter(this, player1, player2);
		addMouseListener(ia);
		addKeyListener(ia);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	public void run() {
		while (!quit) {
			if (!pause)
				repaint();
			// TODO Convert timing method to use Swing timer instead of delay()
			delay(50);
		}
	}

	public void delay(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public void pause() {
		pause = !pause;
	}

	@Override
	public void quit() {
		quit = true;
	}

}