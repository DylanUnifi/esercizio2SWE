package test;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

import esercizio2.Component;
import esercizio2.SmartMonitor;

class ObserverProxyTest {

	@Test
	public void observerProxyTest() {
		Component component = new Component();
		component.op();
		component.op(0);
		SmartMonitor smartmonitor = new SmartMonitor();
		component.addObserver(smartmonitor);
		Assert.assertNull(smartmonitor.getState());
		component.op(1);
		Assert.assertEquals(1, (int) smartmonitor.getState());
	}

}
