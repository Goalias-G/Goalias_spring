package org.springframework.test.common.event;

import org.springframework.context.ApplicationListener;

/**
 * @author Gws.

 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(this.getClass().getName());
	}
}
