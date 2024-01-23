package org.springframework.test.common.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @author Gws.

 */
public class CustomEvent extends ApplicationContextEvent {

	public CustomEvent(ApplicationContext source) {
		super(source);
	}
}
