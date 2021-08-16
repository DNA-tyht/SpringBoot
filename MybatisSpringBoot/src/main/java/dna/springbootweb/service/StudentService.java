package dna.springbootweb.service;

import dna.springbootweb.model.Student;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/12 15:31
 */
public interface StudentService {

    Student queryStudentById(Integer id);

    int updateStudentById(Student student);
}
