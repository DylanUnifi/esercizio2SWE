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
	
	public void op() {
		System.out.println("Operazione che non modifica lo stato");
	}
	
	public void op(int s) {
		System.out.println("Operazione che apporta una modifica dello stato");
		this.setState(s);
	}
}
