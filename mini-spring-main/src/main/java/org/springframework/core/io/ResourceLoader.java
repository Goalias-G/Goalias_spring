package org.springframework.core.io;

/**
 * 资源加载器接口
 *
 * @author Gws.
 *   2020/11/25
 */
public interface ResourceLoader {

	Resource getResource(String location);
}
