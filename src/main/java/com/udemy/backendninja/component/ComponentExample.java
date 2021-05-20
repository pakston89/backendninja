package com.udemy.backendninja.component;

import org.springframework.stereotype.Component;

import static com.udemy.backendninja.utils.constants.LogConstants.loggerComponentExample;

@Component("ComponentExample")
public class ComponentExample {

    public void sayHello(){
        loggerComponentExample.info("Hello from ComponentExample");
    }
}
