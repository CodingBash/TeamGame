package GameStates;
import java.awt.Graphics;
import java.util.ArrayList;

/*Since "Controllable" is in different package, the dot operator 
is used to access the "Main" package location. */
import Main.Controllable; 

//TODO Finish GameStateManager

public class GameStateManager implements Controllable{

	private ArrayList<GameState> gameStates;
	protected int currentState;
	
	//When a "XyxyState" is created, add its index here//
	public static final int MENUSTATE = 0; //This is the index in array for the "menu state"
	public static final int GAMESTATE = 1; //This is the index in array for the "level state"
	
	public GameStateManager() {
		gameStates = new ArrayList<GameState>();
		currentState = 0;
		gameStates.add(new MenuState(this)); //MenuState will have to be created
		
	}
	
	/**
	 * setState()
	 * -Sets the currentState to the recieved state
	 * @param state
	 */
	public void setState(int state) {
		currentState = state;
		gameStates.get(currentState).init();
	}
	

	public void paint(Graphics g) {
		gameStates.get(currentState).draw(g);
		
	}
	@Override
	public void update() {
		gameStates.get(currentState).update();
		
	}
	
	public void inputChange(boolean[] keys) {
		//TODO Adjust here or in the separate GameState classes
	}
	
	//The key methods below might be updated.
	public void keyPressed(int k){
		gameStates.get(currentState).keyPressed(k);
	}
	public void keyReleased(int k){
		gameStates.get(currentState).keyPressed(k);
	}
}
