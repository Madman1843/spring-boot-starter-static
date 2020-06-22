package com.github.madman1843.mapper.annotations;

import com.github.madman1843.mapper.StaticConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author madman
 * <p>
 *     启动注解，在spring boot启动类上加入此注解即可启动该项目
 * </p>
 * 2020/6/22 9:42
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(StaticConfiguration.class)
public @interface EnableStaticMapper {
}
