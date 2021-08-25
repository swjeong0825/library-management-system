package demo.repositories;

import demo.entities.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Integer> {

    Iterable<Test> findByBody(String body);
}

