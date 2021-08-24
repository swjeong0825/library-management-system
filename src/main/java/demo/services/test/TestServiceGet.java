package demo.services.test;

import demo.entities.TestEntity;

import java.util.List;
import java.util.Optional;

public interface TestServiceGet {
    List<TestEntity> getTests();
    Optional<TestEntity> getTestWithId(Integer id);
    List<TestEntity> getTestsWithBody(String body);
}
