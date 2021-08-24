package demo.controllers;

import demo.entities.TestEntity;
import demo.services.test.TestServiceGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    private final TestServiceGet testServiceGet;

    @Autowired
    public testController(TestServiceGet testServiceGet){
        this.testServiceGet = testServiceGet;
    }

    @GetMapping(value = "/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value ="/test")
    List<TestEntity> getAllTests(){
        return testServiceGet.getTests();
//        return 1;
    }
}
