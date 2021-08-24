package demo.repositories;

import demo.entities.TestEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Integer> {

    Iterable<TestEntity> findByBody(String body);
}

