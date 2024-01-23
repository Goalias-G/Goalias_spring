package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author Gws.
 *    
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

	void before(Method method, Object[] args, Object target) throws Throwable;
}
