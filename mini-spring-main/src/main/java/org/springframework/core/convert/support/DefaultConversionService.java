package org.springframework.core.convert.support;

import org.springframework.core.convert.converter.ConverterRegistry;

/**
 * @author Gws.
 *   2021/1/16
 */
public class DefaultConversionService extends GenericConversionService {

	public DefaultConversionService() {
		addDefaultConverters(this);
	}

	public static void addDefaultConverters(ConverterRegistry converterRegistry) {
		converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
		//TODO 添加其他ConverterFactory
	}
}
