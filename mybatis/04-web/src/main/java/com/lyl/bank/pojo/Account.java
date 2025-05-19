package com.lyl.bank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *ClassName: Account
 *Package: com.lyl.bank.pojo
 *Description:创建于 2025/5/19 9:35
 *@Author lyl
 *@Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
    //ORM映射涉及到的实体类必须使用引用类型
    private Long id;
    private String actno;
    private Double balance;

}
