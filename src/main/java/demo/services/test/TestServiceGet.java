package demo.services.test;

import demo.entities.Test;

import java.util.List;
import java.util.Optional;

public interface TestServiceGet {
    List<Test> getTests();
    Optional<Test> getTestWithId(Integer id);
    List<Test> getTestsWithBody(String body);
}
