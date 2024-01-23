package org.springframework.beans.factory;

/**
 * @author Gws.

 */
public interface FactoryBean<T> {

	T getObject() throws Exception;

	boolean isSingleton();
}
