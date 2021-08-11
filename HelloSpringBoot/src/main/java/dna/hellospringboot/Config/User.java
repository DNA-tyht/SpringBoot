package dna.hellospringboot.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/11 16:34
 */
//将此类交给spring容器管理
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String userName;
    private int age;

    public User() {
    }

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
