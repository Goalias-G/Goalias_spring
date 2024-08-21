package org.springframework.aop;

/**
 * @author Gws.
 *   2023/12/5
 */
public interface ClassFilter {

	boolean matches(Class<?> clazz);
}
