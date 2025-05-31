package com.lyl.spring6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: User
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/31 15:24
 *@Author lyl
 *@Version 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Integer id;
    private String realName;
    private Integer age;

}
