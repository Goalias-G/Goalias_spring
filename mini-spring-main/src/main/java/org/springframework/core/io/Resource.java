package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源的抽象和访问接口
 *
 * @author Gws.
 *   2023/11/25
 */
public interface Resource {

	InputStream getInputStream() throws IOException;

}
