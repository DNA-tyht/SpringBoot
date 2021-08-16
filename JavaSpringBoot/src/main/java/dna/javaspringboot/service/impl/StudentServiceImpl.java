package dna.javaspringboot.service.impl;

import dna.javaspringboot.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/16 15:01
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public String sayHello() {
        return "Hello";
    }
}
