package com.example.msa1.controller;

import com.example.msa1.aspect.LogExecutionTime;
import com.example.msa1.domain.Greeting;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@EnableAspectJAutoProxy
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    @LogExecutionTime
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) throws InterruptedException {
        Thread.sleep(1000);
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
