package com.udemy.backendninja.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class ModelAndViewBean {

    @Bean
    public ModelAndView modelAndView(){
        return new ModelAndView();
    }
}
