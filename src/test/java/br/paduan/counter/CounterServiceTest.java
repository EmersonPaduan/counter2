package br.paduan.counter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.paduan.counter.service.CounterService;

@SpringBootTest
public class CounterServiceTest {

    @Autowired
    private CounterService service;

    @Test
    void counterStartFrom1() {
        Assertions.assertTrue(service.getCounter() >= 0);
    }
}
