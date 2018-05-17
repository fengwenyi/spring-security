package com.fengwenyi.demo.springsecurity.start;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Wenyi Feng
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);

        http.authorizeRequests()
                .antMatchers("/").permitAll() // 主目录可以访问
                .anyRequest().authenticated() // 拦截其他请求
                .and()
                .logout().permitAll() // 可以登出
                .and()
                .formLogin(); // 表单提交
        http.csrf().disable(); // 关闭csrf认证
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);

        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
    }
}
