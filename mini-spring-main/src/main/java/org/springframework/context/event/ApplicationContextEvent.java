package org.springframework.context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @author Gws.

 */
public abstract class ApplicationContextEvent extends ApplicationEvent {

	public ApplicationContextEvent(ApplicationContext source) {
		super(source);
	}

	public final ApplicationContext getApplicationContext() {
		return (ApplicationContext) getSource();
	}
}
