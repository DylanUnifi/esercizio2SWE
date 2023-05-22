package test;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

import esercizio2.Component;
import esercizio2.SmartMonitor;

class ObserverProxyTest {
	
	@Test
	public void testObserver() {
		Component component = new Component();
		SmartMonitor smartMonitor = new SmartMonitor();
		component.addObserver(smartMonitor);
		Assert.assertNull(smartMonitor.getState());
		component.op(1);
		Assert.assertNotNull(smartMonitor.getState());
		
	}
	
	@Test
	public void testProxy() {
		SmartMonitor smartMonitor = new SmartMonitor();
		Assert.assertNull(smartMonitor.getState());
		smartMonitor.op();
		Assert.assertNotNull(smartMonitor.getState());
	}

	@Test
	public void testFirstNotificationMonitorCreation() {
		Component component = new Component();
		component.op(0);
		SmartMonitor smartmonitor = new SmartMonitor();
		component.addObserver(smartmonitor);
		Assert.assertNull(smartmonitor.getState());
		component.op(1);
		Assert.assertEquals(1, (int) smartmonitor.getState());
		Assert.assertNotNull(smartmonitor.getState());
	}
}
