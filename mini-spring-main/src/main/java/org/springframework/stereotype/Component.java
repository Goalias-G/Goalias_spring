package org.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @author Gws.
 *   2023/12/26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Component {

	String value() default "";
}