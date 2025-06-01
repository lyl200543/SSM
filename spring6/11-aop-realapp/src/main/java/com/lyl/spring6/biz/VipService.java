package com.lyl.spring6.biz;

import org.springframework.stereotype.Service;

/**
 *ClassName: VipService
 *Package: com.lyl.spring6.biz
 *Description:创建于 2025/6/1 17:00
 *@Author lyl
 *@Version 1.0
 */
@Service
public class VipService {
    public void insertVip () {
        System.out.println("新增会员操作...");
    }

    public void deleteVip () {
        System.out.println("删除会员操作...");
    }

    public void updateVip () {
        System.out.println("更新会员操作...");
    }

    public void selectVip () {
        System.out.println("查询会员操作...");
    }

}
