package dna.hellospringboot.Controller;

import dna.hellospringboot.Config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/11 15:36
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello SpringBoot" + userName + age;
    }

    @RequestMapping(value = "/mapValue")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("message", "SpringBoot Project");
        return retMap; //将Map转化为Json
    }

    //直接使用核心配置自定义属性
    @Value("${user.name}")
    private String userName;
    @Value("${user.age}")
    private int age;

    @Autowired
    private User user;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String user() {
        return user.getUserName() + " " + user.getAge();
    }

    @RequestMapping(value = "/jsp")
    @ResponseBody
    public ModelAndView jsp() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello SpringBoot");
        mv.setViewName("jsp");
        return mv;
    }
}
