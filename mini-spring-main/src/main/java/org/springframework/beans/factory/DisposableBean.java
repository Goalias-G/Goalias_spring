package org.springframework.beans.factory;

/**
 * @author Gws.

 */
public interface DisposableBean {

	void destroy() throws Exception;
}
