package demo.servicesImpl.test;

import demo.entities.TestEntity;
import demo.repositories.TestRepository;
import demo.services.test.TestServiceGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TestServiceGetImpl implements TestServiceGet {

    private final TestRepository testRepository;

    @Autowired
    public TestServiceGetImpl(TestRepository testRepository){
        this.testRepository = testRepository;
    }

//    @Override
//    public List<testEntity> getTests() {
//        //iterable to list
//        return StreamSupport.stream(testRepository.findAll().spliterator(), false).collect(Collectors.toList());
//    }

    @Override
    public List<TestEntity> getTests() {
        //iterable to list
        return StreamSupport.stream(testRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Optional<TestEntity> getTestWithId(Integer id) {
        return testRepository.findById(id);
    }

    //todo: finish implementing this
    @Override
    public List<TestEntity> getTestsWithBody(String body) {
        return StreamSupport.stream(testRepository.findByBody(body).spliterator(), false).collect(Collectors.toList());
    }
}
