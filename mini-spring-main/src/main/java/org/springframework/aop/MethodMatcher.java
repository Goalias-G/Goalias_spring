package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author Gws.
 *   2023/12/5
 */
public interface MethodMatcher {

	boolean matches(Method method, Class<?> targetClass);
}
