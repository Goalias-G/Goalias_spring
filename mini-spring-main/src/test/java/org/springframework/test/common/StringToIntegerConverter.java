package org.springframework.test.common;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Gws.

 */
public class StringToIntegerConverter implements Converter<String, Integer> {
	@Override
	public Integer convert(String source) {
		return Integer.valueOf(source);
	}
}
