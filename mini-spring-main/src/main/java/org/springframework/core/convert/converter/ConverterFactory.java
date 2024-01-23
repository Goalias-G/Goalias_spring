package org.springframework.core.convert.converter;

/**
 * 类型转换工厂
 *
 * @author Gws.
 *   2021/1/10
 */
public interface ConverterFactory<S, R> {

	<T extends R> Converter<S, T> getConverter(Class<T> targetType);
}