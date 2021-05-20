package com.udemy.backendninja.utils.constants;

import com.udemy.backendninja.component.ComponentExample;
import com.udemy.backendninja.controller.PersonController;
import com.udemy.backendninja.service.PersonServiceImpl;
import org.apache.juli.logging.LogFactory;

public class LogConstants {

    public static final org.apache.juli.logging.Log loggerPerson = LogFactory.getLog(PersonController.class);
    public static final org.apache.juli.logging.Log loggerComponentExample = LogFactory.getLog(ComponentExample.class);
    public static final org.apache.juli.logging.Log loggerPersonServiceImpl = LogFactory.getLog(PersonServiceImpl.class);
}
