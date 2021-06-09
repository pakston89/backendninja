package com.udemy.backendninja.service;

import com.udemy.backendninja.model.Person;
import com.udemy.backendninja.utils.constants.LogConstants;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service ("personServiceImpl")
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getListPeople() {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Tono", 68));
        people.add(new Person("Julia", 69));
        people.add(new Person("Maria", 30));
        people.add(new Person("Emili", 27));
        LogConstants.loggerPersonServiceImpl.info("Hello from Service!");
        return people;
    }
}
