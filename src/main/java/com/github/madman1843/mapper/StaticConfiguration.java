package com.github.madman1843.mapper;

import com.github.madman1843.mapper.bean.StaticConfig;
import com.github.madman1843.mapper.bean.StaticMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author madman
 * <p>
 *     静态映射注册
 * </p>
 * 2020/6/22 8:38
 */
@Configuration
@Import(StaticConfig.class)
public class StaticConfiguration implements WebMvcConfigurer {

    @Autowired
    private StaticConfig staticConfig;

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (this.staticConfig.getMappers() != null) {
            for (StaticMapper mapper : this.staticConfig.getMappers()) {
                registry.addResourceHandler(mapper.getPattern())
                        .addResourceLocations(mapper.getLocations());
            }
        } else {
            registry.addResourceHandler("/**")
                    .addResourceLocations(
                            "classpath:/META-INF/resources/",
                            "classpath:/resources/",
                            "classpath:/static/",
                            "classpath:/public/"
                    );
        }
    }
}