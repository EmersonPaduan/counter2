package br.paduan.counter.repository;

import org.springframework.data.repository.CrudRepository;

import br.paduan.counter.model.Counter;

public interface CounterRepo extends CrudRepository<Counter, Integer> {
    
}
