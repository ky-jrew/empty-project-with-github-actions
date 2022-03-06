package ru.ky.jrew.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/")
    fun helloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello, World!")
    }
}