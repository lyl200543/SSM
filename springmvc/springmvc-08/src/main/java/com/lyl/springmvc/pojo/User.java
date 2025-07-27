package com.lyl.springmvc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: User
 *Package: com.lyl.springmvc.pojo
 *Description:创建于 2025/7/27 18:00
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String username;
    private String password;
}
