package org.springframework.beans.factory;

/**
 * @author Gws.

 */
public interface InitializingBean {

	void afterPropertiesSet() throws Exception;
}
