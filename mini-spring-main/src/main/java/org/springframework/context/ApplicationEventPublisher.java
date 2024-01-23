package org.springframework.context;

/**
 * 事件发布者接口
 *
 * @author Gws.

 */
public interface ApplicationEventPublisher {

	/**
	 * 发布事件
	 *
	 * @param event
	 */
	void publishEvent(ApplicationEvent event);
}
