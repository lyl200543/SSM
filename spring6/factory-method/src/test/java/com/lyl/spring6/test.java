package com.lyl.spring6;

import org.junit.Test;

/**
 *ClassName: test
 *Package: com.lyl.spring6
 *Description:创建于 2025/5/29 13:58
 *@Author lyl
 *@Version 1.0
 */
public class test {
    @Test
    public void test () {
        daggerFactory daggerFactory = new daggerFactory();
        weapon dagger = daggerFactory.get();
        dagger.attack();
        gunFactory gunFactory = new gunFactory();
        weapon gun = gunFactory.get();
        gun.attack();
    }
}
