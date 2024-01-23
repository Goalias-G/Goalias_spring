package org.springframework.context;

import java.util.EventObject;

/**
 * @author Gws.

 */
public abstract class ApplicationEvent extends EventObject {

	public ApplicationEvent(Object source) {
		super(source);
	}
}
