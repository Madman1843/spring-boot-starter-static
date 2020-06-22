package com.github.madman1843.mapper.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author madman
 * <p>
 *     映射配置文件，读取映射规则
 * </p>
 * 2020/4/24 22:29
 */
@Data
@Configuration
@ConfigurationProperties("spring.static")
public class StaticConfig {
    private List<StaticMapper> mappers;
}
