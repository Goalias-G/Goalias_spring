package org.springframework.aop;


/**
 * 切点抽象
 *
 * @author Gws.
 *   2020/12/5
 */
public interface Pointcut {

	ClassFilter getClassFilter();

	MethodMatcher getMethodMatcher();
}
