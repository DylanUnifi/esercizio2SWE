package esercizio2;

public class Component extends Observable {
	private int state;
	
	public int getState() {
		return state;
	}
	
	protected void setState(int s) {
		state = s;
		notifyObservers();
	}
	
	public void op(int s) {
		this.setState(s);
	}
}
