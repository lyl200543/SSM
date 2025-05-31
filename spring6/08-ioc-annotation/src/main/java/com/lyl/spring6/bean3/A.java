package com.lyl.spring6.bean3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *ClassName: A
 *Package: com.lyl.spring6.bean3
 *Description:创建于 2025/5/31 10:07
 *@Author lyl
 *@Version 1.0
 */
@Component
public class A {
    public A () {
        System.out.println("类A的构造器被调用");
    }
}

@Controller
class B {
    public B () {
        System.out.println("类B的构造器被调用");
    }
}

@Service
class C {
    public C () {
        System.out.println("类C的构造器被调用");
    }
}

@Repository
class D {
    public D () {
        System.out.println("类D的构造器被调用");
    }
}

@Controller
class E {
    public E () {
        System.out.println("类E的构造器被调用");
    }
}
