package esercizio2;

public class SmartMonitor implements Observer, AbtractMonitor {
	
	private Monitor monitor;
	private boolean firstCall = false;
	

	@Override
	public void op() {
		System.out.println("Operazione eseguita dal SmartMonitor!");
	}

	@Override
	public void update(Observable o) {
		if(!firstCall) {
			firstCall = true;
			System.out.println("Crea l'oggetto Monitor!");
			monitor = new Monitor();
		}
		monitor.setState(o.getState());
	}
	
	public Integer getState() {
		System.out.println("Recupero lo stato se presente!");
		if(monitor != null) {
			return (Integer) monitor.getState();
		}
		return null;
	}
}
