package org.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanException;
import org.springframework.beans.BeansException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * 读取bean定义信息即BeanDefinition的接口
 *
 * @author Gws.

 */
public interface BeanDefinitionReader {

	BeanDefinitionRegistry getRegistry();

	ResourceLoader getResourceLoader();

	void loadBeanDefinitions(Resource resource) throws BeansException;

	void loadBeanDefinitions(String location) throws BeansException;

	void loadBeanDefinitions(String[] locations) throws BeansException;
}
