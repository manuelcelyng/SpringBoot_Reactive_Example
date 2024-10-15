package com.celyn.reactive.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    // Save Method
    public Mono<Student> save(Student student) {
        return repository.save(student);
    }

    // Find All Method
    public Flux<Student> findAll() {
        return repository.findAll()
                .delayElements(Duration.ofSeconds(1));
    }


    // Find BY id Method
    public Mono<Student> findById(Integer id) {
        return repository.findById(id);
    }


}
