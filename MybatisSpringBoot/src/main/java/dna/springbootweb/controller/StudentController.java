package dna.springbootweb.controller;

import dna.springbootweb.model.Student;
import dna.springbootweb.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/12 15:27
 */
@Controller
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/student")
    @ResponseBody
    public Student student(Integer id) {
        return studentService.queryStudentById(id);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public int update(Integer id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return studentService.updateStudentById(student);
    }
}
