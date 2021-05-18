package com.udemy.backendninja.controller;

import com.udemy.backendninja.component.ComponentExample;
import com.udemy.backendninja.model.Person;
import com.udemy.backendninja.utils.constants.ViewConstants;
import com.udemy.backendninja.utils.logs.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private ModelAndView modelAndView;

    @Autowired
    @Qualifier("ComponentExample")
    private ComponentExample componentExample;

    @GetMapping("/getpeopleMAV")
    public ModelAndView getPeopleMAV(){
        modelAndView.setViewName(ViewConstants.PEOPLE_VIEW);
        modelAndView.addObject("people", getPeople());
        return modelAndView;
    }

    private List<Person> getPeople(){
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Tono", 68));
        people.add(new Person("Julia", 69));
        people.add(new Person("Maria", 30));
        people.add(new Person("Gemma", 28));
        people.add(new Person("Raul", 27));
        return people;
    }

    //Dos formas de recibir peticiones GET (@RequestParam vs @PathVariable)
    @GetMapping("/requestparamMAV1")
    public ModelAndView requestMAV1(@RequestParam(required = false, defaultValue = "Person") String name){
        modelAndView.setViewName(ViewConstants.REQUESTGET_VIEW);
        modelAndView.addObject("nameModel", name);
        return modelAndView;
    }

    @GetMapping("/pathvariable/{name}")
    public ModelAndView requestMAV2(@PathVariable("name") String name){
        modelAndView.setViewName(ViewConstants.REQUESTGET_VIEW);
        modelAndView.addObject("nameModel", name);
        return modelAndView;
    }

    //Mostramos formulario y devolvemos resultado del POST
    @GetMapping("/form")
    public ModelAndView formView(){
        modelAndView.setViewName(ViewConstants.FORM_VIEW);
        modelAndView.addObject("person", new Person());
        return modelAndView;
    }

    @PostMapping("/addperson")
    public ModelAndView addPerson(@ModelAttribute("person") Person person) {
        Log.loggerPerson.info("Method: addPerson -- Params: " + person);
        modelAndView.setViewName(ViewConstants.RESULT_VIEW);
        modelAndView.addObject("person", person);
        return modelAndView;
    }

    @GetMapping("/getComponent")
    public void getComponent(){
        componentExample.sayHello();
    }

    @GetMapping("/")
    public RedirectView redirectViewToForm() {
        return new RedirectView("/person/form");
    }
}
