package cn.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
        //浏览器发送 /atguigu 请求来到 success
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/register").setViewName("hower_register");
        registry.addViewController("/applyCarPort").setViewName("applyCarPort");
        registry.addViewController("/newsaddPage").setViewName("newsadd");

        registry.addViewController("/staffaddPage").setViewName("StaffAdd");

    }
}
