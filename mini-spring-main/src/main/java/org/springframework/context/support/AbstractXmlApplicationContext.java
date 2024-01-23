package org.springframework.context.support;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author Gws.

 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

	protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
		String[] configLocations = getConfigLocations();
		if (configLocations != null) {
			beanDefinitionReader.loadBeanDefinitions(configLocations);
		}
	}

	protected abstract String[] getConfigLocations();
}
