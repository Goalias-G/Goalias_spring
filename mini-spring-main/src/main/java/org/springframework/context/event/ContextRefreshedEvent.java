package org.springframework.context.event;

import org.springframework.context.ApplicationContext;

/**
 * @author Gws.

 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
