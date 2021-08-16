package dna.mvcspingboot.config;

import dna.mvcspingboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Author 脱氧核糖
 * @Version 1.0
 * @Date 2021/8/16 20:21
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    //相当于mvc:interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //定义需要拦截的路径
        String[] addPathPatterns = { "/user/**"};
        //定义不需要拦截的路径
        String[] excludePathPatterns = { "/user/error", "/user/verifyRealName"};
        //include exclude
        registry.addInterceptor(new UserInterceptor())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);
    }
}
