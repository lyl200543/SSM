package com.lyl.spring6.proxy;

/**
 *ClassName: weaponFactory
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:36
 * 工厂角色
 *@Author lyl
 *@Version 1.0
 */
public class weaponFactory {
    public static weapon get (String weaponType) {
        String type = weaponType.toUpperCase();
        if ("TANK".equals(type)) {
            return new tank();
        } else if ("FIGHTER".equals(type)) {
            return new fighter();
        } else if ("DAGGER".equals(type)) {
            return new dagger();
        } else {
            throw new RuntimeException("暂不支持该武器的生产！");
        }
    }
}
