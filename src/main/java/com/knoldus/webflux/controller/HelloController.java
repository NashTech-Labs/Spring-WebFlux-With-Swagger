package com.knoldus.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * The type Hello controller.
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    /**
     * Hello mono.
     *
     * @param name the name
     * @return the mono
     */
    @GetMapping("/hello")
    public Mono<String> hello(String name) {
        return Mono.just("knoldus");
    }
}
