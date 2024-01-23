package org.springframework.aop;

/**
 * @author Gws.
 *    
 */
public interface PointcutAdvisor extends Advisor {

	Pointcut getPointcut();
}
