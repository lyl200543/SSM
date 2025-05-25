package org.god.batis.utils;

import java.io.InputStream;

/**
 *ClassName: Resources
 *Package: org.god.batis.utils
 *Description:创建于 2025/5/24 20:17
 *@Author lyl
 *@Version 1.0
 */
public class Resources {
    private Resources () {

    }

    public static InputStream getResourceAsStream (String name) {
        return ClassLoader.getSystemClassLoader().getResourceAsStream(name);
    }
}
