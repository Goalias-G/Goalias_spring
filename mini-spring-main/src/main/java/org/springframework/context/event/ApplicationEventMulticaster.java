package org.springframework.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Gws.

 */
public interface ApplicationEventMulticaster {

	void addApplicationListener(ApplicationListener<?> listener);

	void removeApplicationListener(ApplicationListener<?> listener);

	void multicastEvent(ApplicationEvent event);

}
