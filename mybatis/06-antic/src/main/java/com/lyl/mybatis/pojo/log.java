package com.lyl.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: log
 *Package: com.lyl.mybatis.pojo
 *Description:创建于 2025/5/20 20:12
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class log {
    private Integer id;
    private String log;
    private String time;
}
