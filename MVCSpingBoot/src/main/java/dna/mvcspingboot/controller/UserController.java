package dna.mvcspingboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/16 21:17
 */
@RestController
public class UserController {
    @RequestMapping(value = "/user/account")
    public Object queryAccount() {
        return "帐户可用余额：900 元";
    }

    @RequestMapping(value = "/user/verifyRealName")
    public Object verifyRealName(HttpServletRequest request) {
        request.getSession().setAttribute("code",0);
        return "用户实名认证成功";
    }

    @RequestMapping(value = "/user/error")
    public Object error() {
        return "用户没有实名认证";
    }
}
