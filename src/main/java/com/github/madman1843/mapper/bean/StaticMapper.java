package com.github.madman1843.mapper.bean;

import lombok.Data;

/**
 * @author madman
 * <p>
 *     表示一个映射规则
 * </p>
 * 2020/6/22 9:08
 */
@Data
public class StaticMapper {
    /**
     * url匹配规则
     */
    private String pattern;
    /**
     * 该匹配规则要映射的资源路径，可以是本地资源和网络资源
     */
    private String[] locations;
}
