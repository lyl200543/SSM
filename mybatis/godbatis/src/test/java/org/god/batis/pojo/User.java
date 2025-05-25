package org.god.batis.pojo;

/**
 *ClassName: User
 *Package: com.god.batis.pojo
 *Description:创建于 2025/5/25 10:34
 *@Author lyl
 *@Version 1.0
 */
public class User {
    private String id;
    private String name;
    private String age;

    public User (String id , String name , String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User () {
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAge () {
        return age;
    }

    public void setAge (String age) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
