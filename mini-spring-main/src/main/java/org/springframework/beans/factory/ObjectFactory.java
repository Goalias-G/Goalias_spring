package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author Gws.

 */
public interface ObjectFactory<T> {

	T getObject() throws BeansException;
}