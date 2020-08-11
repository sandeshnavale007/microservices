//package com.management.education.common;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .headers().disable();
//        http.httpBasic()
//                .and().csrf().disable()
//                .authorizeRequests().antMatchers("/").authenticated()
//                .and()
//                .authorizeRequests().antMatchers("/**").permitAll();
//    }
//
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder authentication)
////            throws Exception {
////        authentication.inMemoryAuthentication()
////                .withUser(encryptionUsername)
////                .password(passwordEncoder().encode(encryptionPassword))
////                .authorities("USER");
////    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
