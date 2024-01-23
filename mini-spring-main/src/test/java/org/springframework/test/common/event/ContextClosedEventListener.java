package org.springframework.test.common.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * @author Gws.

 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println(this.getClass().getName());
	}
}
