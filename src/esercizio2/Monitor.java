package esercizio2;

public class Monitor implements AbtractMonitor {
	private int xState;
	
	public void setState(int state) {
		xState = state;
	}
	
	public int getState() {
		return xState;
	}

	@Override
	public void op() {
		System.out.println("Monitor esegue una operazione!");
	}

}
