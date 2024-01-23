package org.springframework.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;

/**
 * 实现该接口，能感知所属ApplicationContext
 *
 * @author Gws.

 */
public interface ApplicationContextAware extends Aware {

	void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
