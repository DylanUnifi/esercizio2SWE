package esercizio2;

public class SmartMonitor implements Observer, AbtractMonitor {
	
	private Monitor monitor;
	private boolean firstCall = false;
	

	@Override
	public void op() {
		if(firstCall) {
			monitor.op();
		}else {
			firstCall = true;
			monitor = new Monitor();
			monitor.op();
		}
	}

	@Override
	public void update(Observable o) {
		if(!firstCall) {
			firstCall = true;
			monitor = new Monitor();
		}
		monitor.setState(((Component)o).getState());
	}
	
	public Integer getState() {
		if(monitor != null) {
			return (Integer) monitor.getState();
		}
		return null;
	}
}
