package com.lyl.usermgt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: User
 *Package: com.lyl.usermgt.pojo
 *Description:创建于 2025/7/26 17:38
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String name;
    private String email;
    private Integer sex;
}
