package com.udemy.backendninja.utils.logs;

import com.udemy.backendninja.component.ComponentExample;
import com.udemy.backendninja.component.RequestTimeInterceptor;
import com.udemy.backendninja.controller.PersonController;
import org.apache.juli.logging.LogFactory;

public class Log {

    public static final org.apache.juli.logging.Log loggerPerson = LogFactory.getLog(PersonController.class);
    public static final org.apache.juli.logging.Log loggerComponentExample = LogFactory.getLog(ComponentExample.class);
    public static final org.apache.juli.logging.Log loggerRequestTimeInterceptor = LogFactory.getLog(RequestTimeInterceptor.class);
}
