package dna.springbootweb.service.impl;

import dna.springbootweb.mapper.StudentMapper;
import dna.springbootweb.model.Student;
import dna.springbootweb.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/12 15:34
 */
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int updateStudentById(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }
}
