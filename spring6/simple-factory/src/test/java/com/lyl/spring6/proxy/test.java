package com.lyl.spring6.proxy;

import org.junit.Test;

/**
 *ClassName: test
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:39
 *@Author lyl
 *@Version 1.0
 */
public class test {
    @Test
    public void test1 () {
        weapon tank = weaponFactory.get("Tank");
        tank.attack();
        weapon fighter = weaponFactory.get("fighter");
        fighter.attack();
        weapon dragger = weaponFactory.get("DAGGER");
        dragger.attack();
        weapon weapon = weaponFactory.get("123");
        weapon.attack();
    }
}
