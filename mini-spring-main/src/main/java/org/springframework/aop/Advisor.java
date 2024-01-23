package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author Gws.
 *    
 */
public interface Advisor {

	Advice getAdvice();

}
