package org.springframework.aop.framework;

import org.springframework.aop.AdvisedSupport;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Gws.
 *   2023/12/16
 */
public interface AdvisorChainFactory {


	List<Object> getInterceptorsAndDynamicInterceptionAdvice(AdvisedSupport config, Method method, Class<?> targetClass);

}
