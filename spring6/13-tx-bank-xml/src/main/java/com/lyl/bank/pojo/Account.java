package com.lyl.bank.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 *ClassName: Account
 *Package: com.lyl.bank.pojo
 *Description:创建于 2025/6/1 19:35
 *@Author lyl
 *@Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Account {
    private String actno;
    private double balance;
}
