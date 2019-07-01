
/*
package cn.community.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

//@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)        //开启对preAuthorize的支持
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      */
/*  http.authorizeRequests().antMatchers("/login.html").permitAll();

        http.formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .successForwardUrl("/index.html")
                .failureUrl("/404.html");*//*

        */
/*http.headers().frameOptions().disable();        //设置允许加载iframe
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS)   //使用时候控制srssion
                .and()
                .formLogin()
                .loginPage("/login.html")//配置登录页面
                .successForwardUrl("/index.html").permitAll()
                .loginProcessingUrl("/mylogin")
                .failureUrl("/404.html")
                .and()
                .authorizeRequests()
                .antMatchers("/login.html").permitAll() //设置所有的人都可以访问登录的页面
                .anyRequest()
                .authenticated()
                .and().
                csrf().disable();   // 关闭csrf防护*//*

    }

*/
/*    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    }*//*


    @Override
    public void configure(WebSecurity web) throws Exception {
        //解决静态资源被拦截的问题
        web.ignoring().antMatchers("/static/**");

    }

}
*/
