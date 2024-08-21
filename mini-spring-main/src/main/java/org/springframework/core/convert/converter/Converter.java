package org.springframework.core.convert.converter;

/**
 * 类型转换抽象接口
 *
 * @author Gws.
 *   2023/1/10
 */
public interface Converter<S, T> {

	/**
	 * 类型转换
	 */
	T convert(S source);
}
