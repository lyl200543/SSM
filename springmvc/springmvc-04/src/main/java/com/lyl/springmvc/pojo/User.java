package com.lyl.springmvc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: User
 *Package: com.lyl.springmvc.pojo
 *Description:创建于 2025/7/20 13:34
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String username;
    private String password;
    private Integer sex;
    private String interst;
    private String intro;

}
