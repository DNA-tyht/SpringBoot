package dna.mvcspingboot.controller;

import dna.mvcspingboot.model.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/12 15:27
 */
//@Controller
@RestController
public class StudentController {

    @RequestMapping(value = "/student")
    //@ResponseBody
    public Student student(Integer id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }
    //Restful风格
    @RequestMapping(value = "/restful/{id}/{name}")
    public Student restful(@PathVariable Integer id, @PathVariable String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

    @GetMapping(value = "/query")
    public String get() {
        return "@GetMapping注解,通常查询时使用";
    }
    @PostMapping(value = "/add")
    public String add() {
        return "@PostMapping注解，通常新增时使用";
    }
    @PutMapping(value = "/modify")
    public String modify() {
        return "@PutMapping注解，通常更新数据时使用";
    }
    @DeleteMapping(value = "/remove")
    public String remove() {
        return "@DeleteMapping注解，通常删除数据时使用";
    }
}
